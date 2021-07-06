package com.cidadera.trabalhofinal.adaptadores.repositorios;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;
import com.cidadera.trabalhofinal.negocio.repositorios.ComentarioRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepositorio extends CrudRepository<Comentario,Long>, ComentarioRepository {

}
