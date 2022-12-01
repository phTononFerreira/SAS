package com.sas.controller;

import com.sas.dao.InsumoMedicoDAO;
import com.sas.model.InsumoMedico;

public class InsumoMedicoController {
    
    public static InsumoMedico pesquisarInsumoID(String ins_id) {
        return InsumoMedicoDAO.pesquisarInsID(ins_id);
    }
    
    public static InsumoMedico pesquisarInsumoNome(String nome) {
        return InsumoMedicoDAO.pesquisarInsNome(nome);
    }
    
}
