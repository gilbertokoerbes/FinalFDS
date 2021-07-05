package com.finalfds.cidareira.aplicacao.CasosDeUso;

import java.util.Optional;

import com.finalfds.cidareira.aplicacao.modelos.respostas.ComentarioRes;
import com.finalfds.cidareira.aplicacao.servicos.ServicoComentariosApp;
import org.springframework.stereotype.Component;

@Component
public class EncontrarComentario {
    private ServicoComentariosApp servico;

    public EncontrarComentario(ServicoComentariosApp servico){
        this.servico = servico;
    }

    public Optional<ComentarioRes> byId(Long id){
        return servico.findById(id).map(comentario -> new ComentarioRes().fromEntity(comentario));
    }
}
