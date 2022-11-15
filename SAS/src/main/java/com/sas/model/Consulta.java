package com.sas.model;

import java.util.Date;

public class Consulta {

	private String id;
	private Date data;
	private String receita;
	private int status;
	private String pac_id;
	private String med_id;
	private String pro_id;
	private String ate_id;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}

	public String getReceita() {
		return receita;
	}
	public void setReceita(String receita) {
		this.receita = receita;
	}

	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public String getPac_id() {
		return pac_id;
	}
	public void setPac_id(String pac_id) {
		this.pac_id = pac_id;
	}

	public String getMed_id() {
		return med_id;
	}
	public void setMed_id(String med_id) {
		this.med_id = med_id;
	}

	public String getPro_id() {
		return pro_id;
	}
	public void setPro_id(String pro_id) {
		this.pro_id = pro_id;
	}

	public String getAte_id() {
		return ate_id;
	}
	public void setAte_id(String ate_id) {
		this.ate_id = ate_id;
	}

	public Consulta() {
	}

	public Consulta(String id, Date data, String receita, int status, String pac_id, String med_id, String pro_id, String ate_id) {
		this.id = id;
		this.data = data;
		this.receita = receita;
		this.status = status;
		this.pac_id = pac_id;
		this.med_id = med_id;
		this.pro_id = pro_id;
		this.ate_id = ate_id;
	} 

}
