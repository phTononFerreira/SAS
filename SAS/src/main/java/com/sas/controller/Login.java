package com.sas.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    public static String verificarLogin(String ID, String senha){
        ResultSet usuarioEncontrado = null;
        String cargo = null; 
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Administrador
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT adm_id, adm_senha FROM administrador WHERE='"+ID+"'");
        try{
            if (usuarioEncontrado.getString(1).equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Administrador";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Administrador)!");
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Atendente
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT ate_id, ate_senha FROM atendente WHERE='"+ID+"'");
        try{
            if (usuarioEncontrado.getString(1).equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Atendente";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Atendente)!");
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Enfermeira
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT enf_id, enf_senha FROM enfermeira WHERE='"+ID+"'");
        try{
            if (usuarioEncontrado.getString(1).equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Enfermeira";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Enfermeira)!");
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Medico
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT med_id, med_senha FROM medico WHERE='"+ID+"'");
        try{
            if (usuarioEncontrado.getString(1).equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Medico";
            } 
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Medico)!");
        }
                    
        if (cargo == null || usuarioEncontrado == null){
            return null;
        }
        
        return ID + "-" + cargo;
    }
}
