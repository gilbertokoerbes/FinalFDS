package com.finalfds.cidareira.negocio.IRepositorios;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import java.util.*;

public interface IRepositorioComentarios{
    Comentarios save(Comentarios comentarios);

    Optional<Comentarios> findById(Long id);
}