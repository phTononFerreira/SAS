package com.sas.dao;

import com.sas.model.Consulta;
import com.sas.model.InsumoMedico;
import com.sas.model.Medico;
import com.sas.model.Prontuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    
    public static void finalizarCon(Consulta con) {

    }

    public static String encaminharPac(Consulta con) {
        return null;
    }

    public static String receitarPac(InsumoMedico ins) {
        return null;
    }

    public static void visualizarPro(Prontuario pro) {

    }

    public static Medico pesquisarMedID(String ID) {
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
    
    public static int contarMedic() {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT COUNT(*) FROM medico");
        try{
            pesquisa.next();
            return Integer.parseInt(pesquisa.getString(1));
        } catch (Exception e) {
            return -1;
        }
        
    }
    
    public static void carregaTabConsulta(DefaultTableModel modelo) {
        ResultSet rs = null;
        String[] data = null;
        String[] hora = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT c.con_id, p.pac_nome, c.con_data FROM consulta as c INNER JOIN paciente as p on c.pac_id = p.pac_id WHERE c.con_status = 3 ORDER BY c.con_data");
            
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
    
    public static void pesquisaTabConsulta(DefaultTableModel modelo, String nome) {
        ResultSet rs = null;
        String[] data = null;
        String[] hora = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT c.con_id, p.pac_nome, c.con_data FROM consulta as c INNER JOIN paciente as p on c.pac_id = p.pac_id WHERE c.con_status = 3 AND pac_nome LIKE '%" + nome + "%' ORDER BY c.con_data");
            
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
            System.out.println("Erro ao puxar tabela paciente");
        } 
    }
    
    public static void carregaTabInsumo(DefaultTableModel modelo) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM insumo WHERE ins_qtd > 0 ORDER BY ins_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("ins_id"),
                    rs.getString("ins_nome"),
                    rs.getString("ins_qtd")                        
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela de insumos");
        }
        
    }
    
    public static void pesquisaTabInsumo(DefaultTableModel modelo, String nome) {
        ResultSet rs = null;
        
        try{
            rs = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM insumo WHERE ins_nome LIKE '%" + nome + "%' ORDER BY ins_nome");

            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getString("ins_id"),
                    rs.getString("ins_nome"),
                    rs.getString("ins_qtd")   
                });
            }

        }catch(Exception e){
            System.out.println("Erro ao puxar tabela paciente");
        } 
    }
    
    public static boolean receitarCon(Consulta con) {
        Connection conn = ConexaoBD.getConnection();
        
        String query = "UPDATE consulta set con_receita = ? WHERE con_id = ?";
        PreparedStatement pstm;

        try {
            pstm = conn.prepareStatement(query);
            pstm.setString(1, con.getReceita());          
            pstm.setString(2, con.getId());

            pstm.execute();
            pstm.close();

            return true;

        } catch (Exception erro) {
            System.out.println("ERRO DAO " + erro);
        }

        return false;
    } 
    
}
