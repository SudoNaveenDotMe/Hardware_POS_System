package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import lk.ijse.athukorala_hardware.App;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML
    public TextField usernameField;
    @FXML
    public PasswordField passwordField;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void loginOnAction(ActionEvent actionEvent) throws IOException {
        String realUsername = "Naveen";
        String realPassword = "Naveen123";

        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.equals(realUsername) && password.equals(realPassword)) {
            System.out.println("Login successful");
            App.setRoot("Dashboard");

        } else {
            System.out.println("Login failed");
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Login Massage");
            alert.setHeaderText("Login failed");
            alert.show();
        }

    }

    @FXML
    public void resetOnAction(ActionEvent actionEvent) {
        usernameField.clear();
        passwordField.clear();
    }

    @FXML

    public void forgotPasswordOnAction(ActionEvent actionEvent) {

    }
}
