package com.mors741.gui.client;

import com.mors741.ws.CheckAtmWs;
import com.mors741.ws.CheckAtmWsService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class Controller {

    CheckAtmWsService service = new CheckAtmWsService();

    @FXML
    private TextField atmId;

    @FXML
    private Text output;

    @FXML
    private Text error;

    @FXML protected void checkAtmAction(ActionEvent event) {
        output.setText("");
        error.setText("");
        try {
            CheckAtmWs port = service.getCheckAtmWsPort();
            String response = port.availableCash(Integer.parseInt(atmId.getText()));
            output.setText(response);
        } catch (Exception e) {
            error.setText("Exception!");
        }
    }
}
