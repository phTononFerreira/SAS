package com.sas.model;

public class Atendente extends Funcionario {

	private int adm_id;

	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}

	public Atendente() {
	}

	public Atendente(int adm_id) {
		this.adm_id = adm_id;
	}

	public Paciente cadastrarPac() {
		return null;
	}

	public void editarPac(Paciente pac) {

	}

	public void encaminharTriagem(Consulta con) {

	}

	public Consulta agendarCon() {
		return null;
	}

	public void cancelarCon(Consulta con) {

	}

}
