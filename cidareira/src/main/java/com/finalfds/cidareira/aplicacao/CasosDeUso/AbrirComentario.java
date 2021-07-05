package com.finalfds.cidareira.aplicacao.CasosDeUso;

import com.finalfds.cidareira.aplicacao.modelos.requisicao.AbrirComentarioReq;
import com.finalfds.cidareira.aplicacao.modelos.respostas.ComentarioRes;
import com.finalfds.cidareira.aplicacao.servicos.ServicoComentariosApp;
import org.springframework.stereotype.Component;

@Component
public class AbrirComentario {
    private ServicoComentariosApp servicoComentariosApp;

    public AbrirComentario(ServicoComentariosApp servicoComentariosApp){
        this.servicoComentariosApp = servicoComentariosApp;
    }

    public ComentarioRes run(AbrirComentarioReq requisicao){
        return servicoComentariosApp.abrirComentario(requisicao, new ComentarioRes());
    }
}