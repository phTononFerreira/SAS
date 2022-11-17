package com.sas.model;

public class Medico extends Funcionario {

    private String crm;
    private String especialidade;
    private String adm_id;

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(String adm_id) {
        this.adm_id = adm_id;
    }

    public Medico() {
    }

    public Medico(String crm, String especialidade, String adm_id) {
        this.crm = crm;
        this.especialidade = especialidade;
        this.adm_id = adm_id;
    }

}
