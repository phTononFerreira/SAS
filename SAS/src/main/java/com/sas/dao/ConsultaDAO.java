package com.sas.dao;

import java.sql.ResultSet;

public class ConsultaDAO {
    
    public static int contarCon() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM consulta");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        } 
    }
    
}
