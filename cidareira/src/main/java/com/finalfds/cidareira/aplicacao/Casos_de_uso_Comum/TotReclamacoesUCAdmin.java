package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import java.util.List;

import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.servicos.ServicoReclamacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TotReclamacoesUCAdmin {
    private ServicoReclamacao servicoReclamacao;
    
    @Autowired
    public void TotReclamacoesUCAdmin(ServicoReclamacao servicoReclamacao){
        this.servicoReclamacao = servicoReclamacao;
    }

    public List<Reclamacao> run(){
        return servicoReclamacao.getAllReclamacao();
    }
    
}
