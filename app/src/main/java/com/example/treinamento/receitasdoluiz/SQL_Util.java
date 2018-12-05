package com.example.treinamento.receitasdoluiz;

public class SQL_Util {
    SQL_Auxilio sqlite;

    public SQL_Util() {
        sqlite = new SQL_Auxilio();
    }

    public  void criarTabelas() {
        String sql;
        sql = "CREATE TABLE Receitas " +
                "(ID INTEGER NOT NULL PRIMARY KEY, " +
                " Nome          TEXT    NOT NULL, " +
                " Ingredientes  TEXT    NOT NULL, " +
                " Procedimento  TEXT    NOT NULL, " +
                " Categoria     TEXT    NOT NULL);";
        sqlite.executarSQL(sql);
    }

    public  void apagarTables() {
        String sql;
        sql = "DROP TABLE IF EXISTS Chamados ";
        sqlite.executarSQL(sql);
    }
}