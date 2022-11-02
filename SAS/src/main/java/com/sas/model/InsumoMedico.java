package com.sas.model;

public class InsumoMedico {

	private int id;
	private String nome;
	private int quantidade;
	private int enf_id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	public int getEnf_id() {
		return enf_id;
	}
	public void setEnf_id(int enf_id) {
		this.enf_id = enf_id;
	}

	public InsumoMedico() {
	}

	public InsumoMedico(int id, String nome, int quantidade, int enf_id) {
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.enf_id = enf_id;
	}

}
