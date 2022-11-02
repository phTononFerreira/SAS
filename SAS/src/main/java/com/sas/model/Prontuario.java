package com.sas.model;

public class Prontuario {

	private int id;
	private float temperatura;
	private String pressao;
	private String descricao;
	private int pac_id;
	private int enf_id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public float getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(float temperatura) {
		this.temperatura = temperatura;
	}

	public String getPressao() {
		return pressao;
	}
	public void setPressao(String pressao) {
		this.pressao = pressao;
	}

	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getPac_id() {
		return pac_id;
	}
	public void setPac_id(int pac_id) {
		this.pac_id = pac_id;
	}

	public int getEnf_id() {
		return enf_id;
	}
	public void setEnf_id(int enf_id) {
		this.enf_id = enf_id;
	}

	public Prontuario() {
	}

	public Prontuario(int id, float temperatura, String pressao, String descricao, int pac_id, int enf_id) {
		this.id = id;
		this.temperatura = temperatura;
		this.pressao = pressao;
		this.descricao = descricao;
		this.pac_id = pac_id;
		this.enf_id = enf_id;
	}

}
