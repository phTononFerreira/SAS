package com.sas.dao;

import com.sas.model.Consulta;
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
    
    public static Consulta pesquisarConID(String con_id) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM consulta WHERE con_id = '" + con_id + "'");
        Consulta con = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                con = new Consulta();
                pesquisa.next();
                con.setId(pesquisa.getString("con_id"));
                con.setData(pesquisa.getString("con_data"));
                con.setReceita(pesquisa.getString("con_receita"));
                con.setStatus(pesquisa.getInt("con_status"));
                con.setPac_id(pesquisa.getString("pac_id"));
                con.setMed_id(pesquisa.getString("med_id"));
                con.setPro_id(pesquisa.getString("pro_id"));
                con.setAte_id(pesquisa.getString("ate_id"));
            } else {
                con = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return con;
    }
    
}
