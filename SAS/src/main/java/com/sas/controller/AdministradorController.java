package com.sas.controller;

import com.sas.model.Administrador;
import java.util.Date;

public class AdministradorController {

    public static void cadastrarFuncionario(String tipo, String id_adm, String senha, String nome, String data_nascimento, String cpf, String telefone, String endereco, String salario, String cr, String crm, String especialidade) {
        if (tipo.equals("Administrador")){
            Administrador administrador = new Administrador();
            administrador.setId("IdTeste");
            administrador.setNome(nome);
            administrador.setData_nascimento(new Date(1,1,1)); //FORMATAR STRING -> DATE
            
            
        }else if(tipo.equals("Atendente")){
            
        }else if(tipo.equals("Enfermeira")){
            
        }else if(tipo.equals("Enfermeira")){
            
        }else{
            
        }
        
        
        
        
        //Administrador.cadastrarFunc(func);
    }

}
