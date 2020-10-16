/**
 * Sample Skeleton for 'Scene.fxml' Controller Class
 */

package it.polito.tdp.spellchecker;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class FXMLController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label lblChoice;

    @FXML
    private ComboBox<?> boxLingua;

    @FXML
    private TextArea txtDaInserire;

    @FXML
    private Button spellCheckButton;

    @FXML
    private Label lblWrong;

    @FXML
    private TextArea txtDaCorreggere;

    @FXML
    private Label lblNumber;

    @FXML
    private Button clearTextButton;

    @FXML
    void doActivation(ActionEvent event) {

    }

    @FXML
    void doClearText(ActionEvent event) {

    }

    @FXML
    void doSpellCheck(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert lblChoice != null : "fx:id=\"lbtChoice\" was not injected: check your FXML file 'Scene.fxml'.";
        assert boxLingua != null : "fx:id=\"boxLingua\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtDaInserire != null : "fx:id=\"txtDaInserire\" was not injected: check your FXML file 'Scene.fxml'.";
        assert spellCheckButton != null : "fx:id=\"spellCheckButton\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblWrong != null : "fx:id=\"lbtWrong\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtDaCorreggere != null : "fx:id=\"txtDaCorreggere\" was not injected: check your FXML file 'Scene.fxml'.";
        assert lblNumber != null : "fx:id=\"lbtNumber\" was not injected: check your FXML file 'Scene.fxml'.";
        assert clearTextButton != null : "fx:id=\"clearTextButton\" was not injected: check your FXML file 'Scene.fxml'.";

    }
}




