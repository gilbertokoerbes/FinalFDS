package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoResposta;
import com.cidadera.trabalhofinal.application.modelos.requisicao.AbrirReclamacaoRequisicao;
import com.cidadera.trabalhofinal.application.servicos.ReclamacaoServicoImpl;
import org.springframework.stereotype.Component;

@Component
public class AbrirReclamacaoCasoUso {

    private final ReclamacaoServicoImpl service;

    public AbrirReclamacaoCasoUso(ReclamacaoServicoImpl service) {
        this.service = service;
    }

    public ReclamacaoResposta run(AbrirReclamacaoRequisicao request) {
        return service.openIssue(request, new ReclamacaoResposta());
    }
}
