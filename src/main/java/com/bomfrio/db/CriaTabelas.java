package com.bomfrio.db;

import java.sql.Connection;
import java.sql.Statement;

public class CriaTabelas {
    public static void main(String[] args) {
        criarTabelaCliente();
        criarTabelaServico();
    }

    private static void criarTabelaCliente() {
        String sql = """
            CREATE TABLE IF NOT EXISTS cliente (
                cpf TEXT PRIMARY KEY,
                nome TEXT,
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
            System.out.println("Erro ao criar tabela cliente: " + e.getMessage());
        }
    }

    private static void criarTabelaServico() {
        String sql = """
            CREATE TABLE IF NOT EXISTS servico (
                id INTEGER PRIMARY KEY,
                cpf TEXT NOT NULL,
                tipoServico TEXT,
                nomeServico TEXT,
                descServico TEXT,
                observacao TEXT,
                valor REAL,
                dataServico TEXT,
                status TEXT
            );
        """;

        try (Connection conn = Conexao.conectar();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Tabela 'servico' criada com sucesso.");

        } catch (Exception e) {
            System.out.println("Erro ao criar tabela servico: " + e.getMessage());
        }
    }
}
