package com.finalfds.cidareira.adaptadores;

import com.finalfds.cidareira.negocio.Comentarios;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;

import org.springframework.stereotype.Component;

@Component
public class RepositorioComentarios implements IRepositorioComentarios{

    @Override
    public boolean cadastraComentario(Comentarios c) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int ComentariosUsuariosOficiais() {
        // TODO Auto-generated method stub
        return 0;
    }


}
