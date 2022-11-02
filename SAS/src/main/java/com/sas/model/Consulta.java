package com.sas.model;

public class Consulta {

	private int id;
	private Date data;
	private String receita;
	private int status;
	private int pac_id;
	private int med_id;
	private int pro_id;
	private int ate_id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
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

	public int getPac_id() {
		return pac_id;
	}
	public void setPac_id(int pac_id) {
		this.pac_id = pac_id;
	}

	public int getMed_id() {
		return med_id;
	}
	public void setMed_id(int med_id) {
		this.med_id = med_id;
	}

	public int getPro_id() {
		return pro_id;
	}
	public void setPro_id(int pro_id) {
		this.pro_id = pro_id;
	}

	public int getAte_id() {
		return ate_id;
	}
	public void setAte_id(int ate_id) {
		this.ate_id = ate_id;
	}

	public Consulta() {
	}

	public Consulta(int id, Date data, String receita, int status, int pac_id, int med_id, int pro_id, int ate_id) {
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
