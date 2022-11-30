package com.sas.controller;

import com.sas.dao.EnfermeiraDAO;
import com.sas.model.Enfermeira;
import com.sas.model.InsumoMedico;
import com.sas.model.Prontuario;
import javax.swing.table.DefaultTableModel;

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
    
    public static void carregaTabelaTriagem(DefaultTableModel modelo) {
        EnfermeiraDAO.carregaTabTriagem(modelo);
    }
    
    public static void pesquisaTabelaTriagem(DefaultTableModel modelo, String nome) {
        EnfermeiraDAO.pesquisaTabTriagem(modelo, nome);
    }
    
    public static String pesquisarConsultaPorProntuario(String pro_id) {
        return EnfermeiraDAO.pesquisarConPorProntuario(pro_id);
    }
    
    public static String preencherTriagem(String temperatura, String pressao, String descricao, String pro_id, String enf_id) {
        Prontuario prontuario = new Prontuario();

        prontuario.setId(pro_id);
        
        if (temperatura.equals(""))
            return "TEMPERATURA INVALIDO!";
        prontuario.setTemperatura(Float.parseFloat(temperatura));
        
        if (pressao.equals(""))
            return "PRESSAO INVALIDO!";
        prontuario.setPressao(pressao);
        
        if (descricao.equals(""))
            return "DESCRICAO INVALIDO!";
        prontuario.setDescricao(descricao);
        
        prontuario.setEnf_id(enf_id);

        System.out.println(prontuario.toString());

        if (EnfermeiraDAO.preencherTri(prontuario)){
            return null;
        }else{
            return "ERRO NO PREENCHER TRIAGEM";
        }         
    }

}
