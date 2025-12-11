package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class SupplierController implements Initializable {
    public TextField nameField;
    public TextField idField;
    public TextField contactField;
    public TextField emailField;
    public TextField addressField;

    public TableView tblCustomer;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colEmail;
    public TableColumn colContact;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void searchSupplierOnAction(KeyEvent keyEvent) {
    }

    public void saveSupplierOnAction(ActionEvent actionEvent) {
    }

    public void updateSupplierOnAction(ActionEvent actionEvent) {
    }

    public void deleteSupplierOnAction(ActionEvent actionEvent) {
    }

    public void clearFields(ActionEvent actionEvent) {
    }
}
