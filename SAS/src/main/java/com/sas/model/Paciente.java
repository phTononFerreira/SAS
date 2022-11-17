package com.sas.model;

public class Paciente {

    private String id;
    private String nome;
    private String data_nascimento;
    private String telefone;
    private String cpf;
    private String endereco;

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

    public String getData_nascimento() {
        return data_nascimento;
    }

    public void setData_nascimento(String data_nascimento) {
        this.data_nascimento = data_nascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Paciente() {
    }

    public Paciente(String id, String nome, String data_nascimento, String telefone, String cpf, String endereco) {
        this.id = id;
        this.nome = nome;
        this.data_nascimento = data_nascimento;
        this.telefone = telefone;
        this.cpf = cpf;
        this.endereco = endereco;
    }

}
