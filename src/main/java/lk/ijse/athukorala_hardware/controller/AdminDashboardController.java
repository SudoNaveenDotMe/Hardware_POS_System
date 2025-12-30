package lk.ijse.athukorala_hardware.controller;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;
import lk.ijse.athukorala_hardware.App;

import java.io.IOException;

public class AdminDashboardController {
    public AnchorPane mainContent;

    public void customerOnAction(ActionEvent actionEvent) {

    }

    public void itemOnAction(ActionEvent actionEvent) {
    }

    public void driverOnAction(ActionEvent actionEvent) {
    }

    public void supplierOnAction(ActionEvent actionEvent) {
    }

    public void orderOnAction(ActionEvent actionEvent) {
    }

    public void reportOnAction(ActionEvent actionEvent) {
    }

    public void userOnAction(ActionEvent actionEvent) {
    }

    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        App.setRoot("Login");
    }
}
