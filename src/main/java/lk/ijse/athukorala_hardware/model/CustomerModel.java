package lk.ijse.athukorala_hardware.model;

import lk.ijse.athukorala_hardware.db.DBConnection;
import lk.ijse.athukorala_hardware.dto.CustomerDTO;
import lk.ijse.athukorala_hardware.util.CrudUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerModel {
    public boolean saveCustomer(CustomerDTO customerDTO) throws SQLException {
        boolean result = CrudUtil.execute(
                "INSERT INTO customer (name,contact,address,email) VALUES(?,?,?,?)",
                customerDTO.getName(),
                customerDTO.getContact(),
                customerDTO.getAddress(),
                customerDTO.getEmail()
        );

        return result;
    }

    public boolean updateCustomer(CustomerDTO customerDTO) throws SQLException {
        boolean result = CrudUtil.execute(
                "UPDATE customer SET name =? , contact=?, address = ?, email=? WHERE id LIKE ?",
                customerDTO.getName(),
                customerDTO.getContact(),
                customerDTO.getAddress(),
                customerDTO.getEmail(),
                customerDTO.getId()
        );

        return result;
    }

    public boolean deleteCustomer(String id) throws SQLException {
        boolean result = CrudUtil.execute(
                "DELETE FROM customer WHERE id LIKE ?",
                id
        );

        return result;

    }

    public CustomerDTO searchCustomer(String id) throws SQLException {
        ResultSet result = CrudUtil.execute("SELECT * FROM customer WHERE id LIKE ?", id);

        if (result.next()) {
            int cusId = result.getInt("id");
            String name = result.getString("name");
            String address = result.getString("address");
            String email = result.getString("email");
            String contact = result.getString("contact");

            return new CustomerDTO(cusId,name,contact,address,email);
        }
        return null;
    }

    public List<CustomerDTO> getCustomers() throws SQLException {
        Connection conn = DBConnection.getInstance().getConnection();
        String sql = "SELECT * FROM customer";

        PreparedStatement ptsm = conn.prepareStatement(sql);
        ResultSet resultSet = ptsm.executeQuery();

        List<CustomerDTO> customerDTOList = new ArrayList<>();

        while (resultSet.next()) {
            CustomerDTO customerDTO = new CustomerDTO(
                    resultSet.getInt("id"),
                    resultSet.getString("name"),
                    resultSet.getString("address"),
                    resultSet.getString("email"),
                    resultSet.getString("contact")


            );
            customerDTOList.add(customerDTO);
        }
        return customerDTOList;
    }
}
