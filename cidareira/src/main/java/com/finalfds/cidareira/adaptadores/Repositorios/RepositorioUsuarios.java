package com.finalfds.cidareira.adaptadores.Repositorios;

import java.util.List;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
import com.finalfds.cidareira.negocio.entidades.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

public interface RepositorioUsuarios extends CrudRepository<Usuario, Long>{
    List<Usuario> findAll();
    List<Usuario> findId(long id);
}