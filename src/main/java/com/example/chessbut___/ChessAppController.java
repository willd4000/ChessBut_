package com.example.chessbut___;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ChessAppController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}