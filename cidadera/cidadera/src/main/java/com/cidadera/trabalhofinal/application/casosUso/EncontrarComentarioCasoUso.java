package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.resposta.ComentarioReposta;
import com.cidadera.trabalhofinal.application.servicos.ComentarioServicoImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EncontrarComentarioCasoUso {

    private final ComentarioServicoImpl service;

    public EncontrarComentarioCasoUso(ComentarioServicoImpl service) {
        this.service = service;
    }

    public Optional<ComentarioReposta> byId(long id){

        return service.findById(id).map(comment -> new ComentarioReposta().fromEntity(comment));
    }
}
