package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {
    @FXML
    public TextField emailField;
    @FXML
    public TextField idField;
    @FXML
    public TextField nameField;
    @FXML
    public TextField contactField;
    @FXML
    public TextArea addressField;

    @FXML
    public TableView tblCustomer;
    @FXML
    public TableColumn colId;
    @FXML
    public TableColumn colName;
    @FXML
    public TableColumn colContact;
    @FXML
    public TableColumn colEmail;
    @FXML
    public TableColumn colAddress;

    public AnchorPane customerContent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void searchCustomerOnAction(KeyEvent keyEvent) {
    }

    @FXML
    public void saveCustomerOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void updateCustomerOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void deleteCustomerOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void clearFields(ActionEvent actionEvent) {
    }

    @FXML
    public void goBack(ActionEvent actionEvent) {
    }
}
