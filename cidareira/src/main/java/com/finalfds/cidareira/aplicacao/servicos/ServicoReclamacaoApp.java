package com.finalfds.cidareira.aplicacao.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.servicos.ServicoReclamacao;
import org.springframework.stereotype.Service;

@Service
public class ServicoReclamacaoApp extends ServicoReclamacao{
    public ServicoReclamacaoApp(IRepositorioReclamacoes iRepositorioReclamacoes){
        super(iRepositorioReclamacoes);
    }

    //public List
}
