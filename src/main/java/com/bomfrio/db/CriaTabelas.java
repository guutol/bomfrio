package com.bomfrio.db;

import java.sql.Connection;
import java.sql.Statement;

public class CriaTabelas {

    public static void main(String[] args) {
        String sql = """
            CREATE TABLE IF NOT EXISTS cliente (
                cpf TEXT PRIMARY KEY,
                nome TEXT NOT NULL,
                telefone TEXT,
                email TEXT,
                endereco TEXT,
                dataCadastro TEXT
            );
        """;

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Tabela 'cliente' criada com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}
