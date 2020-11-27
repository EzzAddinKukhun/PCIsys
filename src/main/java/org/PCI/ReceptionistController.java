package org.PCI;
import java.io.IOException;
import javafx.fxml.FXML;

public class ReceptionistController {
    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
