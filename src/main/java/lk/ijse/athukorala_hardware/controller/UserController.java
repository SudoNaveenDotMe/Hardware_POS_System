package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class UserController implements Initializable {
    public AnchorPane userContent;
    public TextField idField;
    public TextField nameField;
    public TextField emailField;
    public TextField passwordField;
    public ComboBox cmbRole;
    public Button btnSave;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void saveUserOnAction(ActionEvent actionEvent) {
    }

    public void updateUserOnAction(ActionEvent actionEvent) {
    }

    public void deleteUserOnAction(ActionEvent actionEvent) {
    }

    public void printUserOnAction(ActionEvent actionEvent) {
    }

    public void clearFields(ActionEvent actionEvent) {
    }


}
