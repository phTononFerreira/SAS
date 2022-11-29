package com.sas.dao;

import java.sql.ResultSet;

public class ProntuarioDAO {
    
    public static int contarPro() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM prontuario");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        } 
    }
    
}
