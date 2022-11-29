package com.sas.controller;

import com.sas.dao.PacienteDAO;
import com.sas.model.Paciente;

public class PacienteController {
    
    public static Paciente pesquisarPacienteID(String ID) {
        return PacienteDAO.pesquisarPacID(ID);
    }
    
}
