package com.sas.model;

public class InsumoMedico {

	private String id;
	private String nome;
	private int quantidade;
	private String enf_id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public String getEnf_id() {
		return enf_id;
	}
	public void setEnf_id(String enf_id) {
		this.enf_id = enf_id;
	}

	public InsumoMedico() {
	}

	public InsumoMedico(String id, String nome, int quantidade, String enf_id) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.enf_id = enf_id;
	}

}
