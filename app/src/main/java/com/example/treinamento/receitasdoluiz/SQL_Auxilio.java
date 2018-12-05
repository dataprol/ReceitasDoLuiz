package com.example.treinamento.receitasdoluiz;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SQL_Auxilio {

    private Connection con;
    private Statement stmt;

    public SQL_Auxilio(){
        con = new SQL_Conexao().getConnection() ;
    }

    public void executarSQL(String sql) {

        try{
            stmt = con.createStatement();
            stmt.executeUpdate(sql);
            stmt.close();
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("Operação concluída!");
    }

    public ResultSet consultarSQL(String sql) {
        try {
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( sql );
            return rs;
        }
        catch ( Exception e ) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage() );
        }
        System.out.println("Operação concluída");
        return null;
    }
}
