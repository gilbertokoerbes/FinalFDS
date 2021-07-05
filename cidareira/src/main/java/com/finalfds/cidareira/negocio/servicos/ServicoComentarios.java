package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.*;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ComentarioIn;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ComentarioOut;
import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;
import java.util.*;

public abstract class ServicoComentarios {
    public IRepositorioComentarios comentariosRepo;
    public ServicoReclamacao servicoReclamacao;

    public ServicoComentarios(IRepositorioComentarios comentariosRepo, ServicoReclamacao servicoReclamacao){
        this.comentariosRepo = comentariosRepo;
        this.servicoReclamacao = servicoReclamacao;
    }

    public <T> T abrirComentario(ComentarioIn requisicao, ComentarioOut<T> resposta){
        Comentarios comentarios = requisicao.toEntity();
        comentarios.setId(null);
        Reclamacao reclamacao = servicoReclamacao.findById(comentarios.getReclamacao().getId()).orElseThrow(() -> new ResponseStatusException(HttpStatus.UNPROCESSABLE_ENTITY));
        comentarios.setReclamacao(reclamacao);
        Comentarios save = comentariosRepo.save(comentarios);
        return resposta.fromEntity(save);
    }

    public Optional<Comentarios> findById(long id){
        return comentariosRepo.findById(id);
    }

    public <T> Optional<T> editarComentario(ComentarioIn requisicao, ComentarioOut<T> resposta){
        Comentarios comentarios = requisicao.toEntity();
        return findById(comentarios.getId()).map(entity -> comentariosRepo.save(comentarios)).map(resposta::fromEntity);
    }
}