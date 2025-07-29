package com.bomfrio.controller;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;

public class TelaPrincipalController {
    @FXML
    private void abrirTelaClientes(ActionEvent event) {
        System.out.println("Botão clientes clicado");
    }

    @FXML
    private void abrirTelaServicos(ActionEvent event) {
        System.out.println("Botão serviços clicado");
    }
}
