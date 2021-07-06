package com.cidadera.trabalhofinal.negocio.servicos;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;
import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ComentarioInput;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ComentarioOutput;
import com.cidadera.trabalhofinal.negocio.repositorios.ComentarioRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

public abstract class ComentarioService {
    protected ComentarioRepository repository;
    protected ReclamacaoService reclamacaoService;

    public ComentarioService(ComentarioRepository repository, ReclamacaoService reclamacaoService) {
        this.repository = repository;
        this.reclamacaoService = reclamacaoService;
    }

    public <T> T openComment(ComentarioInput request, ComentarioOutput<T> response){
        Comentario comentario = request.toEntity();
        comentario.setId(null);
        Reclamacao reclamacao = reclamacaoService.findById(comentario.getIssue().getId())
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY));
        comentario.setIssue(reclamacao);
        Comentario save = repository.save(comentario);
        return response.fromEntity(save);
    }

    public Optional<Comentario> findById(long id){
        return repository.findById(id);
    }

    public <T> Optional<T> editComment(ComentarioInput request, ComentarioOutput<T> response){
        Comentario comentario = request.toEntity();
        return findById(comentario.getId())
                .map(entity -> repository.save(comentario))
                .map(response::fromEntity);

    }
}
