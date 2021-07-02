package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.servicos.ServicoComentarios;
import org.springframework.beans.factory.annotation.Autowired;

public class ComentarReclamacao {
    private ServicoComentarios servicoComentarios;

    @Autowired
    public ComentarReclamacao(ServicoComentarios servicoComentarios){
        this.servicoComentarios = servicoComentarios;
    }

    public void run(Comentarios comentarios, Reclamacao reclamacao){
        servicoComentarios.cadastraComentario(comentarios, reclamacao);
    }
}