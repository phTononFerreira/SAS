package com.sas.model;

import com.sas.controller.ConexaoBD;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Enfermeira extends Funcionario {

    private String cr;
    private String adm_id;

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(String adm_id) {
        this.adm_id = adm_id;
    }

    public Enfermeira() {
    }

    public Enfermeira(String cr, String adm_id) {
        this.cr = cr;
        this.adm_id = adm_id;
    }

    public Prontuario gerarPro() {
        return null;
    }

    public InsumoMedico cadastrarInsumo() {
        return null;
    }

    public void controlarEstoque(InsumoMedico ins) {

    }

    public int contarEstoque(InsumoMedico ins) {
        return 0;
    }

    public static Enfermeira pesquisarEnfermeiraID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM enfermeira WHERE enf_id = '" + ID + "'");
        Enfermeira enf = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                enf = new Enfermeira();
                pesquisa.next();
                enf.setId(pesquisa.getString("enf_id"));
                enf.setSenha(pesquisa.getString("enf_senha"));
                enf.setNome(pesquisa.getString("enf_nome"));
                enf.setData_nascimento(new SimpleDateFormat("yyyy-MM-dd").parse(pesquisa.getString("enf_dataNasc")));
                enf.setCpf(pesquisa.getString("enf_cpf"));
                enf.setEndereco(pesquisa.getString("enf_endereco"));
                enf.setSalario(Double.parseDouble(pesquisa.getString("enf_salario")));
                enf.setCr(pesquisa.getString("enf_salario"));
                enf.setAdm_id(pesquisa.getString("adm_id"));
                //System.out.println(adm.toString());
            } else {
                enf = null;
            }

        } catch (NumberFormatException | SQLException | ParseException e) {
            System.out.println("ERRO NA FORMATAÇÃO => " + e);
        }

        return enf;
    }
}
