module com.example.bindings {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.bindings to javafx.fxml;
    exports com.example.bindings;
}