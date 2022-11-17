package com.sas.controller;

import com.sas.model.Administrador;
import com.sas.model.Atendente;
import com.sas.model.Enfermeira;
import com.sas.model.Funcionario;
import com.sas.model.Medico;

import com.sas.dao.AdministradorDAO;
import com.sas.dao.AtendenteDAO;
import com.sas.dao.EnfermeiraDAO;
import com.sas.dao.MedicoDAO;

public class Login {

    public static String verificarLogin(String ID, String senha) {
        Funcionario usuarioEncontrado = null;
        String cargo = null;

        //VERIFICAR SE EXISTE USUARIO NA TABELA: Administrador
        usuarioEncontrado = (Administrador) AdministradorController.pesquisarAdministradorID(ID);
        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getSenha().equals(senha)) {
                cargo = "Administrador";
            }

        } else {
            System.out.println("[ADM] USUARIO NAO ENCONTRADO!");
        }

        //VERIFICAR SE EXISTE USUARIO NA TABELA: Atendente
        if (cargo == null) {
            usuarioEncontrado = (Atendente) AtendenteController.pesquisarAtendenteID(ID);
            if (usuarioEncontrado != null) {
                if (usuarioEncontrado.getSenha().equals(senha)) {
                    cargo = "Atendente";
                }
            } else {
                System.out.println("[ATE] USUARIO NAO ENCONTRADO!");
            }
        }

        //VERIFICAR SE EXISTE USUARIO NA TABELA: Enfermeira
        if (cargo == null) {
            usuarioEncontrado = (Enfermeira) EnfermeiraController.pesquisarEnfermeiraID(ID);
            if (usuarioEncontrado != null) {
                if (usuarioEncontrado.getSenha().equals(senha)) {
                    cargo = "Enfermeira";
                }
            } else {
                System.out.println("[ENF] USUARIO NAO ENCONTRADO!");
            }
        }

        //VERIFICAR SE EXISTE USUARIO NA TABELA: Medico
        if (cargo == null) {
            usuarioEncontrado = (Medico) MedicoController.pesquisarMedicoID(ID);
            if (usuarioEncontrado != null) {
                if (usuarioEncontrado.getSenha().equals(senha)) {
                    cargo = "Medico";
                }
            } else {
                System.out.println("[MED] USUARIO NAO ENCONTRADO!");
            }
        }

        if (cargo == null || usuarioEncontrado == null) {
            return null;
        }

        return ID + "-" + cargo;
    }
    
    public static String retornaNomeFuncionario(String ID) {
        String nome = switch (ID.substring(0,3)) {
            case "adm" -> AdministradorController.pesquisarAdministradorID(ID).getNome();
            case "ate" -> AtendenteController.pesquisarAtendenteID(ID).getNome();
            case "enf" -> EnfermeiraController.pesquisarEnfermeiraID(ID).getNome();
            case "med" -> MedicoController.pesquisarMedicoID(ID).getNome();
            default -> "Usuário não encontrado.";
        };
        nome = nome.split(" ")[0];
        return nome;
    }
}
