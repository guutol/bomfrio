package com.bomfrio.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private static final String URL = "jdbc:sqlite:banco.db";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL);
        } 
        catch (SQLException e) {
            System.out.println("Erro ao conectar com o banco: " + e.getMessage());
            return null;
        }
    }
}
