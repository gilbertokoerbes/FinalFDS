package com.finalfds.cidareira.adaptadores.Repositorios;

import com.finalfds.cidareira.negocio.*;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;
import com.finalfds.cidareira.negocio.entidades.Comentarios;

import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

@Component
public class RepositorioComentarios extends CrudRepository<Comentarios, Long>{

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
