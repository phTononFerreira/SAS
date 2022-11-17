package com.sas.dao;

import com.sas.controller.ConexaoBD;
import com.sas.model.Consulta;
import com.sas.model.InsumoMedico;
import com.sas.model.Medico;
import com.sas.model.Prontuario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoDAO {
    
    public void finalizarCon(Consulta con) {

    }

    public String encaminharPac(Consulta con) {
        return null;
    }

    public String receitarPac(InsumoMedico ins) {
        return null;
    }

    public void visualizarPro(Prontuario pro) {

    }

    public static Medico pesquisarMedicoID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico WHERE med_id = '" + ID + "'");
        Medico med = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                med = new Medico();
                pesquisa.next();
                med.setId(pesquisa.getString("med_id"));
                med.setSenha(pesquisa.getString("med_senha"));
                med.setNome(pesquisa.getString("med_nome"));
                med.setData_nascimento(pesquisa.getString("med_dataNasc"));
                med.setCpf(pesquisa.getString("med_cpf"));
                med.setTelefone(pesquisa.getString("med_telefone"));
                med.setEndereco(pesquisa.getString("med_endereco"));
                med.setSalario(Double.parseDouble(pesquisa.getString("med_salario")));
                med.setCrm(pesquisa.getString("med_crm"));
                med.setEspecialidade(pesquisa.getString("med_especialidade"));
                med.setAdm_id(pesquisa.getString("adm_id"));
                //System.out.println(adm.toString());
            } else {
                med = null;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return med;
    }
    
}
