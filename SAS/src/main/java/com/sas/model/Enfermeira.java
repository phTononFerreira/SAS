package com.sas.model;

public class Enfermeira extends Funcionario {

	private String cr;
	private int adm_id;

	public String getCr() {
		return cr;
	}
	public void setCr(String cr) {
		this.cr = cr;
	}

	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public Enfermeira() {
	}

	public Enfermeira(String cr, int adm_id) {
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

}
