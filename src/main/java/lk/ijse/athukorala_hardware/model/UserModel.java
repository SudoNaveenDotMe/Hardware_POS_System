package lk.ijse.athukorala_hardware.model;

import lk.ijse.athukorala_hardware.dto.UserDTO;
import lk.ijse.athukorala_hardware.util.CrudUtil;

import java.sql.SQLException;
import java.sql.ResultSet;


public class UserModel {
    public UserDTO searchUser(String email) throws SQLException {
        String sql = "SELECT * FROM users WHERE email LIKE ?";
        ResultSet resultSet = CrudUtil.execute(sql, email);

        if (resultSet.next()){
            int id = resultSet.getInt("u_id");
            String name = resultSet.getString("name");
            String userEmail = resultSet.getString("email");
            String password = resultSet.getString("password");

            return new UserDTO(id,name,userEmail,password);
        }
        return null;
    }
}
