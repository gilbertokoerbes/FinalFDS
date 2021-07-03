package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import com.finalfds.cidareira.negocio.entidades.*;
import com.finalfds.cidareira.negocio.servicos.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtComentario{
    private ServicoComentarios servicoComentarios;

    @Autowired
    public AtComentario(ServicoComentarios servicoComentarios){
        this.servicoComentarios = servicoComentarios;
    }

    public Comentarios run(int n_comentario, Reclamacao n_reclamacao, String titulo, String descricao, Date dataInsercao, Usuario usuario){
        return servicoComentarios.
    }
}