package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class DriverController implements Initializable {
    public TextField driverIdField;
    public TextField driverNameField;
    public TextField driverContactField;
    public TextField driverAddressField;
    public TableView tblDrivers;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colPrice;
    public TableColumn colQty;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void SearchDriverOnAction(KeyEvent keyEvent) {
    }

    public void driverSaveOnAction(ActionEvent actionEvent) {
    }

    public void driverUpdateOnAction(ActionEvent actionEvent) {
    }

    public void driverDeleteOnAction(ActionEvent actionEvent) {
    }

    public void clearOnAction(ActionEvent actionEvent) {
    }


}
