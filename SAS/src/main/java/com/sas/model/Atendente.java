package com.sas.model;

public class Atendente extends Funcionario {

	private int ate_id;

	public int getAte_id() {
		return ate_id;
	}
	public void setAte_id(int ate_id) {
		this.ate_id = ate_id;
	}

	public Atendente() {
	}

	public Atendente(int ate_id) {
		this.ate_id = ate_id;
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
