module com.hershey.tipcalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.hershey.tipcalculator to javafx.fxml;
    exports com.hershey.tipcalculator;
}