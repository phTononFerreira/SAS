package com.sas.dao;

import com.sas.model.Administrador;
import com.sas.model.Atendente;
import com.sas.model.Funcionario;
import com.sas.model.Medico;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdministradorDAO {

    public static boolean cadastrarFunc(Funcionario f) {
        Connection conn = ConexaoBD.getConnection();
        if (f.getId().contains("adm")) {
            Administrador adm = (Administrador) f;
            String query = "INSERT INTO administrador VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setString(1, adm.getId());
                pstm.setString(2, adm.getSenha());
                pstm.setString(3, adm.getNome());
                pstm.setString(4, adm.getData_nascimento());
                pstm.setString(5, adm.getCpf());
                pstm.setString(6, adm.getTelefone());
                pstm.setString(7, adm.getEndereco());
                pstm.setDouble(8, adm.getSalario());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        
        } else if (f.getId().contains("ate")) {
            Atendente ate = (Atendente) f;
            String query = "INSERT INTO atendente VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {
                System.out.println(ate.toString());
                System.out.println("ID_ADM dao: "+ate.getAdm_id());
                
                pstm = conn.prepareStatement(query);
                pstm.setString(1, ate.getId());
                pstm.setString(2, ate.getSenha());
                pstm.setString(3, ate.getNome());
                pstm.setString(4, ate.getData_nascimento());
                pstm.setString(5, ate.getCpf());
                pstm.setString(6, ate.getTelefone());
                pstm.setString(7, ate.getEndereco());
                pstm.setDouble(8, ate.getSalario());
                pstm.setString(9, ate.getAdm_id());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        }

        /*} else if (f.getId().contains("enf")) {
            System.out.println("Enf");  
            return true;
        }
            
        } else if (f.getId().contains("med")) {
            System.out.println("Med");  
            return true;
        }*/

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
    
    public static int contarAdmin() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM administrador");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        }
        
    }

}
