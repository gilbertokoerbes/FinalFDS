package com.finalfds.cidareira.aplicacao.CasosDeUso;

import java.util.Optional;
import com.finalfds.cidareira.aplicacao.modelos.respostas.ReclamacaoRes;
import com.finalfds.cidareira.aplicacao.servicos.ServicoReclamacaoApp;
import org.springframework.stereotype.Component;

@Component
public class EncontrarReclamacao {
    private ServicoReclamacaoApp servico;

    public EncontrarReclamacao(ServicoReclamacaoApp servico){
        this.servico = servico;
    }

    public Optional<ReclamacaoRes> byId(Long id){
        return servico.findById(id).map(reclamacao -> new ReclamacaoRes().fromEntity(reclamacao));
    }
}
