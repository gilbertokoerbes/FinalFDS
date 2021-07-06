package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.resposta.ComentarioReposta;
import com.cidadera.trabalhofinal.application.modelos.requisicao.AbrirComentarioRequisicao;
import com.cidadera.trabalhofinal.application.servicos.ComentarioServicoImpl;
import org.springframework.stereotype.Component;

@Component
public class AbrirComentarioCasoUso {

    private final ComentarioServicoImpl service;

    public AbrirComentarioCasoUso(ComentarioServicoImpl service) {
        this.service = service;
    }

    public ComentarioReposta run(AbrirComentarioRequisicao request) {
        return service.openComment(request, new ComentarioReposta());
    }
}
