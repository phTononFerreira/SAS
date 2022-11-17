package com.sas.dao;

import com.sas.model.Administrador;
import com.sas.model.Funcionario;
import com.sas.model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorDAO {
    
    public static boolean cadastrarFunc(Funcionario f) {
        Connection conn = ConexaoBD.getConnection();
        if(f.getId().contains("adm")){ 
            Administrador adm = (Administrador) f;
            String query = "INSERT INTO administrador VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;
            
            try{
                pstm = conn.prepareStatement(query);
                pstm.setString(1, f.getId());
                pstm.setString(2, f.getSenha());
                pstm.setString(3, f.getNome());
                pstm.setString(4, f.getData_nascimento());
                pstm.setString(5, f.getCpf());
                pstm.setString(6, f.getTelefone());
                pstm.setString(7, f.getEndereco());
                pstm.setDouble(8, f.getSalario());
                
                pstm.execute();
                pstm.close();
 


            } catch (Exception erro){
                System.out.println("ERRO");
            }
           
         
        }
        
        else if(f.getId().contains("med")){
            Medico med= (Medico) f;
            System.out.println("DEU CERTO med"+med.getCrm());
            return true;
        }
        return false;
    }

    public static void editarFunc(Funcionario func) {

    }

    public static Administrador pesquisarAdminID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM administrador WHERE adm_id = '" + ID + "'");
        Administrador adm = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                adm = new Administrador();
                pesquisa.next();
                adm.setId(pesquisa.getString("adm_id"));
                adm.setSenha(pesquisa.getString("adm_senha"));
                adm.setNome(pesquisa.getString("adm_nome"));
                adm.setData_nascimento(pesquisa.getString("adm_dataNasc"));
                adm.setCpf(pesquisa.getString("adm_cpf"));
                adm.setTelefone(pesquisa.getString("adm_telefone"));
                adm.setEndereco(pesquisa.getString("adm_endereco"));
                adm.setSalario(Double.parseDouble(pesquisa.getString("adm_salario")));
                //System.out.println(adm.toString());
            } else {
                adm = null;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return adm;
    }
    
}
