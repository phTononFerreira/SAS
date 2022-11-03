/**
 *
 * @author ViniciusGR797 <loritoamarelo@outlook.com>
 */

package com.sas.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;


public class Conexao {
    
    private static Connection conn;
    
    private static Conexao conexao;
    
    private Conexao(){
        
    }
    
    public static Conexao getConexao(){
        if(conexao == null)
            conexao = new Conexao();
        return conexao;
    }
    
    public static Connection getConnection(){
        return conn;
    }
    
    public ResultSet pesquisaBD(String cunsulta){
        ResultSet resultSet = null;
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(cunsulta);
        } catch (Exception e) {
            System.out.println("ERRO NA PESQUISA");
        }
        return resultSet;
    }

    public static void conectaBD() {
        try {
            String url = "jdbc:mysql://localhost:3306/wikifilms?user=admin&password=admin";
            conn = DriverManager.getConnection(url);
            System.out.println("CONECTADO COM SUCESSO!");

        } catch (SQLException e) {
            System.out.println("ERRO DE CONEXAO");
        }

    }
}

