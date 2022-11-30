package com.sas.dao;

import com.sas.model.Enfermeira;
import com.sas.model.InsumoMedico;
import com.sas.model.Prontuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class EnfermeiraDAO {
    
    public Prontuario gerarPro() {
        return null;
    }

    public InsumoMedico cadastrarIns() {
        return null;
    }

    public static boolean controlarEst(InsumoMedico ins) {
        Connection conn = ConexaoBD.getConnection();
        
        String query = "UPDATE insumo set ins_qtd = ? WHERE ins_id = ?";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setFloat(1, ins.getQuantidade());          
            pstm.setString(2, ins.getId());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
        }

        return false;
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
    
    public static void carregaTabTriagem(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT pp.pro_id, pp.pac_nome, pp.pac_cpf FROM consulta as c INNER JOIN (SELECT pro.pro_id, pac.pac_nome, pac.pac_cpf, pac.pac_id FROM prontuario as pro INNER JOIN paciente as pac on pro.pac_id = pac.pac_id) as pp on c.pac_id = pp.pac_id WHERE c.con_status = 2 ORDER BY c.con_data");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("pro_id"),
                    rs.getString("pac_nome"),
                    rs.getString("pac_cpf")                        
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        }
        
    }
    
    public static void pesquisaTabTriagem(DefaultTableModel modelo, String nome) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT pp.pro_id, pp.pac_nome, pp.pac_cpf FROM consulta as c INNER JOIN (SELECT pro.pro_id, pac.pac_nome, pac.pac_cpf, pac.pac_id FROM prontuario as pro INNER JOIN paciente as pac on pro.pac_id = pac.pac_id) as pp on c.pac_id = pp.pac_id WHERE c.con_status = 2 AND pac_nome LIKE '%" + nome + "%' ORDER BY c.con_data");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("pro_id"),
                    rs.getString("pac_nome"),
                    rs.getString("pac_cpf")   
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        } 
    }
    
    public static String pesquisarConPorProntuario(String pro_id) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM consulta WHERE pro_id = '" + pro_id + "'");
        
        try {
            if (pesquisa.isBeforeFirst()) {
                pesquisa.next();
                return pesquisa.getString("con_id");
            } else {
                return "NAO ENCONTRADO";
            }

        } catch (NumberFormatException | SQLException e) {
            return "ERRO NA FORMATAÇÃO => " + e;            
        }
    }
    
    public static boolean preencherTri(Prontuario pro) {
        Connection conn = ConexaoBD.getConnection();
        
        String query = "UPDATE prontuario set pro_temperatura = ?, pro_pressao = ?, pro_descricao = ?, enf_id = ? WHERE pro_id = ?";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setFloat(1, pro.getTemperatura());
            pstm.setString(2, pro.getPressao());
            pstm.setString(3, pro.getDescricao());
            pstm.setString(4, pro.getEnf_id());            
            pstm.setString(5, pro.getId());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
        }

        return false;
    }
    
    public static void carregaTabInsumo(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM insumo ORDER BY ins_nome");
            
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("ins_id"),
                    rs.getString("ins_nome"),
                    rs.getInt("ins_qtd")                        
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela insumo");
        }
        
    }
        
}
