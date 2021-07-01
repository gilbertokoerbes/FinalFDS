package com.finalfds.cidareira.negocio.IRepositorios;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import java.util.List;

public interface IRepositorioComentarios {
    boolean cadastraComentario(Comentarios comentarios, Reclamacao reclamacao);
    List<Comentarios> all();
    void romeveAll();
    List<Comentarios> getUsuario(Usuario usuario);
    List<Comentarios> getCategoria(Categoria categoria);
    List<Comentarios> getReclamacao(Reclamacao reclamacao); 
}
