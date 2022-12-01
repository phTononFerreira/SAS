package com.sas.controller;

import com.sas.dao.ProntuarioDAO;
import com.sas.model.Prontuario;

public class ProntuarioController {
    
    public static Prontuario pesquisarProntuarioID(String pro_id) {
        return ProntuarioDAO.pesquisarProID(pro_id);
    }
    
}
