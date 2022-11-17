package com.sas.model;

import java.util.Date;

public abstract class Funcionario {

    private String id;
    private String senha;
    private String nome;
    private String data_nascimento;
    private String cpf;
    private String telefone;
    private String endereco;
    private double salario;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSenha() {
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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
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

    public Funcionario(String id, String senha, String nome, String data_nascimento, String cpf, String telefone, String endereco,
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
