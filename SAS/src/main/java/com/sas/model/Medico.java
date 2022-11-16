package com.sas.model;

import com.sas.controller.ConexaoBD;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class Medico extends Funcionario {

	private String crm;
	private String especialidade;
	private String adm_id;

	public String getCrm() {
		return crm;
	}
	public void setCrm(String crm) {
		this.crm = crm;
	}

	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(String adm_id) {
		this.adm_id = adm_id;
	}

	public Medico() {
	}
	
	public Medico(String crm, String especialidade, String adm_id) {
		this.crm = crm;
		this.especialidade = especialidade;
		this.adm_id = adm_id;
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
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM medico WHERE med_id = '" + ID + "'");
        Medico med = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                med = new Medico();
                pesquisa.next();
                med.setId(pesquisa.getString("med_id"));
                med.setSenha(pesquisa.getString("med_senha"));
                med.setNome(pesquisa.getString("med_nome"));
                med.setData_nascimento(new SimpleDateFormat("yyyy-MM-dd").parse(pesquisa.getString("med_dataNasc")));
                med.setCpf(pesquisa.getString("med_cpf"));
                med.setTelefone(pesquisa.getString("med_telefone"));
                med.setEndereco(pesquisa.getString("med_endereco"));
                med.setSalario(Double.parseDouble(pesquisa.getString("med_salario")));
                med.setCrm(pesquisa.getString("med_crm"));
                med.setEspecialidade(pesquisa.getString("med_especialidade"));
                med.setAdm_id(pesquisa.getString("adm_id"));
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
