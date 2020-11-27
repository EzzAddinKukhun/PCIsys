module org.PCI {
    requires de.jensd.fx.glyphs.commons;
    requires com.jfoenix;
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;

    opens org.PCI to javafx.fxml;
    exports org.PCI;
}