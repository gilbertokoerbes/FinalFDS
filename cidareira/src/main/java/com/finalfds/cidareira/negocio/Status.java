package com.finalfds.cidareira.negocio;

import java.sql.Date;

import javax.persistence.criteria.CriteriaBuilder.Case;

public class Status {

    private Reclamacao reclamacao;
    private String StatusAtual;
    public void Status(Reclamacao reclamacao){  
        this.reclamacao = reclamacao;
        setStatus("aberto", this.reclamacao.getIdAutor());
    }
    public void setStatus(String status, Usuario user){
        if(user.getTipo().equalsIgnoreCase("C")){
            if(status.equalsIgnoreCase("aberto"))setStatusAberto();
            if(status.equalsIgnoreCase("resolvida"))setStatusResolvido();
        }
        else if((user.getTipo().equalsIgnoreCase("O"))){
            if(status.equalsIgnoreCase("em andamento"))setStatusEmAndamento();
            if(status.equalsIgnoreCase("encerrada"))setStatusEncerrada();
        }

    }

    private void setStatusAberto(){
        this.StatusAtual = "aberto";
    }
    private void setStatusResolvido(){
        this.StatusAtual = "resolvido";
    }

    private void setStatusEmAndamento(){
        this.StatusAtual = "em andamento";
    }
    private void setStatusEncerrada(){
        this.StatusAtual = "encerrada";
    }

    public String getStatus(){
        return this.StatusAtual;
    }

    
}
