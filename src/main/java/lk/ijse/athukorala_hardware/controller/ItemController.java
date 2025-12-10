package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class ItemController implements Initializable {

    public TextField itemCodeField;
    public TextField itemNameField;
    public TextField itemPriceField;
    public TextField itemQtyField;

    public TableView tblItems;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colPrice;
    public TableColumn colQty;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("Item Controller");
    }

    public void itemSaveOnAction(ActionEvent actionEvent) {
    }

    public void itemUpdateOnAction(ActionEvent actionEvent) {
    }

    public void itemDeleteOnAction(ActionEvent actionEvent) {
    }

    public void clearOnAction(ActionEvent actionEvent) {
    }

    public void SearchItemOnAction(KeyEvent keyEvent) {
    }
}
