package com.finalfds.cidareira.aplicacao.dtos;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NumMedComent {
    private IRepositorioComentarios comentariosRepo;
    private IRepositorioReclamacoes reclamacoesRepo;

    @Autowired
    public String NumMedComentCat(){
        int comentarios = comentariosRepo.allComentarios().size();
        int categoria = 5;
        return comentarios/categoria + "";
    }

    public String NumMedComentBairro(){
        return "";
    }
}
