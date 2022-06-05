module com.example.lab2a {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens pl.lublin.wsei.java.cwiczenia to javafx.fxml;
    exports pl.lublin.wsei.java.cwiczenia;
}