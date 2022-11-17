package com.sas.controller;

import com.sas.dao.AtendenteDAO;
import com.sas.model.Atendente;
import com.sas.model.Consulta;
import com.sas.model.Paciente;

public class AtendenteController {
    
    public static Paciente cadastrarPaciente() {
        return null;
    }

    public static void editarPaciente(Paciente pac) {

    }

    public static void encaminharTriagem(Consulta con) {

    }

    public static Consulta agendarConsulta() {
        return null;
    }

    public static void cancelarConsulta(Consulta con) {

    }

    public static Atendente pesquisarAtendenteID(String ID) {
        return AtendenteDAO.pesquisarAteID(ID);
    }
    
}
