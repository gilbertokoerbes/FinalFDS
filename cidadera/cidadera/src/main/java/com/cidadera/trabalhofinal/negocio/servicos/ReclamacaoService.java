package com.cidadera.trabalhofinal.negocio.servicos;

import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ReclamacaoInput;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ReclamacaoOutput;
import com.cidadera.trabalhofinal.negocio.repositorios.ReclamacaoRepository;

import java.util.Optional;

public abstract class ReclamacaoService {
    protected ReclamacaoRepository repository;

    public ReclamacaoService(ReclamacaoRepository repository) {
        this.repository = repository;
    }

    public <T> T openIssue(ReclamacaoInput request, ReclamacaoOutput<T> response) {
        Reclamacao reclamacao = request.toEntity();
        reclamacao.setId(null);
        Reclamacao save = repository.save(reclamacao);
        return response.fromEntity(save);
    }

    public Optional<Reclamacao> findById(long id) {
        return repository.findById(id);
    }

    public <T> Optional<T> editIssue(ReclamacaoInput request, ReclamacaoOutput<T> response) {
        Reclamacao reclamacao = request.toEntity();
        return findById(reclamacao.getId())
                .map(entity -> repository.save(reclamacao))
                .map(response::fromEntity);

    }

}