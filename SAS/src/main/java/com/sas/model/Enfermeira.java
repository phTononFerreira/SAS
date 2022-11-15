package com.sas.model;

public class Enfermeira extends Funcionario {

	private String cr;
	private int enf_id;

	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}

	public int getEnf_id() {
		return enf_id;
	}
	public void setEnf_id(int enf_id) {
		this.enf_id = enf_id;
	}

	public Enfermeira() {
	}

	public Enfermeira(String cr, int enf_id) {
		this.cr = cr;
		this.enf_id = enf_id;
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
}
