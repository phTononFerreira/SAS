package com.sas.model;

public abstract class Funcionario {

	private int id;
	private String senha;
	private String nome;
	private Date data_nascimento;
	private String cpf;
	private String telefone;
	private String endereco;
	private double salario;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public Funcionario() {
	}
	
	public Funcionario(int id, String senha, String nome, Date data_nascimento, String cpf, String telefone, String endereco,
			double salario) {
		this.id = id;
		this.senha = senha;
		this.nome = nome;
		this.data_nascimento = data_nascimento;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.salario = salario;
	}

}
