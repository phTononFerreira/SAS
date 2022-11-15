package com.sas.model;

import com.sas.controller.ConexaoBD;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;

public class Atendente extends Funcionario {

        private String adm_id;

	public String getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(String ate_id) {
		this.adm_id = ate_id;
	}

	public Atendente() {
	}

	public Atendente(String adm_id) {
		this.adm_id = adm_id;
	}

	public Paciente cadastrarPac() {
		return null;
	}

	public void editarPac(Paciente pac) {

	}

	public void encaminharTriagem(Consulta con) {

	}

	public Consulta agendarCon() {
		return null;
	}

	public void cancelarCon(Consulta con) {

	}          
        
        public static Atendente pesquisarAtendenteID(String ID) {
        ResultSet pesquisa = ConexaoBD.getConexao().executarQueryBD("SELECT * FROM atendente WHERE ate_id = '" + ID + "'");
        Atendente ate = null;
        try {
            if (pesquisa.isBeforeFirst()) {
                ate = new Atendente();
                pesquisa.next();
                ate.setId(pesquisa.getString("ate_id"));
                ate.setSenha(pesquisa.getString("ate_senha"));
                ate.setNome(pesquisa.getString("ate_nome"));
                ate.setData_nascimento(new SimpleDateFormat("yyyy-MM-dd").parse(pesquisa.getString("ate_dataNasc")));
                ate.setCpf(pesquisa.getString("ate_cpf"));
                ate.setTelefone(pesquisa.getString("ate_telefone"));
                ate.setEndereco(pesquisa.getString("ate_endereco"));
                ate.setSalario(Double.parseDouble(pesquisa.getString("ate_salario")));
                ate.setAdm_id(pesquisa.getString("adm_id")));
                //System.out.println(adm.toString());
            }else{
                ate = null;
            }

        } catch (Exception e) {
            System.out.println("ERRO NA FORMATAÇÃO => "+e);
        }

        return ate;
    }
}
