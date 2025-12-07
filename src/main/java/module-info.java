module lk.ijse.athukorala_hardware.athukorala_hardware {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens lk.ijse.athukorala_hardware to javafx.fxml;
    exports lk.ijse.athukorala_hardware;
}