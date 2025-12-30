package lk.ijse.athukorala_hardware.model;

import lk.ijse.athukorala_hardware.db.DBConnection;
import lk.ijse.athukorala_hardware.dto.OrderDTO;
import lk.ijse.athukorala_hardware.util.CrudUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

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
}
