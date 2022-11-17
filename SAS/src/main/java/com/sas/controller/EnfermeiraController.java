package com.sas.controller;

import com.sas.dao.EnfermeiraDAO;
import com.sas.model.Enfermeira;
import com.sas.model.InsumoMedico;
import com.sas.model.Prontuario;

public class EnfermeiraController {
    
    public static Prontuario gerarProntuario() {
        return null;
    }

    public static InsumoMedico cadastrarInsumo() {
        return null;
    }

    public static void controlarEstoque(InsumoMedico ins) {

    }

    public static int contarEstoque(InsumoMedico ins) {
        return 0;
    }

    public static Enfermeira pesquisarEnfermeiraID(String ID) {
        return EnfermeiraDAO.pesquisarEnfID(ID);
    }
    
}
