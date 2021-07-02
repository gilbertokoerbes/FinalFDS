package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.*;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ServicoComentarios {
    public IRepositorioComentarios comentariosRepo;
    
    @Autowired
    public ServicoComentarios(IRepositorioComentarios comentariosRepo){
        this.comentariosRepo = comentariosRepo;
    }

    public void romeveAll(){
        comentariosRepo.romeveAllComentarios();
    }

    public boolean cadastraComentario(Comentarios comentarios, Reclamacao reclamacao){
        return comentariosRepo.register(comentarios, reclamacao);
    }

    public List<Comentarios> getCategoria(Categoria categoria){
        return comentariosRepo.getCategoria(categoria);
    }

    public List<Comentarios> getUsuario(Usuario usuario){
        return comentariosRepo.getUsuario(usuario);
    }
    
    public List<Comentarios> getReclamacao(Reclamacao reclamacao){
        return comentariosRepo.getReclamacao(reclamacao);
    }
}