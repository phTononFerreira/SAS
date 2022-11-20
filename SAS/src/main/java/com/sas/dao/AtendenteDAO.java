package com.sas.dao;

import com.sas.model.Atendente;
import com.sas.model.Consulta;
import com.sas.model.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AtendenteDAO {
    
    public static boolean cadastrarPac(Paciente pac) {
        Connection conn = ConexaoBD.getConnection();

        String query = "INSERT INTO paciente VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, pac.getId());
            pstm.setString(2, pac.getNome());
            pstm.setString(3, pac.getData_nascimento());
            pstm.setString(4, pac.getCpf());
            pstm.setString(5, pac.getTelefone());
            pstm.setString(6, pac.getEndereco());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
            }
        
        return false;
    }

    public static void editarPac(Paciente pac) {

    }

    public static void encaminharTri(Consulta con) {

    }

    public static Consulta agendarCon() {
        return null;
    }

    public static void cancelarCon(Consulta con) {

    }

    public static Atendente pesquisarAteID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM atendente WHERE ate_id = '" + ID + "'");
        Atendente ate = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                ate = new Atendente();
                pesquisa.next();
                ate.setId(pesquisa.getString("ate_id"));
                ate.setSenha(pesquisa.getString("ate_senha"));
                ate.setNome(pesquisa.getString("ate_nome"));
                ate.setData_nascimento(pesquisa.getString("ate_dataNasc"));
                ate.setCpf(pesquisa.getString("ate_cpf"));
                ate.setTelefone(pesquisa.getString("ate_telefone"));
                ate.setEndereco(pesquisa.getString("ate_endereco"));
                ate.setSalario(Double.parseDouble(pesquisa.getString("ate_salario")));
                ate.setAdm_id(pesquisa.getString("adm_id"));
                //System.out.println(adm.toString());
            } else {
                ate = null;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return ate;
    }
    
    public static int contarAtend() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM atendente");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        }
        
    }
    
}
