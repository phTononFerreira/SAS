package com.sas.model;

import com.sas.controller.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class Administrador extends Funcionario {

    public Administrador() {
    }

    public Funcionario cadastrarFunc() {
        return null;
    }

    public void editarFunc(Funcionario func) {

    }
    
    

     
    public static Administrador pesquisarAdministradorID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM administrador WHERE adm_id = '" + ID + "'");
        Administrador adm = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                adm = new Administrador();
                pesquisa.next();
                adm.setId(Integer.parseInt(pesquisa.getString("adm_id")));
                adm.setSenha(pesquisa.getString("adm_senha"));
                adm.setNome(pesquisa.getString("adm_nome"));
                adm.setData_nascimento(new SimpleDateFormat("yyyy-MM-dd").parse(pesquisa.getString("adm_dataNasc")));
                adm.setCpf(pesquisa.getString("adm_cpf"));
                adm.setEndereco(pesquisa.getString("adm_endereco"));
                adm.setSalario(Double.parseDouble(pesquisa.getString("adm_salario")));
                //System.out.println(adm.toString());
            }else{
                adm = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => "+e);
        }

        return adm;
    }

}
