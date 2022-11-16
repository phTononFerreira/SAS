package com.sas.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class ConexaoBD {

    private static Connection conn;

    private static ConexaoBD conexao;

    public ConexaoBD() {
        conectaBD();
    }

    // SINGLETON (ConexaoBD)
    public static ConexaoBD getConexao() {
        if (conexao == null) {
            conexao = new ConexaoBD();
        }
        return conexao;
    }

    public static Connection getConnection() {
        return conn;
    }

    public ResultSet executarQueryBD(String query) {
        ResultSet resultSet = null;
        try {
            Statement statement = conn.createStatement();
            resultSet = statement.executeQuery(query);
        } catch (Exception e) {
            System.out.println("ERRO NA PESQUISA");
        }
        return resultSet;
    }

    public static void conectaBD() {
        try {
            String url = "jdbc:mysql://localhost:3306/sasdb?user=default&password=$@193Ed67";
            conn = DriverManager.getConnection(url);
            System.out.println("CONECTADO COM SUCESSO!");

        } catch (SQLException e) {
            System.out.println("ERRO DE CONEXAO " + e);
        }
    }
}
