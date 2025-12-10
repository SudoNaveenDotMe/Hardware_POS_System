package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.athukorala_hardware.App;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements Initializable {

    @FXML
    public AnchorPane mainContent;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    public void customerOnAction() throws IOException {
        Parent customerFXML = App.loadFXML("Customer");
        mainContent.getChildren().setAll(customerFXML);
    }

    @FXML
    public void itemOnAction(ActionEvent actionEvent) throws IOException {
        Parent itemFXML = App.loadFXML("Item");
        mainContent.getChildren().setAll(itemFXML);
    }

    @FXML
    public void driverOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void supplierOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void orderOnAction(ActionEvent actionEvent) {
    }

    @FXML
    public void logoutOnAction(ActionEvent actionEvent) {
    }
}
