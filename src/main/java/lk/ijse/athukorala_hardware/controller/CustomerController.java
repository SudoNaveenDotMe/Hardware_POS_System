package lk.ijse.athukorala_hardware.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.athukorala_hardware.dto.CustomerDTO;
import lk.ijse.athukorala_hardware.model.CustomerModel;

import java.net.URL;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class CustomerController implements Initializable {
    private final CustomerModel customerModel = new CustomerModel();
    @FXML
    public TextField emailField;
    @FXML
    public TextField idField;
    @FXML
    public TextField nameField;
    @FXML
    public TextField contactField;
    @FXML
    public TextField addressField;
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
    public void clearFields() {
    }
}
