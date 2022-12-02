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
    
    public static void carregaTabelaConsulta(DefaultTableModel modelo, String med_id) {
        MedicoDAO.carregaTabConsulta(modelo, med_id);
    }
    
    public static void pesquisaTabelaConsulta(DefaultTableModel modelo, String nome, String med_id) {
        MedicoDAO.pesquisaTabConsulta(modelo, nome, med_id);
    }
    
    public static void carregaTabelaInsumo(DefaultTableModel modelo) {
        MedicoDAO.carregaTabInsumo(modelo);
    }
    
    public static void pesquisaTabelaInsumo(DefaultTableModel modelo, String nome) {
        MedicoDAO.pesquisaTabInsumo(modelo, nome);
    }
    
    public static String receitarConsulta(String receita, String con_id) {
        Consulta consulta = new Consulta();

        consulta.setId(con_id);
        consulta.setReceita(receita);
        
        System.out.println(consulta.toString());

        if (MedicoDAO.receitarCon(consulta)){
            return null;
        }else{
            return "ERRO NO RECEITAR CONSULTA";
        }         
    }
    
}
