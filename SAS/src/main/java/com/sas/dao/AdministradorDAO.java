package com.sas.dao;

import com.sas.model.Administrador;
import com.sas.model.Atendente;
import com.sas.model.Enfermeira;
import com.sas.model.Funcionario;
import com.sas.model.Medico;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

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

        } else if (f.getId().contains("enf")) {
            Enfermeira enf = (Enfermeira) f;
            String query = "INSERT INTO enfermeira VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setString(1, enf.getId());
                pstm.setString(2, enf.getSenha());
                pstm.setString(3, enf.getCr());
                pstm.setString(4, enf.getNome());
                pstm.setString(5, enf.getData_nascimento());
                pstm.setString(6, enf.getCpf());
                pstm.setString(7, enf.getTelefone());
                pstm.setString(8, enf.getEndereco());
                pstm.setDouble(9, enf.getSalario());
                pstm.setString(10, enf.getAdm_id());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
            
        } else if (f.getId().contains("med")) {
            Medico med = (Medico) f;
            String query = "INSERT INTO medico VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                pstm.setString(1, med.getId());
                pstm.setString(2, med.getSenha());
                pstm.setString(3, med.getCrm());
                pstm.setString(4, med.getNome());
                pstm.setString(5, med.getData_nascimento());
                pstm.setString(6, med.getCpf());
                pstm.setString(7, med.getTelefone());
                pstm.setString(8, med.getEndereco());
                pstm.setDouble(9, med.getSalario());
                pstm.setString(10, med.getEspecialidade());
                pstm.setString(11, med.getAdm_id());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        }

        return false;
    }

    public static boolean alterarFunc(Funcionario f) {
        Connection conn = ConexaoBD.getConnection();
        if (f.getId().contains("adm")) {
            Administrador adm = (Administrador) f; 
            
            
            String query = "UPDATE administrador set adm_senha = ?, adm_nome = ?, adm_dataNasc = ?, adm_cpf = ?, adm_telefone = ?, adm_endereco = ?, adm_salario = ? WHERE adm_id = ?";
            PreparedStatement pstm;

            try {
                pstm = conn.prepareStatement(query);
                pstm.setString(1, adm.getSenha());
                pstm.setString(2, adm.getNome());
                pstm.setString(3, adm.getData_nascimento());
                pstm.setString(4, adm.getCpf());
                pstm.setString(5, adm.getTelefone());
                pstm.setString(6, adm.getEndereco());
                pstm.setDouble(7, adm.getSalario());
                pstm.setString(8, adm.getId());
                
                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        
        } else if (f.getId().contains("ate")) {
            Atendente ate = (Atendente) f;
            String query = "UPDATE atendente set ate_senha = ?, ate_nome = ?, ate_dataNasc = ?, ate_cpf = ?, ate_telefone = ?, ate_endereco = ?, ate_salario = ? WHERE ate_id = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setString(1, ate.getSenha());
                pstm.setString(2, ate.getNome());
                pstm.setString(3, ate.getData_nascimento());
                pstm.setString(4, ate.getCpf());
                pstm.setString(5, ate.getTelefone());
                pstm.setString(6, ate.getEndereco());
                pstm.setDouble(7, ate.getSalario());
                pstm.setString(8, ate.getId());
                
                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }

        } else if (f.getId().contains("enf")) {
            Enfermeira enf = (Enfermeira) f;
            String query = "UPDATE enfermeira set enf_senha = ?, enf_cr = ?, enf_nome = ?, enf_dataNasc = ?, enf_cpf = ?, enf_telefone = ?, enf_endereco = ?, enf_salario = ? WHERE enf_id = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setString(1, enf.getSenha());
                pstm.setString(2, enf.getCr());
                pstm.setString(3, enf.getNome());
                pstm.setString(4, enf.getData_nascimento());
                pstm.setString(5, enf.getCpf());
                pstm.setString(6, enf.getTelefone());
                pstm.setString(7, enf.getEndereco());
                pstm.setDouble(8, enf.getSalario());
                pstm.setString(9, enf.getId());

                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
            
        } else if (f.getId().contains("med")) {
            Medico med = (Medico) f;
            String query = "UPDATE medico set med_senha = ?, med_crm = ?, med_nome = ?, med_dataNasc = ?, med_cpf = ?, med_telefone = ?, med_endereco = ?, med_salario = ?, med_especialidade = ? WHERE med_id = ?";
            PreparedStatement pstm;

            try {           
                pstm = conn.prepareStatement(query);
                
                pstm.setString(1, med.getSenha());
                pstm.setString(2, med.getCrm());
                pstm.setString(3, med.getNome());
                pstm.setString(4, med.getData_nascimento());
                pstm.setString(5, med.getCpf());
                pstm.setString(6, med.getTelefone());
                pstm.setString(7, med.getEndereco());
                pstm.setDouble(8, med.getSalario());
                pstm.setString(9, med.getEspecialidade());
                pstm.setString(10, med.getId());
                                
                pstm.execute();
                pstm.close();

                return true;

            } catch (Exception erro) {
                System.out.println("ERRO DAO " + erro);
            }
        }

        return false;
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
    
    public static void carregaTab(DefaultTableModel modelo, boolean adm, boolean ate, boolean enf, boolean med) {
        ResultSet rs = null;
        if(adm){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM administrador");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("adm_nome"),
                        "Administrador",
                        Double.parseDouble(rs.getString("adm_salario")),
                        rs.getString("adm_telefone"),
                        rs.getString("adm_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela administrador");
            }
        }
        if(ate){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM atendente");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("ate_nome"),
                        "Atendente",
                        Double.parseDouble(rs.getString("ate_salario")),
                        rs.getString("ate_telefone"),
                        rs.getString("ate_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela atendente");
            }
        }
        if(enf){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM enfermeira");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("enf_nome"),
                        "Enfermeira",
                        Double.parseDouble(rs.getString("enf_salario")),
                        rs.getString("enf_telefone"),
                        rs.getString("enf_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela enfermeira");
            }
        }
        if(med){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("med_nome"),
                        "Médico",
                        Double.parseDouble(rs.getString("med_salario")),
                        rs.getString("med_telefone"),
                        rs.getString("med_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela medico");
            }
        }
    }
    
    public static void pesquisaTabNome(DefaultTableModel modelo, boolean adm, boolean ate, boolean enf, boolean med, String nome) {
        ResultSet rs = null;
        if(adm){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM administrador WHERE adm_nome Like '%" + nome + "%'");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("adm_nome"),
                        "Administrador",
                        Double.parseDouble(rs.getString("adm_salario")),
                        rs.getString("adm_telefone"),
                        rs.getString("adm_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela administrador");
            }
        }
        if(ate){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM atendente WHERE ate_nome Like '%" + nome + "%'");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("ate_nome"),
                        "Atendente",
                        Double.parseDouble(rs.getString("ate_salario")),
                        rs.getString("ate_telefone"),
                        rs.getString("ate_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela atendente");
            }
        }
        if(enf){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM enfermeira WHERE enf_nome Like '%" + nome + "%'");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("enf_nome"),
                        "Enfermeira",
                        Double.parseDouble(rs.getString("enf_salario")),
                        rs.getString("enf_telefone"),
                        rs.getString("enf_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela enfermeira");
            }
        }
        if(med){
            try{
                rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico WHERE med_nome Like '%" + nome + "%'");

                while(rs.next()){
                    modelo.addRow(new Object[]{
                        rs.getString("med_nome"),
                        "Médico",
                        Double.parseDouble(rs.getString("med_salario")),
                        rs.getString("med_telefone"),
                        rs.getString("med_cpf"),

                    });
                }

            }catch(Exception e){
                System.out.println("Erro ao puxar tabela medico");
            }
        }
    }

}
