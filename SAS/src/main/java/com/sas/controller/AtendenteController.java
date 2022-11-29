package com.sas.controller;

import static com.sas.controller.AdministradorController.pesquisarFuncionarioCPF;
import com.sas.dao.AtendenteDAO;
import com.sas.dao.PacienteDAO;
import com.sas.model.Atendente;
import com.sas.model.Consulta;
import com.sas.model.Paciente;
import javax.swing.table.DefaultTableModel;

public class AtendenteController {
    
    public static String cadastrarPaciente(String nome, String[] data_nascimento, String cpf, String telefone, String endereco) {
        Paciente paciente = new Paciente();

        paciente.setId("pac" + String.valueOf(PacienteDAO.contarPac() + 1));    //ID AUTOINCREMENT

        if (nome.equals(""))
            return "NOME INVALIDO!";
        paciente.setNome(nome);

        paciente.setData_nascimento(data_nascimento[2] + "-" + data_nascimento[1] + "-" + data_nascimento[0]);

        if (!cpf.matches("([0-9]+(\\.[0-9]+)+)-[0-9]+")) {
            System.out.println("CPF INVÁLIDO");
            return "CPF INVALIDO!";
        }
        
        if(!pesquisarFuncionarioCPF(cpf)){
            System.out.println("CPF JÁ EXISTENTE");
            return "CPF JÁ EXISTENTE!";
        }
            
        paciente.setCpf(cpf);

        paciente.setTelefone(telefone);
        paciente.setEndereco(endereco);

        System.out.println(paciente.toString());

        if (AtendenteDAO.cadastrarPac(paciente)){
            return null;
        }else{
            return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
        }

    }

    public static void editarPaciente(Paciente pac) {

    }

    public static void encaminharTriagem(Consulta con) {

    }

    public static Consulta agendarConsulta() {
        return null;
    }
    
    public static Consulta pesquisarConsultaID() {
        return null;
    }

    public static boolean cancelarConsulta(String consultaID) {
        return AtendenteDAO.cancelarCon(consultaID);
    }

    public static Atendente pesquisarAtendenteID(String ID) {
        return AtendenteDAO.pesquisarAteID(ID);
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
    
}
