package com.sas.dao;

import com.sas.model.Paciente;
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
    
    public static Paciente pesquisarPacID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM paciente WHERE pac_id = '" + ID + "'");
        Paciente pac = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                pac = new Paciente();
                
                pesquisa.next();
                pac.setId(pesquisa.getString("pac_id"));
                pac.setNome(pesquisa.getString("pac_nome"));
                pac.setData_nascimento(pesquisa.getString("pac_dataNasc"));
                pac.setCpf(pesquisa.getString("pac_cpf"));
                pac.setTelefone(pesquisa.getString("pac_telefone"));
                pac.setEndereco(pesquisa.getString("pac_endereco"));
            } else {
                pac = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return pac;
    }
    
}
