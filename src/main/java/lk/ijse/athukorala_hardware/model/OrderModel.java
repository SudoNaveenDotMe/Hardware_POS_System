package lk.ijse.athukorala_hardware.model;

import lk.ijse.athukorala_hardware.db.DBConnection;
import lk.ijse.athukorala_hardware.dto.OrderDTO;
import lk.ijse.athukorala_hardware.util.CrudUtil;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;

public class OrderModel {
    private final OrderItemModel orderItemModel = new OrderItemModel();

    public boolean placeOrder(OrderDTO orderDTO) throws SQLException {
        Connection conn = DBConnection.getInstance().getConnection();

        try {
            conn.setAutoCommit(false);

            boolean result = CrudUtil.execute("INSERT INTO `order` (order_date, customer_id) VALUES (?,?)",
                    orderDTO.getOrderDate(),
                    orderDTO.getCustomerId()
            );

            if (result) {
                ResultSet rs = CrudUtil.execute(
                        "SELECT order_id FROM `order` ORDER BY order_id DESC LIMIT 1"
                );

                if (rs.next()) {
                    int latestId = rs.getInt("order_id");
                    orderItemModel.saveOrderItems(latestId, orderDTO.getOrderItems());

                    printOrderInvoice(latestId);
                } else {
                    throw new Exception("Something went wrong Finding order!!");
                }
            } else {
                throw new Exception("Something went wrong when when inserting order!!");
            }

            conn.commit();
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            conn.setAutoCommit(true);
        }
    }

    public void printOrderInvoice(int orderId) throws SQLException, JRException {
        Connection conn = DBConnection.getInstance().getConnection();

        InputStream reportObject = getClass().getResourceAsStream("/lk/ijse/athukorala_hardware/reports/Hardaware_Invoice.jrxml");

        JasperReport jr = JasperCompileManager.compileReport(reportObject);

        HashMap<String,Object> parems = new HashMap<>();
        parems.put("ORDER_ID",orderId);

        JasperPrint jp = JasperFillManager.fillReport(jr, parems, conn);

        JasperViewer.viewReport(jp,false);
    }

}
