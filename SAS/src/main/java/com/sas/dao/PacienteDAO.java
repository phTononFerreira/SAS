package com.sas.dao;

import java.sql.ResultSet;

public class PacienteDAO {
    
    public static int contarPac() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM paciente");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        } 
    }
    
}
