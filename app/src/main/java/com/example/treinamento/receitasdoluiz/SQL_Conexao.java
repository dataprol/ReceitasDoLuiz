package com.example.treinamento.receitasdoluiz;

import java.sql.Connection;
import java.sql.DriverManager;

public class SQL_Conexao {
    public Connection getConnection() {
        try {
            Class.forName("org.sqlite.JDBC");
            return DriverManager.getConnection("jdbc:sqlite:Aplicativo_Receitas_do_Luiz.db");
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
