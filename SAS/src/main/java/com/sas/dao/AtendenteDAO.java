package com.sas.dao;

import com.sas.model.Atendente;
import com.sas.model.Consulta;
import com.sas.model.Paciente;
import com.sas.model.Prontuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

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

    public static boolean editarPac(Paciente pac) {
        Connection conn = ConexaoBD.getConnection();

        String query = "UPDATE paciente set pac_nome = ?, pac_dataNasc = ?, pac_cpf = ?, pac_telefone = ?, pac_endereco = ? WHERE pac_id = ?";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, pac.getNome());
            pstm.setString(2, pac.getData_nascimento());
            pstm.setString(3, pac.getCpf());
            pstm.setString(4, pac.getTelefone());
            pstm.setString(5, pac.getEndereco());
            pstm.setString(6, pac.getId());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
        }

        

        return false;
    }

    public static void encaminharTri(Consulta con) {

    }

    public static boolean agendarCon(Consulta con) {
        Connection conn = ConexaoBD.getConnection();

        String query = "INSERT INTO consulta VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, con.getId());
            pstm.setString(2, con.getData());
            pstm.setString(3, con.getReceita());
            pstm.setInt(4, con.getStatus());
            pstm.setString(5, con.getPac_id());
            pstm.setString(6, con.getMed_id());
            pstm.setString(7, con.getPro_id());
            pstm.setString(8, con.getAte_id());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
        }
        
        return false;
    }
    
    public static Consulta pesquisarConID() {
        return null;
    }

    public static boolean cancelarCon(String consultaID) {
        Connection conn = ConexaoBD.getConnection();

        String query = "UPDATE consulta set con_status = 0 WHERE con_id = ?";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, consultaID);

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
            }
        
        return false;
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
    
    public static void carregaTab(DefaultTableModel modelo) {
        ResultSet rs = null;
        String[] data = null;
        String[] hora = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT c.con_id, p.pac_nome, c.con_data FROM consulta as c INNER JOIN paciente as p on c.pac_id = p.pac_id WHERE c.con_status = 1 ORDER BY c.con_data");

            while(rs.next()){
                data = rs.getString("con_data").split("-");
                hora = data[2].split(" ");
                modelo.addRow(new Object[]{
                    rs.getString("con_id"),
                    rs.getString("pac_nome"),
                    hora[0]+"/"+data[1]+"/"+data[0]+" "+hora[1]  
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela consulta");
        }
        
    }
    
    public static void carregaTabPaciente(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM paciente ORDER BY pac_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("pac_id"),
                    rs.getString("pac_nome")
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        }
        
    }
    
    public static void pesquisaTabPaciente(DefaultTableModel modelo, String nome) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM paciente WHERE pac_nome LIKE '%" + nome + "%' ORDER BY pac_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("pac_id"),
                    rs.getString("pac_nome")  
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        } 
    }
    
    public static void carregaTabMedico(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico ORDER BY med_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("med_id"),
                    rs.getString("med_nome")
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela medico");
        }
        
    }
    
    public static void pesquisaTabMedico(DefaultTableModel modelo, String nome) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico WHERE med_nome LIKE '%" + nome + "%' ORDER BY med_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("med_id"),
                    rs.getString("med_nome")  
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela medico");
        } 
    }
    
    public static boolean cadastrarTri(Prontuario pro) {
        Connection conn = ConexaoBD.getConnection();

        String query = "INSERT INTO prontuario VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, pro.getId());
            pstm.setFloat(2, pro.getTemperatura());
            pstm.setString(3, pro.getPressao());
            pstm.setString(4, pro.getDescricao());
            pstm.setString(5, pro.getPac_id());
            pstm.setString(6, pro.getEnf_id());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
            }
        
        return false;
    }
    
    public static void carregaTabPacienteEdit(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM paciente ORDER BY pac_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("pac_id"),
                    rs.getString("pac_nome"),
                    rs.getString("pac_cpf")                        
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        }
        
    }
    
    public static void pesquisaTabPacienteEdit(DefaultTableModel modelo, String nome) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM paciente WHERE pac_nome LIKE '%" + nome + "%' ORDER BY pac_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("pac_id"),
                    rs.getString("pac_nome"),
                    rs.getString("pac_cpf")  
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        } 
    }
    
    public static boolean alterarStatusCon(String id, int status) {
        Connection conn = ConexaoBD.getConnection();
        String query = "UPDATE consulta SET con_status = ? WHERE con_id = ?";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setInt(1, status);
            pstm.setString(2, id);

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
        }
        return false;
    }
    
}
