package com.sas.model;

public class Medico extends Funcionario {

	private int crm;
	private String especialidade;
	private int adm_id;

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

	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public Medico() {
	}
	
	public Medico(int crm, String especialidade, int adm_id) {
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

}
