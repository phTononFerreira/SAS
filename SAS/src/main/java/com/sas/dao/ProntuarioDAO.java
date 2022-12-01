package com.sas.dao;

import com.sas.model.Prontuario;
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
    
    public static Prontuario pesquisarProID(String pro_id) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM prontuario WHERE pro_id = '" + pro_id + "'");
        Prontuario pro = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                pro = new Prontuario();
                pesquisa.next();
                pro.setId(pesquisa.getString("pro_id"));
                pro.setTemperatura(pesquisa.getFloat("pro_temperatura"));
                pro.setPressao(pesquisa.getString("pro_pressao"));
                pro.setDescricao(pesquisa.getString("pro_descricao"));
                pro.setPac_id(pesquisa.getString("pac_id"));
                pro.setEnf_id(pesquisa.getString("enf_id"));
            } else {
                pro = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return pro;
    }
    
}
