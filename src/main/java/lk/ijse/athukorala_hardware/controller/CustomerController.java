package lk.ijse.athukorala_hardware.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
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

    private final CustomerModel customerModel = new CustomerModel();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*System.out.println("CustomerFXML loaded");

        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));

        loadCustomerTableOnAction();*/
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

    /*
    @FXML
    private void loadCustomerTableOnAction() {
        try {
            List<CustomerDTO> customerList = customerModel.getCustomers();
            ObservableList<CustomerDTO> obList = FXCollections.observableArrayList();

            obList.addAll(customerList);
            tblCustomer.setItems(obList);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }*/

    @FXML
    public void clearFields(ActionEvent actionEvent) {
    }
}
