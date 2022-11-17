package com.sas.model;

public class Atendente extends Funcionario {

    private String adm_id;

    public String getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(String ate_id) {
        this.adm_id = ate_id;
    }

    public Atendente() {
        adm_id = "";
    }

    public Atendente(String adm_id) {
        this.adm_id = adm_id;
    }

}
