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

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            administrador.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            administrador.setSenha(senha);

            
            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    administrador.setData_nascimento(dataNasc);
                } else {
                    return "DATA DE NASCIMENTO INVALIDA!";
                }
            } catch (Exception e) {
                return "DATA DE NASCIMENTO INVALIDA!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF INVALIDO!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                return "CPF JÁ EXISTENTE!";
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

            if (AdministradorDAO.cadastrarFunc(administrador)) {
                return null;
            } else {
                return "ERRO NO CADASTRO!";
            }

        } else if (tipo.equalsIgnoreCase("atendente")) {
            Atendente atendente = new Atendente();

            atendente.setId("ate" + String.valueOf(AtendenteDAO.contarAtend() + 1));    //ID AUTOINCREMENT

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            atendente.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            atendente.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    atendente.setData_nascimento(dataNasc);
                } else {
                    return "DATA DE NASCIMENTO INVALIDA!";
                }
            } catch (Exception e) {
                return "DATA DE NASCIMENTO INVALIDA!";
            }
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                System.out.println("CPF JÁ EXISTENTE");
                return "CPF JÁ EXISTENTE!";
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

            if (AdministradorDAO.cadastrarFunc(atendente)) {
                return null;
            } else {
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }

        } else if (tipo.equalsIgnoreCase("enfermeira")) {
            Enfermeira enfermeira = new Enfermeira();

            enfermeira.setId("enf" + String.valueOf(EnfermeiraDAO.contarEnf() + 1));    //ID AUTOINCREMENT   ESSA LINE

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            enfermeira.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            enfermeira.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    enfermeira.setData_nascimento(dataNasc);
                } else {
                    return "DATA DE NASCIMENTO INVALIDA!";
                }
            } catch (Exception e) {
                return "DATA DE NASCIMENTO INVALIDA!";
            }
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                System.out.println("CPF JÁ EXISTENTE");
                return "CPF JÁ EXISTENTE!";
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

            if (AdministradorDAO.cadastrarFunc(enfermeira)) {
                return null;
            } else {
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }
        } else if (tipo.equalsIgnoreCase("medico")) {
            Medico medico = new Medico();

            medico.setId("med" + String.valueOf(MedicoDAO.contarMedic() + 1));    //ID AUTOINCREMENT THIS LINE TOO

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            medico.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            medico.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    medico.setData_nascimento(dataNasc);
                } else {
                    return "DATA DE NASCIMENTO INVALIDA!";
                }
            } catch (Exception e) {
                return "DATA DE NASCIMENTO INVALIDA!";
            }
            
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                System.out.println("CPF JÁ EXISTENTE");
                return "CPF JÁ EXISTENTE!";
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

            if (AdministradorDAO.cadastrarFunc(medico)) {
                return null;
            } else {
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

    public static boolean pesquisarFuncionarioId(String Id) {
        return AdministradorDAO.pesquisarFunId(Id);
    }

    public static boolean pesquisarFuncionarioCPF(String cpf) {
        return AdministradorDAO.pesquisarFunCPF(cpf);
    }

    public static void carregaTabela(DefaultTableModel modelo, boolean adm, boolean ate, boolean enf, boolean med) {
        AdministradorDAO.carregarTab(modelo, adm, ate, enf, med);
    }

    public static void pesquisaTabelaNome(DefaultTableModel modelo, boolean adm, boolean ate, boolean enf, boolean med, String nome) {
        AdministradorDAO.pesquisarTabNome(modelo, adm, ate, enf, med, nome);
    }

    public static String alterarFuncionario(String tipo, String id, String senha, String nome, String[] data_nascimento, String cpf, String telefone, String endereco, String salario, String crM, String especialidade) {
        if (tipo.equalsIgnoreCase("adm")) {
            Administrador administrador = new Administrador();

            administrador.setId(id);

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            administrador.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            administrador.setSenha(senha);
            try {
                administrador.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            } catch (ArrayIndexOutOfBoundsException aibe) {
                return "DATA INVALIDA";
            }
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(pesquisarAdministradorID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    System.out.println("CPF JÁ EXISTENTE");
                    return "CPF JÁ EXISTENTE!";
                }
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

            if (AdministradorDAO.alterarFunc(administrador)) {
                return null;
            } else {
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }

        } else if (tipo.equalsIgnoreCase("ate")) {
            Atendente atendente = new Atendente();

            atendente.setId(id);

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            atendente.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            atendente.setSenha(senha);

            try {
                atendente.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            } catch (ArrayIndexOutOfBoundsException aibe) {
                return "DATA INVALIDA";
            }
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(AtendenteController.pesquisarAtendenteID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    System.out.println("CPF JÁ EXISTENTE");
                    return "CPF JÁ EXISTENTE!";
                }
            }

            atendente.setCpf(cpf);

            atendente.setTelefone(telefone);
            atendente.setEndereco(endereco);

            try {
                atendente.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "SALARIO INVALIDO!";
            }

            atendente.setAdm_id("");

            System.out.println(atendente.toString());

            if (AdministradorDAO.alterarFunc(atendente)) {
                return null;
            } else {
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }

        } else if (tipo.equalsIgnoreCase("enf")) {
            Enfermeira enfermeira = new Enfermeira();

            enfermeira.setId(id);

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            enfermeira.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            enfermeira.setSenha(senha);

            try {
                enfermeira.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            } catch (ArrayIndexOutOfBoundsException aibe) {
                return "DATA INVALIDA";
            }
            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(EnfermeiraController.pesquisarEnfermeiraID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    System.out.println("CPF JÁ EXISTENTE");
                    return "CPF JÁ EXISTENTE!";
                }
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
            enfermeira.setAdm_id("");

            System.out.println(enfermeira.toString());

            if (AdministradorDAO.alterarFunc(enfermeira)) {
                return null;
            } else {
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }
        } else if (tipo.equalsIgnoreCase("med")) {
            Medico medico = new Medico();

            medico.setId(id);

            if (nome.equals("")) {
                return "NOME INVALIDO!";
            }
            medico.setNome(nome);

            if (senha.equals("")) {
                return "SENHA INVALIDA!";
            }
            medico.setSenha(senha);

            try {
                medico.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);
            } catch (ArrayIndexOutOfBoundsException aibe) {
                return "DATA INVALIDA";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(MedicoController.pesquisarMedicoID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    System.out.println("CPF JÁ EXISTENTE");
                    return "CPF JÁ EXISTENTE!";
                }
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
            medico.setAdm_id("");

            System.out.println(medico.toString());

            if (AdministradorDAO.alterarFunc(medico)) {
                return null;
            } else {
                return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
            }
        }

        return "ERRO NO CADASTRO! [NENHUM TIPO SELECIONADO]";

    }

}
