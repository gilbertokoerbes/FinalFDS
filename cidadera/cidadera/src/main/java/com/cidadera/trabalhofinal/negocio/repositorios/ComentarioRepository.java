package com.cidadera.trabalhofinal.negocio.repositorios;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;

import java.util.Optional;

public interface ComentarioRepository {
    Comentario save(Comentario comentario);

    Optional<Comentario> findById(long id);
}
