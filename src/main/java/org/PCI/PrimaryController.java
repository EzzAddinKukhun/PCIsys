package org.PCI;
import com.jfoenix.skins.*;
import com.jfoenix.controls.*;
import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
