package com.sas.model;

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

}
