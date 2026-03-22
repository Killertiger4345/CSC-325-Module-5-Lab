module com.hershey.colorchooser {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.hershey.colorchooser to javafx.fxml;
    exports com.hershey.colorchooser;
}