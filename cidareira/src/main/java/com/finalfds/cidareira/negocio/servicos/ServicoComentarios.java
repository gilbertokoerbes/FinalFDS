package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.*;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.enums.Categoria;
import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.*;

public abstract class ServicoComentarios {
    public IRepositorioComentarios comentariosRepo;
    public ServicoReclamacao servicoReclamacao;

    public ServicoComentarios(IRepositorioComentarios comentariosRepo, ServicoReclamacao servicoReclamacao){
        this.comentariosRepo = comentariosRepo;
        this.servicoReclamacao = servicoReclamacao;
    }

    public <T> T abrirComentario(){
    }

    public Optional<Comentarios> findById(long id){
        return comentariosRepo.findById(id);
    }

    public <T> Optional<T> editarComentario(){
    }
}