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

import javax.swing.table.DefaultTableModel;

public class AdministradorController {

    public static String cadastrarFuncionario(String tipo, String id_adm, String senha, String nome, String[] data_nascimento, String cpf, String telefone, String endereco, String salario, String crM, String especialidade) {
        if (tipo.equalsIgnoreCase("administrador")) {
            Administrador administrador = new Administrador();
            
            administrador.setId("adm" + String.valueOf(AdministradorDAO.contarAdmin() + 1));    //ID AUTOINCREMENT
            
            if (nome.equals(""))
                return "NOME INVALIDO!";
            administrador.setNome(nome);
            
            if (senha.equals(""))
                return "SENHA INVALIDA!";
            administrador.setSenha(senha);
            
            administrador.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
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
            
            System.out.println(administrador.toString());
            
            if (AdministradorDAO.cadastrarFunc(administrador)){
                return null;
            }else{
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }
            
        } else if (tipo.equalsIgnoreCase("atendente")) {
            Atendente atendente = new Atendente();
            
            atendente.setId("ate" + String.valueOf(AtendenteDAO.contarAtend() + 1));    //ID AUTOINCREMENT
            
            if (nome.equals(""))
                return "NOME INVALIDO!";
            atendente.setNome(nome);
            
            if (senha.equals(""))
                return "SENHA INVALIDA!";
            atendente.setSenha(senha);
            
            atendente.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }
            atendente.setCpf(cpf);
            
            atendente.setTelefone(telefone);
            atendente.setEndereco(endereco);
            
            try {
                atendente.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "SALARIO INVALIDO!";
            }
            
            atendente.setAdm_id(id_adm);
            
            System.out.println(atendente.toString());
            
            if (AdministradorDAO.cadastrarFunc(atendente)){
                return null;
            }else{
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }

        } else if (tipo.equalsIgnoreCase("enfermeira")) {
            Enfermeira enfermeira = new Enfermeira();
            
            enfermeira.setId("enf" + String.valueOf(AtendenteDAO.contarAtend() + 1));    //ID AUTOINCREMENT
            
            if (nome.equals(""))
                return "NOME INVALIDO!";
            enfermeira.setNome(nome);
            
            if (senha.equals(""))
                return "SENHA INVALIDA!";
            enfermeira.setSenha(senha);
            
            enfermeira.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }
            enfermeira.setCpf(cpf);
            
            enfermeira.setTelefone(telefone);
            enfermeira.setEndereco(endereco);
            
            try {
                enfermeira.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "SALARIO INVALIDO!";
            }
            
            enfermeira.setCr(crM);
            enfermeira.setAdm_id(id_adm);
            
            System.out.println(enfermeira.toString());
            
            if (AdministradorDAO.cadastrarFunc(enfermeira)){
                return null;
            }else{
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }
        } else if (tipo.equalsIgnoreCase("medico")) {
            Medico medico = new Medico();
            
            medico.setId("med" + String.valueOf(AtendenteDAO.contarAtend() + 1));    //ID AUTOINCREMENT
            
            if (nome.equals(""))
                return "NOME INVALIDO!";
            medico.setNome(nome);
            
            if (senha.equals(""))
                return "SENHA INVALIDA!";
            medico.setSenha(senha);
            
            medico.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }
            medico.setCpf(cpf);
            
            medico.setTelefone(telefone);
            medico.setEndereco(endereco);
            
            try {
                medico.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "SALARIO INVALIDO!";
            }
            
            medico.setCrm(crM);
            medico.setEspecialidade(especialidade);
            medico.setAdm_id(id_adm);
            
            System.out.println(medico.toString());
            
            if (AdministradorDAO.cadastrarFunc(medico)){
                return null;
            }else{
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }
        }

        return "ERRO NO CADASTRO! [NENHUM TIPO SELECIONADO]";
    }
    
    public static String editarFuncionario(Funcionario func) {
        return "STATUS DA EDIÇÃO!";
    }
    
    public static Administrador pesquisarAdministradorID(String ID) {
        return AdministradorDAO.pesquisarAdminID(ID);
    }
    
    public static void carregaTabela(DefaultTableModel modelo, boolean adm, boolean ate, boolean enf, boolean med) {
        AdministradorDAO.carregaTab(modelo, adm, ate, enf, med);
    }
    
    public static void pesquisaTabelaNome(DefaultTableModel modelo, boolean adm, boolean ate, boolean enf, boolean med, String nome) {
        AdministradorDAO.pesquisaTabNome(modelo, adm, ate, enf, med, nome);
    }

}
