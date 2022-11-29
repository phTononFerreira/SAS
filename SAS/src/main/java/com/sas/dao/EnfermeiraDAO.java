package com.sas.dao;

import com.sas.model.Enfermeira;
import com.sas.model.InsumoMedico;
import com.sas.model.Prontuario;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EnfermeiraDAO {
    
    public Prontuario gerarPro() {
        return null;
    }

    public InsumoMedico cadastrarIns() {
        return null;
    }

    public void controlarEst(InsumoMedico ins) {

    }

    public int contarEst(InsumoMedico ins) {
        return 0;
    }

    public static Enfermeira pesquisarEnfID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM enfermeira WHERE enf_id = '" + ID + "'");
        Enfermeira enf = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                enf = new Enfermeira();
                pesquisa.next();
                enf.setId(pesquisa.getString("enf_id"));
                enf.setSenha(pesquisa.getString("enf_senha"));
                enf.setNome(pesquisa.getString("enf_nome"));
                enf.setData_nascimento(pesquisa.getString("enf_dataNasc"));
                enf.setCpf(pesquisa.getString("enf_cpf"));
                enf.setEndereco(pesquisa.getString("enf_endereco"));
                enf.setSalario(Double.parseDouble(pesquisa.getString("enf_salario")));
                enf.setCr(pesquisa.getString("enf_cr"));
                enf.setAdm_id(pesquisa.getString("adm_id"));
                enf.setTelefone(pesquisa.getString("enf_telefone"));
                //System.out.println(adm.toString());
            } else {
                enf = null;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return enf;
    }
    
    public static int contarEnf() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM enfermeira");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        }
        
    }
    
}
