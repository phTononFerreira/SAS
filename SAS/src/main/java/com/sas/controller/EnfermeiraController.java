package com.sas.controller;

import com.sas.controller.InsumoMedicoController;
import com.sas.dao.EnfermeiraDAO;
import com.sas.dao.InsumoMedicoDAO;
import com.sas.model.Enfermeira;
import com.sas.model.InsumoMedico;
import com.sas.model.Prontuario;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;

public class EnfermeiraController {

    public static Prontuario gerarProntuario() {
        return null;
    }

    public static String cadastrarInsumo(String nome, String quantidade, String enf_id) {
        InsumoMedico insumo = new InsumoMedico();

        insumo.setId("ins" + String.valueOf(InsumoMedicoDAO.contarIns() + 1));    //ID AUTOINCREMENT
        insumo.setEnf_id(enf_id);

        if (nome.equals("")) {
            return "NOME INVALIDO!";
        } else if (InsumoMedicoController.pesquisarInsumoNome(nome) != null) {
            System.out.println("NOME JÁ CADASTRADO");
            return "NOME JÁ CADASTRADO!";
        }
        insumo.setNome(nome);

        try {
            if (Integer.parseInt(quantidade) < 0 || Integer.parseInt(quantidade) > 999) {
                return "Quantidade inválida!";
            }
        } catch (Exception e) {
            return "Quantidade inválida!";
        }

        insumo.setQuantidade(Integer.parseInt(quantidade));

        System.out.println(insumo.toString());

        if (EnfermeiraDAO.cadastrarIns(insumo)) {
            return null;
        } else {
            return "ERRO NO CADASTRO! [INSERCAO NO BANCO DE DADOS]";
        }

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

        if (pro_id == null) {
            return "Selecione um prontuário na tabela!";
        }
        prontuario.setId(pro_id);
 
        try {
            if (temperatura.equals("")) {
                return "TEMPERATURA INVALIDO!";
            }
            else if (Float.parseFloat(temperatura) < 0 || Float.parseFloat(temperatura) > 100) {
                return "TEMPERATURA INVALIDO!";
            }
        } catch (Exception e) {
            return "TEMPERATURA INVALIDO!";
        }
        
        prontuario.setTemperatura(Float.parseFloat(temperatura));

        if (pressao.equals("") || !pressao.matches("[0-9]+/[0-9]+")) {
            return "PRESSAO INVALIDO!";
        }
        prontuario.setPressao(pressao);

        if (descricao.equals("")) {
            return "DESCRICAO INVALIDO!";
        }
        prontuario.setDescricao(descricao);

        prontuario.setEnf_id(enf_id);

        System.out.println(prontuario.toString());

        if (EnfermeiraDAO.preencherTri(prontuario)) {
            return null;
        } else {
            return "ERRO NO PREENCHER TRIAGEM";
        }
    }

    public static void carregaTabelaInsumo(DefaultTableModel modelo) {
        EnfermeiraDAO.carregaTabInsumo(modelo);
    }

    public static String controlarEstoque(String quantidade, String ins_id) {
        InsumoMedico insumo = new InsumoMedico();

        if (ins_id == null) {
            return "Selecione um insumo na tabela!";
        }
        insumo.setId(ins_id);
        
        try {
            if (Integer.parseInt(quantidade) < 0 || Integer.parseInt(quantidade) > 999) {
                return "Quantidade inválida!";
            }
        } catch (Exception e) {
            return "Quantidade inválida!";
        }

        insumo.setQuantidade(Integer.parseInt(quantidade));

        System.out.println(insumo.toString());

        if (EnfermeiraDAO.controlarEst(insumo)) {
            return null;
        } else {
            return "ERRO AO PREENCHER TRIAGEM";
        }
    }

}
