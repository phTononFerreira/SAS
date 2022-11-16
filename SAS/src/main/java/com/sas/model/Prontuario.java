package com.sas.model;

public class Prontuario {

	private String id;
	private float temperatura;
	private String pressao;
	private String descricao;
	private String pac_id;
	private String enf_id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
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

	public String getPac_id() {
		return pac_id;
	}
	public void setPac_id(String pac_id) {
		this.pac_id = pac_id;
	}

	public String getEnf_id() {
		return enf_id;
	}
	public void setEnf_id(String enf_id) {
		this.enf_id = enf_id;
	}

	public Prontuario() {
	}

	public Prontuario(String id, float temperatura, String pressao, String descricao, String pac_id, String enf_id) {
		this.id = id;
		this.temperatura = temperatura;
		this.pressao = pressao;
		this.descricao = descricao;
		this.pac_id = pac_id;
		this.enf_id = enf_id;
	}

}
