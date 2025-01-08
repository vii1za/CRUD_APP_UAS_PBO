module com.example.crudapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crudapp to javafx.fxml;
    exports com.example.crudapp;
}