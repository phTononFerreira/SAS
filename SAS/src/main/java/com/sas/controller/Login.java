package com.sas.controller;

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
            

        /*
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Atendente
        if(cargo == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT ate_id, ate_senha FROM atendente WHERE ate_id = '"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("ate_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Atendente";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Atendente)!\n"+e);
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Enfermeira
        if(cargo == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT enf_id, enf_senha FROM enfermeira WHERE enf_id = '"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("enf_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Enfermeira";
            }
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Enfermeira)!\n"+e);
        }
        
        //VERIFICAR SE EXISTE USUARIO NA TABELA: Medico
        if(cargo == null)
            usuarioEncontrado = ConexaoBD.getConexao().executarQueryBD("SELECT med_id, med_senha FROM medico WHERE med_id ='"+ID+"'");
        try{
            if (usuarioEncontrado.next() && usuarioEncontrado.getString("med_senha").equals(senha)){ //VERIFICAR SE A SENHA CONFERE
                cargo = "Medico";
            } 
        }catch(Exception e){
            System.out.println("FUNCIONARIO NAO ENCONTRADO(Medico)!\n"+e);
        }
         */
        if (cargo == null || usuarioEncontrado == null) {
            return null;
        }

        return ID + "-" + cargo;
    }
}
