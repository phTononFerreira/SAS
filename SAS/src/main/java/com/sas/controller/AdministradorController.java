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
import java.time.Year;

import javax.swing.table.DefaultTableModel;

public class AdministradorController {

    public static String cadastrarFuncionario(String tipo, String id_adm, String senha, String nome, String[] data_nascimento, String cpf, String telefone, String endereco, String salario, String crM, String especialidade) {
        if (tipo.equalsIgnoreCase("administrador")) {
            Administrador administrador = new Administrador();

            administrador.setId("adm" + String.valueOf(AdministradorDAO.contarAdmin() + 1));    //ID AUTOINCREMENT

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            administrador.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválido!";
            }
            administrador.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        administrador.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF inválido!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                return "CPF já existente!";
            }
            administrador.setCpf(cpf);

            administrador.setTelefone(telefone);
            administrador.setEndereco(endereco);

            try {
                if (Double.parseDouble(salario) > 0){
                    administrador.setSalario(Double.parseDouble(salario));
                }else{
                    return "Salário inválido!";
                }
                
            } catch (Exception e) {
                return "Salário inválido!";
            }

            System.out.println(administrador.toString());

            if (AdministradorDAO.cadastrarFunc(administrador)) {
                return administrador.getId();
            } else {
                return "Erro no cadastro!";
            }

        } else if (tipo.equalsIgnoreCase("atendente")) {
            Atendente atendente = new Atendente();

            atendente.setId("ate" + String.valueOf(AtendenteDAO.contarAtend() + 1));    //ID AUTOINCREMENT

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            atendente.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválido!";
            }
            atendente.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        atendente.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF inválido!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                return "CPF já existente!";
            }

            atendente.setCpf(cpf);

            atendente.setTelefone(telefone);
            atendente.setEndereco(endereco);

            try {
                atendente.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            atendente.setAdm_id(id_adm);

            System.out.println(atendente.toString());

            if (AdministradorDAO.cadastrarFunc(atendente)) {
                return atendente.getId();
            } else {
                return "Erro no cadastro!";
            }

        } else if (tipo.equalsIgnoreCase("enfermeira")) {
            Enfermeira enfermeira = new Enfermeira();

            enfermeira.setId("enf" + String.valueOf(EnfermeiraDAO.contarEnf() + 1));    //ID AUTOINCREMENT   ESSA LINE

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            enfermeira.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválida!";
            }
            enfermeira.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        enfermeira.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF INVALIDO!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                return "CPF já existente!";
            }

            enfermeira.setCpf(cpf);

            enfermeira.setTelefone(telefone);
            enfermeira.setEndereco(endereco);

            try {
                enfermeira.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            if (crM.equals("")) {
                return "CR inválido!";
            }
            enfermeira.setCr(crM);

            enfermeira.setAdm_id(id_adm);

            System.out.println(enfermeira.toString());

            if (AdministradorDAO.cadastrarFunc(enfermeira)) {
                return enfermeira.getId();
            } else {
                return "Erro no cadastro!";
            }
        } else if (tipo.equalsIgnoreCase("medico")) {
            Medico medico = new Medico();

            medico.setId("med" + String.valueOf(MedicoDAO.contarMedic() + 1));    //ID AUTOINCREMENT THIS LINE TOO

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            medico.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválida!";
            }
            medico.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        medico.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF INVALIDO!";
            }

            if (!pesquisarFuncionarioCPF(cpf)) {
                return "CPF já existente!";
            }

            medico.setCpf(cpf);

            medico.setTelefone(telefone);
            medico.setEndereco(endereco);

            try {
                medico.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            if (crM.equals("")) {
                return "CRM inválido!";
            }
            medico.setCrm(crM);

            if (especialidade.equals("")) {
                medico.setEspecialidade("Clínico geral");
            } else {
                medico.setEspecialidade(especialidade);
            }

            medico.setAdm_id(id_adm);

            System.out.println(medico.toString());

            if (AdministradorDAO.cadastrarFunc(medico)) {
                return medico.getId();
            } else {
                return "Erro no cadastro!";
            }
        }

        return "Erro no cadastro!";
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
                return "Nome inválido!";
            }
            administrador.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválida!";
            }
            administrador.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        administrador.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(pesquisarAdministradorID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    System.out.println("CPF JÁ EXISTENTE");
                    return "CPF já existente!";
                }
            }

            administrador.setCpf(cpf);

            administrador.setTelefone(telefone);
            administrador.setEndereco(endereco);

            try {
                administrador.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            System.out.println(administrador.toString());

            if (AdministradorDAO.alterarFunc(administrador)) {
                return null;
            } else {
                return "Erro no cadastro!";
            }

        } else if (tipo.equalsIgnoreCase("ate")) {
            Atendente atendente = new Atendente();

            atendente.setId(id);

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            atendente.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválida!";
            }
            atendente.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        atendente.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(AtendenteController.pesquisarAtendenteID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    return "CPF já existente!";
                }
            }

            atendente.setCpf(cpf);

            atendente.setTelefone(telefone);
            atendente.setEndereco(endereco);

            try {
                atendente.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            atendente.setAdm_id("");

            System.out.println(atendente.toString());

            if (AdministradorDAO.alterarFunc(atendente)) {
                return null;
            } else {
                return "Erro no cadastro!";
            }

        } else if (tipo.equalsIgnoreCase("enf")) {
            Enfermeira enfermeira = new Enfermeira();

            enfermeira.setId(id);

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            enfermeira.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválida!";
            }
            enfermeira.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        enfermeira.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                System.out.println("CPF INVÁLIDO");
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(EnfermeiraController.pesquisarEnfermeiraID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    System.out.println("CPF JÁ EXISTENTE");
                    return "CPF já existente!";
                }
            }

            enfermeira.setCpf(cpf);

            enfermeira.setTelefone(telefone);
            enfermeira.setEndereco(endereco);

            try {
                enfermeira.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            enfermeira.setCr(crM);
            enfermeira.setAdm_id("");

            System.out.println(enfermeira.toString());

            if (AdministradorDAO.alterarFunc(enfermeira)) {
                return null;
            } else {
                return "Erro no cadastro!";
            }
        } else if (tipo.equalsIgnoreCase("med")) {
            Medico medico = new Medico();

            medico.setId(id);

            if (nome.equals("")) {
                return "Nome inválido!";
            }
            medico.setNome(nome);

            if (senha.equals("")) {
                return "Senha inválida!";
            }
            medico.setSenha(senha);

            try {
                String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
                if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                    if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > 1920) {
                        medico.setData_nascimento(dataNasc);
                    } else {
                        return "Ano de nascimento inválido!";
                    }
                } else {
                    return "Data de nascimento inválida!";
                }
            } catch (Exception e) {
                return "Data de nascimento inválida!";
            }

            if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
                return "CPF INVALIDO!";
            }

            if (!cpf.equals(MedicoController.pesquisarMedicoID(id).getCpf())) {
                if (!pesquisarFuncionarioCPF(cpf)) {
                    return "CPF já existente!";
                }
            }

            medico.setCpf(cpf);

            medico.setTelefone(telefone);
            medico.setEndereco(endereco);

            try {
                medico.setSalario(Double.parseDouble(salario));
            } catch (Exception e) {
                return "Salário inválido!";
            }

            medico.setCrm(crM);
            medico.setEspecialidade(especialidade);
            medico.setAdm_id("");

            System.out.println(medico.toString());

            if (AdministradorDAO.alterarFunc(medico)) {
                return null;
            } else {
                return "Erro no cadastro!";
            }
        }

        return "Erro no cadastro! [NENHUM TIPO SELECIONADO]";

    }

}
