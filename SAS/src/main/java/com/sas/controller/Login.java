package com.sas.controller;

import com.mycompany.sas.Atendente;
import com.sas.model.Administrador;
import com.sas.model.Funcionario;
import java.sql.ResultSet;

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
        }else{
            System.out.println("[ADM] USUARIO NAO ENCONTRADO!");
        }
            
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Atendente
        usuarioEncontrado = (Atendente) Atendente.pesquisarAtendenteID(ID);
        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getSenha().equals(senha)) {
                cargo = "Atendente";
            }
        }else{
            System.out.println("[ATE] USUARIO NAO ENCONTRADO!");
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Enfermeira
        usuarioEncontrado = (Enfermeira) Enfermeira.pesquisarEnfermeiraID(ID);
        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getSenha().equals(senha)) {
                cargo = "Enfermeira";
            }
        }else{
            System.out.println("[ENF] USUARIO NAO ENCONTRADO!");
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Medico
        usuarioEncontrado = (Medico) Medico.pesquisarMedicoID(ID);
        if (usuarioEncontrado != null) {
            if (usuarioEncontrado.getSenha().equals(senha)) {
                cargo = "Medico";
            }
        }else{
            System.out.println("[MED] USUARIO NAO ENCONTRADO!");
        }
        
        if (cargo == null || usuarioEncontrado == null) {
            return null;
        }

        return ID + "-" + cargo;
    }
}
