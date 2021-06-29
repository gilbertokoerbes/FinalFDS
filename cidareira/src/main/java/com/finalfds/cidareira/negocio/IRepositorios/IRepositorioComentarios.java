package com.finalfds.cidareira.negocio.IRepositorios;

import com.finalfds.cidareira.negocio.Comentarios;

public interface IRepositorioComentarios {
    boolean cadastraComentario(Comentarios c);
    int ComentariosUsuariosOficiais();
    
}
