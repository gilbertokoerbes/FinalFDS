package com.finalfds.cidareira.aplicacao.CasosDeUso;

import java.util.Optional;

import com.finalfds.cidareira.aplicacao.modelos.respostas.ComentarioRes;
import com.finalfds.cidareira.aplicacao.servicos.ServicoComentariosApp;
import com.finalfds.cidareira.aplicacao.modelos.requisicao.EditarComentarioReq;
import org.springframework.stereotype.Component;

@Component
public class EditarComentario{
    private ServicoComentariosApp servico;

    public EditarComentario(ServicoComentariosApp servico){
        this.servico = servico;
    }

    public Optional<ComentarioRes> run(EditarComentarioReq requisicao){
        return servico.editarComentario(requisicao, new ComentarioRes());
    }
}