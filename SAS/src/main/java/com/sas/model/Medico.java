package com.sas.model;

import com.sas.controller.ConexaoBD;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class Medico extends Funcionario {

	private int crm;
	private String especialidade;
	private int med_id;

	public int getCrm() {
		return crm;
	}
	public void setCrm(int crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public int getMed_id() {
		return med_id;
	}
	public void setMed_id(int med_id) {
		this.med_id = med_id;
	}

	public Medico() {
	}
	
	public Medico(int crm, String especialidade, int med_id) {
		this.crm = crm;
		this.especialidade = especialidade;
		this.med_id = med_id;
	}

	public void finalizarCon(Consulta con) {

	}

	public String encaminharPac(Consulta con) {
		return null;
	}

	public String receitarPac(InsumoMedico ins) {
		return null;
	}

	public void visualizarPro(Prontuario pro) {

	}
        
        public static Medico pesquisarMedicoID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM administrador WHERE adm_id = '" + ID + "'");
        Medico med = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                med = new Medico();
                pesquisa.next();
                med.setId(pesquisa.getString("adm_id"));
                med.setSenha(pesquisa.getString("adm_senha"));
                med.setNome(pesquisa.getString("adm_nome"));
                med.setData_nascimento(new SimpleDateFormat("yyyy-MM-dd").parse(pesquisa.getString("adm_dataNasc")));
                med.setCpf(pesquisa.getString("adm_cpf"));
                med.setTelefone(pesquisa.getString("adm_telefone"));
                med.setEndereco(pesquisa.getString("adm_endereco"));
                med.setSalario(Double.parseDouble(pesquisa.getString("adm_salario")));
                //System.out.println(adm.toString());
            }else{
                med = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => "+e);
        }

        return med;
    }

}
