package com.bomfrio.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Node;


public class TelaInicialController {
    @FXML
    private Button btnIniciar;
    @FXML
    private void handleIniciar(ActionEvent event) {
       try {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/tela_principal.fxml"));

        Parent root = loader.load();

        Stage newStage = new Stage();
        newStage.setScene(new Scene(root));
        newStage.setTitle("Bomfrio - Tela Inicial");
        newStage.setMaximized(true);
        newStage.show();
        
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
        System.out.println("Botão foi clicado!");

       }
       catch(Exception e) {
            e.printStackTrace();
       }
    }
}
