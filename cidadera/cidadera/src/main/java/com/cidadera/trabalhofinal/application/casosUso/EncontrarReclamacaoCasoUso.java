package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoResposta;
import com.cidadera.trabalhofinal.application.servicos.ReclamacaoServicoImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EncontrarReclamacaoCasoUso {

    private final ReclamacaoServicoImpl service;

    public EncontrarReclamacaoCasoUso(ReclamacaoServicoImpl service) {
        this.service = service;
    }

    public Optional<ReclamacaoResposta> byId(long id){

        return service.findById(id).map(issue -> new ReclamacaoResposta().fromEntity(issue));
    }
}
