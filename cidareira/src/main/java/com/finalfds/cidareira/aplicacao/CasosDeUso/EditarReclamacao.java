package com.finalfds.cidareira.aplicacao.CasosDeUso;

import com.finalfds.cidareira.aplicacao.modelos.requisicao.*;
import com.finalfds.cidareira.aplicacao.modelos.respostas.*;
import com.finalfds.cidareira.aplicacao.servicos.*;
import org.springframework.stereotype.Component;
import java.util.Optional;

@Component
public class EditarReclamacao {
    private ServicoReclamacaoApp servico;

    public EditarReclamacao(ServicoReclamacaoApp servico){
        this.servico = servico;
    }

    public Optional<ReclamacaoRes> run(EditarReclamacaoReq requisicao){
        return servico.editarReclamacao(requisicao, new ReclamacaoRes());
    }
}