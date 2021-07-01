package com.finalfds.cidareira.negocio.entidades;

public class Status {
    private String StatusAtual;
    

    public Status(Usuario user){  
        setStatus("aberto", user);
    }


    //Necessita usuario para verificar seus privilegios
    public void setStatus(String status, Usuario user){
        if(user.getTipo().equalsIgnoreCase("C")){
            if(status.equalsIgnoreCase("aberto"))setStatusAberto();
            else if(status.equalsIgnoreCase("resolvida"))setStatusResolvido();
        }
        else if((user.getTipo().equalsIgnoreCase("O"))){
            if(status.equalsIgnoreCase("em andamento"))setStatusEmAndamento();
            else if(status.equalsIgnoreCase("encerrada"))setStatusEncerrada();        
        }

    }

    private void setStatusAberto(){
        StatusAtual = "aberto";
    }
    private void setStatusResolvido(){
        StatusAtual = "resolvido";
    }

    private void setStatusEmAndamento(){
        StatusAtual = "em andamento";
    }
    private void setStatusEncerrada(){
        StatusAtual = "encerrada";
    }

    public String toString(){
        return StatusAtual;
    }

    
}
