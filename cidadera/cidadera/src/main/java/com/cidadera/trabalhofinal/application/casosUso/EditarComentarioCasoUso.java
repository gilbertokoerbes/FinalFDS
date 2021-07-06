package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.resposta.ComentarioReposta;
import com.cidadera.trabalhofinal.application.modelos.requisicao.EditarComentarioRequisicao;
import com.cidadera.trabalhofinal.application.servicos.ComentarioServicoImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EditarComentarioCasoUso {

    private final ComentarioServicoImpl service;

    public EditarComentarioCasoUso(ComentarioServicoImpl service) {
        this.service = service;
    }

    public Optional<ComentarioReposta> run(EditarComentarioRequisicao request) {
        return service.editComment(request, new ComentarioReposta());

    }
}
