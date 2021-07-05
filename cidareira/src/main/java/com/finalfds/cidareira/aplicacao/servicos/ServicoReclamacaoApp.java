package com.finalfds.cidareira.aplicacao.servicos;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

import com.finalfds.cidareira.aplicacao.modelos.respostas.ReclamacaoBairroRes;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.servicos.ServicoReclamacao;
import org.springframework.stereotype.Service;

@Service
public class ServicoReclamacaoApp extends ServicoReclamacao{
    public ServicoReclamacaoApp(IRepositorioReclamacoes reclamacoesRepo){
        super(reclamacoesRepo);
    }

    public List<ReclamacaoBairroRes> reclamacaoBairroRes(LocalDate dataIncial, LocalDate dataFinal){
        return reclamacoesRepo.reclamacaoBairroRes(dataIncial, dataFinal).stream()
        .map(obj-> new ReclamacaoBairroRes(Long.valueOf(obj[0]),obj[1],obj[2]))
        .collect(Collectors.toList());
    }
}