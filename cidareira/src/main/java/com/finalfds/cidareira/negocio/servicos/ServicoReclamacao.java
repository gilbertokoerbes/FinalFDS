package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.aplicacao.CasosDeUso.AbrirReclamacao;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.enums.Categoria;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ReclamacaoIn;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ReclamacaoOut;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class ServicoReclamacao{
    public IRepositorioReclamacoes reclamacoesRepo;

    public ServicoReclamacao(IRepositorioReclamacoes reclamacoesRepo){
        this.reclamacoesRepo = reclamacoesRepo;
    }

    public <T> T AbrirReclamacao(ReclamacaoIn requisicao, ReclamacaoOut<T> resposta){
        Reclamacao reclamacao = requisicao.toEntity();
        reclamacao.setId(null);
        Reclamacao save = reclamacoesRepo.save(reclamacao);
        return resposta.fromEntity(save);
    }

    public Optional<Reclamacao> findById(long id){
        return reclamacoesRepo.FindById(id);
    }

    public <T> Optional<T> editarReclamacao(ReclamacaoIn requisicao, ReclamacaoOut<T> resposta){
        Reclamacao reclamacao = requisicao.toEntity();
        return findById(reclamacao.getId()).map(entity -> reclamacoesRepo.save(reclamacao)).map(resposta::fromEntity);
    }
}