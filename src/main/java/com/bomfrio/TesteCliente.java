package com.bomfrio;

import com.bomfrio.dao.ClienteDAO;
import com.bomfrio.model.Cliente;

import java.time.LocalDate;

public class TesteCliente {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(
            "59576363802",
            "Gustavo",
            "18996696588",
            "n4megustavo@gmail.com",
            "Rua Ceciliano de Andrade Jardim",
            LocalDate.now()
        );

        ClienteDAO dao = new ClienteDAO();
        boolean sucesso = dao.inserir(cliente);

        if (sucesso) {
            System.out.println("Cliente inserido com sucesso!");
        } else {
            System.out.println("Falha ao inserir cliente.");
        }
    }
}
