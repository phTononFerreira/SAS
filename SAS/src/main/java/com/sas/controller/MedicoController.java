package com.sas.controller;

import com.sas.dao.MedicoDAO;
import com.sas.model.Consulta;
import com.sas.model.InsumoMedico;
import com.sas.model.Medico;
import com.sas.model.Prontuario;
import javax.swing.table.DefaultTableModel;

public class MedicoController {
    
    public static void finalizarConsulta(Consulta con) {

    }

    public static String encaminharPaciente(Consulta con) {
        return null;
    }

    public static String receitarPaciente(InsumoMedico ins) {
        return null;
    }

    public static void visualizarProntuario(Prontuario pro) {

    }

    public static Medico pesquisarMedicoID(String ID) {
        return MedicoDAO.pesquisarMedID(ID);
    }
    
    public static void carregaTabelaConsulta(DefaultTableModel modelo) {
        MedicoDAO.carregaTabConsulta(modelo);
    }
    
    public static void pesquisaTabelaConsulta(DefaultTableModel modelo, String nome) {
        MedicoDAO.pesquisaTabConsulta(modelo, nome);
    }
    
}
