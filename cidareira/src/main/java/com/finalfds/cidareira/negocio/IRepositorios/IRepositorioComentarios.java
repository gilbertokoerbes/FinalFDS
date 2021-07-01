package com.finalfds.cidareira.negocio.IRepositorios;

import com.finalfds.cidareira.negocio.entidades.Comentarios;

public interface IRepositorioComentarios {
    boolean cadastraComentario(Comentarios c);
    int ComentariosUsuariosOficiais();
    
}
