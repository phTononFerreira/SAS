package com.sas.controller;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Login {
    public static String verificarLogin(String ID, String senha){
        ResultSet usuarioEncontrado = null;
        String cargo = null; 
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Administrador
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT adm_id, adm_senha FROM administrador WHERE adm_id = '"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("adm_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Administrador";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Administrador)!\n"+e);
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Atendente
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT ate_id, ate_senha FROM atendente WHERE ate_id = '"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("ate_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Atendente";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Atendente)!\n"+e);
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Enfermeira
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT enf_id, enf_senha FROM enfermeira WHERE enf_id = '"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("enf_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Enfermeira";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Enfermeira)!\n"+e);
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Medico
        if(usuarioEncontrado == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT med_id, med_senha FROM medico WHERE med_id ='"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("med_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Medico";
            } 
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Medico)!\n"+e);
        }
                    
        if (cargo == null || usuarioEncontrado == null){
            return null;
        }
        
        return ID + "-" + cargo;
    }
}
