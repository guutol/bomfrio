package com.bomfrio.dao;

import com.bomfrio.db.Conexao;
import com.bomfrio.model.Servico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ServicoDAO {
    
    public boolean inserir(Servico servico) {
        String sql = "INSERT INTO servico (id, cpf, tipoServico, nomeServico, descServico, observacao, valor, dataServico, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try(Connection conn = Conexao.conectar(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, servico.getId());
            stmt.setString(2, servico.getCpf());
            stmt.setString(3, servico.getTipoServico());
            stmt.setString(4, servico.getNomeServico());
            stmt.setString(5, servico.getDescServico());
            stmt.setString(6, servico.getObservacao());
            stmt.setDouble(7, servico.getValor());
            stmt.setString(8, servico.getDataServico().toString());
            stmt.setString(9, servico.getStatus());
        
            stmt.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            System.out.println("Erro ao inserir servico: " +e.getMessage());
            return false;
        }
    }
}
