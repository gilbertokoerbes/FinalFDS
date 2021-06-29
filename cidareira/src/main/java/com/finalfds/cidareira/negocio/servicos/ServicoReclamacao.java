package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.negocio.Reclamacao;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoReclamacao {
    private IRepositorioReclamacoes reclamacoesRepo;

    @Autowired
    public ServicoReclamacao(IRepositorioReclamacoes reclamacoesRepo){
        this.reclamacoesRepo = reclamacoesRepo;
    }

    public void cadastro(Reclamacao reclamacao){
        reclamacoesRepo.cadastraReclamacao(reclamacao);

    }


}
