package com.sas.model;

public class Enfermeira extends Funcionario {

    private String cr;
    private String adm_id;

    public String getCr() {
        return cr;
    }

    public void setCr(String cr) {
        this.cr = cr;
    }

    public String getAdm_id() {
        return adm_id;
    }

    public void setAdm_id(String adm_id) {
        this.adm_id = adm_id;
    }

    public Enfermeira() {
    }

    public Enfermeira(String cr, String adm_id) {
        this.cr = cr;
        this.adm_id = adm_id;
    }

}
