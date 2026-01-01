package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.athukorala_hardware.App;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AdminDashboardController implements Initializable {
    public AnchorPane mainContent;

    public void customerOnAction(ActionEvent actionEvent) throws IOException {
        Parent customerFXML = App.loadFXML("Customer");
        mainContent.getChildren().setAll(customerFXML);
    }

    public void itemOnAction(ActionEvent actionEvent) throws IOException {
        Parent itemFXML = App.loadFXML("Item");
        mainContent.getChildren().setAll(itemFXML);
    }

    public void driverOnAction(ActionEvent actionEvent) throws IOException {
        Parent driverFXML = App.loadFXML("Driver");
        mainContent.getChildren().setAll(driverFXML);
    }

    public void supplierOnAction(ActionEvent actionEvent) throws IOException {
        Parent supplierFXML = App.loadFXML("Supplier");
        mainContent.getChildren().setAll(supplierFXML);
    }

    public void orderOnAction(ActionEvent actionEvent) throws IOException {
        Parent orderFXML = App.loadFXML("Order");
        mainContent.getChildren().setAll(orderFXML);
    }

    public void reportOnAction(ActionEvent actionEvent) {
    }

    public void userOnAction(ActionEvent actionEvent) {

    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        App.setRoot("Login");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
