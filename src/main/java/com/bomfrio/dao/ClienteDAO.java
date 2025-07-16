package com.bomfrio.dao;

import com.bomfrio.db.Conexao;
import com.bomfrio.model.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {

    public boolean inserir(Cliente cliente) {
        String sql = "INSERT INTO cliente (cpf, nome, telefone, email, endereco, dataCadastro) VALUES (?, ?, ?, ?, ?, ?)";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, cliente.getCpf());
            stmt.setString(2, cliente.getNome());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());
            stmt.setString(5, cliente.getEndereco());
            stmt.setString(6, cliente.getDataCadastro().toString());

            stmt.executeUpdate();
            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir cliente: " + e.getMessage());
            return false;
        }
    }
}
