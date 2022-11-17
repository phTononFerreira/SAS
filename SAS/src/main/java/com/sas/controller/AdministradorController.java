package com.sas.controller;

import com.sas.model.Administrador;
import com.sas.model.Atendente;
import com.sas.model.Enfermeira;
import com.sas.model.Funcionario;
import com.sas.model.Medico;

import com.sas.dao.AdministradorDAO;
import com.sas.dao.AtendenteDAO;
import com.sas.dao.EnfermeiraDAO;
import com.sas.dao.MedicoDAO;

public class AdministradorController {

    public static String cadastrarFuncionario(String tipo, String id_adm, String senha, String nome, String[] data_nascimento, String cpf, String telefone, String endereco, String salario, String cr, String crm, String especialidade) {
        if (tipo.equals("Administrador")) {
            Administrador administrador = new Administrador();
            administrador.setId("IdTeste");
            administrador.setNome(nome);
            administrador.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            if (cpf.matches("[A-Z]*")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }
            administrador.setCpf(cpf);
            administrador.setTelefone(telefone);
            administrador.setEndereco(endereco);
            try {
                administrador.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "SALARIO INVALIDO!";
            }
            
            if (AdministradorDAO.cadastrarFunc(administrador)){
                return "CADASTRADO COM SUCESSO!";
            }else{
                return "ERRO NO CADASTRO!";
            }
            
        } else if (tipo.equals("Atendente")) {

        } else if (tipo.equals("Enfermeira")) {

        } else if (tipo.equals("Enfermeira")) {

        }

        return "ERRO NO CADASTRO! [NENHUM TIPO SELECIONADO]";
    }
    
    public static void editarFuncionario(Funcionario func) {

    }
    
    public static Administrador pesquisarAdministradorID(String ID) {
        return AdministradorDAO.pesquisarAdminID(ID);
    }

}
