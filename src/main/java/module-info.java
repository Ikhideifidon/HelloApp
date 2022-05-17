module com.ikhideifidon.helloapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;

    opens com.ikhideifidon.helloapp to javafx.fxml;
    exports com.ikhideifidon.helloapp;
}