module lk.ijse.athukorala_hardware.athukorala_hardware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires mysql.connector.j;


    opens lk.ijse.athukorala_hardware to javafx.fxml;
    exports lk.ijse.athukorala_hardware;
    exports lk.ijse.athukorala_hardware.controller;
    exports lk.ijse.athukorala_hardware.model;
}