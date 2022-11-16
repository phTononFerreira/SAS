package com.sas.controller;

import com.sas.model.Administrador;
import com.sas.model.Atendente;
import com.sas.model.Enfermeira;
import com.sas.model.Funcionario;
import com.sas.model.Medico;

public class Login {

    public static String verificarLogin(String ID, String senha) {
        Funcionario usuarioEncontrado = null;
        String cargo = null;

        //VERIFICAR SE EXISTE USUARIO NA TABELA: Administrador
        usuarioEncontrado = (Administrador) Administrador.pesquisarAdministradorID(ID);
        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getSenha().equals(senha)) {
                cargo = "Administrador";
            }

        } else {
            System.out.println("[ADM] USUARIO NAO ENCONTRADO!");
        }

        //VERIFICAR SE EXISTE USUARIO NA TABELA: Atendente
        if (cargo == null) {
            usuarioEncontrado = (Atendente) Atendente.pesquisarAtendenteID(ID);
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
            usuarioEncontrado = (Enfermeira) Enfermeira.pesquisarEnfermeiraID(ID);
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
            usuarioEncontrado = (Medico) Medico.pesquisarMedicoID(ID);
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
            case "adm" -> Administrador.pesquisarAdministradorID(ID).getNome();
            case "ate" -> Atendente.pesquisarAtendenteID(ID).getNome();
            case "enf" -> Enfermeira.pesquisarEnfermeiraID(ID).getNome();
            case "med" -> Medico.pesquisarMedicoID(ID).getNome();
            default -> "Usuário não encontrado.";
        };
        nome = nome.split(" ")[0];
        return nome;
    }
}
