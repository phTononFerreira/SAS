package com.sas.dao;

import com.sas.model.InsumoMedico;
import java.sql.ResultSet;

public class InsumoMedicoDAO {
    
    public static InsumoMedico pesquisarInsID(String ins_id) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM insumo WHERE ins_id = '" + ins_id + "'");
        InsumoMedico ins = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                ins = new InsumoMedico();
                pesquisa.next();
                ins.setId(pesquisa.getString("ins_id"));
                ins.setNome(pesquisa.getString("ins_nome"));
                ins.setQuantidade(pesquisa.getInt("ins_qtd"));

            } else {
                ins = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return ins;
    }
    
}
