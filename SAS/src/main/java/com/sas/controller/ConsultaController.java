package com.sas.controller;

import com.sas.dao.ConsultaDAO;
import com.sas.model.Consulta;

public class ConsultaController {
    
    public static Consulta pesquisarConsultaID(String con_id) {
        return ConsultaDAO.pesquisarConID(con_id);
    }
    
}
