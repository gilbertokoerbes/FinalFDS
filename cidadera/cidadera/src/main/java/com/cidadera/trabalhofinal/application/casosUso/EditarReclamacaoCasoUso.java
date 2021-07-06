package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.requisicao.EditarReclamacaoRequisicao;
import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoResposta;
import com.cidadera.trabalhofinal.application.servicos.ReclamacaoServicoImpl;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EditarReclamacaoCasoUso {

    private final ReclamacaoServicoImpl service;

    public EditarReclamacaoCasoUso(ReclamacaoServicoImpl service) {
        this.service = service;
    }

    public Optional<ReclamacaoResposta> run(EditarReclamacaoRequisicao request) {
        return service.editIssue(request, new ReclamacaoResposta());

    }
}
