package com.sas.controller;

import static com.sas.controller.AdministradorController.pesquisarFuncionarioCPF;
import com.sas.dao.AtendenteDAO;
import com.sas.dao.ProntuarioDAO;
import com.sas.dao.ConsultaDAO;
import com.sas.dao.PacienteDAO;
import com.sas.model.Atendente;
import com.sas.model.Consulta;
import com.sas.model.Prontuario;
import com.sas.model.Paciente;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;

public class AtendenteController {

    public static String cadastrarPaciente(String nome, String[] data_nascimento, String cpf, String telefone, String endereco) {
        Paciente paciente = new Paciente();

        paciente.setId("pac" + String.valueOf(PacienteDAO.contarPac() + 1));    //ID AUTOINCREMENT

        if (nome.equals("")) {
            return "NOME INVALIDO!";
        }
        paciente.setNome(nome);

        try {
            String dataNasc = data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0];
            if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                if (Integer.parseInt(data_nascimento[2]) <= Year.now().getValue() && Integer.parseInt(data_nascimento[2]) > Year.now().getValue()-100) {
                    paciente.setData_nascimento(dataNasc);
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

        if (!pesquisarFuncionarioCPF(cpf)) {
            System.out.println("CPF JÁ EXISTENTE");
            return "CPF JÁ EXISTENTE!";
        }

        paciente.setCpf(cpf);

        paciente.setTelefone(telefone);
        paciente.setEndereco(endereco);

        System.out.println(paciente.toString());

        if (AtendenteDAO.cadastrarPac(paciente)) {
            return null;
        } else {
            return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
        }

    }

    public static String editarPaciente(String id, String nome, String data_nascimento, String cpf, String telefone, String endereco) {
        Paciente paciente = new Paciente();

        if (id == null){
            return "Selecione um paciente da tabela!";
        }
        paciente.setId(id);

        if (nome.equals("")) {
            return "NOME INVALIDO!";
        }
        paciente.setNome(nome);

        String[] dataNascimentoFormata = data_nascimento.split("/");
        
        try {
            String dataNasc = dataNascimentoFormata[2] + "-" + dataNascimentoFormata[1] + "-" + dataNascimentoFormata[0];
            if (dataNasc.matches("[0-9]+-(0?[1-9]|[1][0-2])-(0?[1-9]|[12][0-9]|3[01])")) {
                if (Integer.parseInt(dataNascimentoFormata[2]) <= Year.now().getValue() && Integer.parseInt(dataNascimentoFormata[2]) > Year.now().getValue()-100) {
                    paciente.setData_nascimento(dataNasc);
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

        if (!cpf.equals(PacienteController.pesquisarPacienteID(id).getCpf())) {
            if (!pesquisarFuncionarioCPF(cpf)) {
                System.out.println("CPF JÁ EXISTENTE");
                return "CPF JÁ EXISTENTE!";
            }
        }

        paciente.setCpf(cpf);

        paciente.setTelefone(telefone);
        paciente.setEndereco(endereco);

        System.out.println(paciente.toString());

        if (AtendenteDAO.editarPac(paciente)) {
            return null;
        } else {
            return "ERRO NO EDITAR PACIENTE";
        }
    }

    public static void encaminharTriagem(Consulta con) {

    }

    public static String agendarConsulta(int status, String pac_id, String med_id, String ate_id, String data, String hora, String receita) {
        Consulta consulta = new Consulta();

        if (pac_id == null){
            return "Selecione um paciente da tabela!";
        }
        consulta.setPac_id(pac_id);
        
        if (med_id== null){
            return "Selecione um médico da tabela!";
        }
        consulta.setMed_id(med_id);
        
        consulta.setId("con" + String.valueOf(ConsultaDAO.contarCon() + 1));    //ID AUTOINCREMENT

        String[] dataFormata = data.split("/");

        if (data.equals("")) {
            return "DATA INVALIDO!";
        } else if (!data.matches("([0-9]+(/[0-9]+)+)")) {
            return "DATA FORA DO PADRÃO!";
        } else if (!(Integer.parseInt(dataFormata[0]) > 0 && Integer.parseInt(dataFormata[0]) <= 31)) {
            return "DIA INVALIDO!";
        } else if (!(Integer.parseInt(dataFormata[1]) > 0 && Integer.parseInt(dataFormata[1]) <= 12)) {
            return "MES INVALIDO!";
        } else if (!(Integer.parseInt(dataFormata[2]) >= 1900 && Integer.parseInt(dataFormata[2]) <= 2100)) {
            return "ANO INVALIDO!";
        }

        String[] horaFormata = hora.split(":");
        if (hora.equals("")) {
            return "HORA INVALIDO!";
        } else if (!hora.matches("([0-9]+(:[0-9]+)+)")) {
            return "HORA FORA DO PADRÃO!";
        } else if (!(Integer.parseInt(horaFormata[0]) >= 0 && Integer.parseInt(horaFormata[0]) <= 24)) {
            return "HORA INVALIDO!";
        } else if (!(Integer.parseInt(horaFormata[1]) >= 0 && Integer.parseInt(horaFormata[1]) <= 60)) {
            return "MINUTO INVALIDO!";
        } else if (!(Integer.parseInt(horaFormata[2]) >= 0 && Integer.parseInt(horaFormata[2]) <= 60)) {
            return "SEGUNDO INVALIDO!";
        }
        
        LocalDate localDate = LocalDate.now();
                
        if(Integer. parseInt(dataFormata[2]) < Integer.parseInt(localDate.toString().split("-")[0]))
            return "ANO INVALIDO!";
        else if(Integer. parseInt(dataFormata[2]) == Integer.parseInt(localDate.toString().split("-")[0]) && Integer.parseInt(dataFormata[1]) < Integer.parseInt(localDate.toString().split("-")[1]))
            return "MES INVALIDO!";
        else if(Integer. parseInt(dataFormata[2]) == Integer.parseInt(localDate.toString().split("-")[0]) && Integer.parseInt(dataFormata[1]) == Integer.parseInt(localDate.toString().split("-")[1]) && Integer.parseInt(dataFormata[0]) < Integer.parseInt(localDate.toString().split("-")[2]))    
            return "DIA INVALIDO!";
        
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatterHora = DateTimeFormatter.ofPattern("HH:mm:ss");
        String horaNowFormatada = formatterHora.format(agora);
                
        if(Integer. parseInt(horaFormata[0]) < Integer.parseInt(horaNowFormatada.split(":")[0]))
            return "HORA INVALIDO!";
        else if(Integer. parseInt(horaFormata[0]) == Integer.parseInt(horaNowFormatada.split(":")[0]) && Integer.parseInt(horaFormata[1]) < Integer.parseInt(horaNowFormatada.split(":")[1]))
            return "MINUTO INVALIDO!";
        else if(Integer. parseInt(horaFormata[0]) == Integer.parseInt(horaNowFormatada.split(":")[0]) && Integer.parseInt(horaFormata[1]) == Integer.parseInt(horaNowFormatada.split(":")[1]) && Integer.parseInt(horaFormata[2]) < Integer.parseInt(horaNowFormatada.split(":")[2]))    
            return "SEGUNDO INVALIDO!";

        consulta.setData(dataFormata[2] + "-" + dataFormata[1] + "-" + dataFormata[0] + " " + hora);
        consulta.setReceita(receita);
        consulta.setAte_id(ate_id);
        
        consulta.setStatus(status);

        consulta.setPro_id(cadastrarTriagem(pac_id));

        System.out.println(consulta.toString());

        if (AtendenteDAO.agendarCon(consulta)) {
            return null;
        } else {
            return "ERRO NO AGENDAMENTO!";
        }
    }

    public static Consulta pesquisarConsultaID() {
        return null;
    }

    public static String cancelarConsulta(String consultaID) {
        if(consultaID == null)
            return "Selecione uma consulta da tabela!";
        
        if (consultaID != null && AtendenteDAO.cancelarCon(consultaID)) {
            return null;
        } else {
            return "ERRO AO CANCELAR CONSULTA!!";
        }

    }

    public static Atendente pesquisarAtendenteID(String ID) {
        return AtendenteDAO.pesquisarAteID(ID);
    }
    
    public static void cancelarConsultaAutomatico() {
        AtendenteDAO.cancelarConAutomatico();
    }
    
    public static void encaminharConsultaAutomatico() {
        AtendenteDAO.encaminharConAutomatico();
    }

    public static void carregaTabela(DefaultTableModel modelo) {
        AtendenteDAO.carregaTab(modelo);
    }

    public static void carregaTabelaPaciente(DefaultTableModel modelo) {
        AtendenteDAO.carregaTabPaciente(modelo);
    }

    public static void pesquisaTabelaPaciente(DefaultTableModel modelo, String nome) {
        AtendenteDAO.pesquisaTabPaciente(modelo, nome);
    }

    public static void carregaTabelaMedico(DefaultTableModel modelo) {
        AtendenteDAO.carregaTabMedico(modelo);
    }

    public static void pesquisaTabelaMedico(DefaultTableModel modelo, String nome) {
        AtendenteDAO.pesquisaTabMedico(modelo, nome);
    }

    public static String cadastrarTriagem(String pac_id) {
        Prontuario prontuario = new Prontuario();

        prontuario.setId("pro" + String.valueOf(ProntuarioDAO.contarPro() + 1));    //ID AUTOINCREMENT

        prontuario.setPac_id(pac_id);
        prontuario.setEnf_id(null);
        prontuario.setDescricao("");
        prontuario.setPressao("0/0");
        prontuario.setTemperatura(0);

        AtendenteDAO.cadastrarTri(prontuario);

        return prontuario.getId();
    }

    public static void carregaTabelaPacienteEdit(DefaultTableModel modelo) {
        AtendenteDAO.carregaTabPacienteEdit(modelo);
    }

    public static void pesquisaTabelaPacienteEdit(DefaultTableModel modelo, String nome) {
        AtendenteDAO.pesquisaTabPacienteEdit(modelo, nome);
    }

    public static String alterarStatusConsulta(String idConsulta, int status) {
        if(idConsulta == null)
            return "Selecione uma consulta da tabela!";
        
        
        if (AtendenteDAO.alterarStatusCon(idConsulta, status)) {
            return null;
        } else {
            return "ERRO AO ALTERAR STATUS";
        }
    }

}
