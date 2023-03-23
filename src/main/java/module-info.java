module com.example.tp1_benaboud {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tp1_benaboud to javafx.fxml;
    exports com.example.tp1_benaboud;
}