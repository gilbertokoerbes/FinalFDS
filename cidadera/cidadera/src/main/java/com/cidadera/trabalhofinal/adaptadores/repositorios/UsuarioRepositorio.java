package com.cidadera.trabalhofinal.adaptadores.repositorios;

import com.cidadera.trabalhofinal.negocio.entidades.User;
import com.cidadera.trabalhofinal.negocio.repositorios.UsuarioRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositorio extends CrudRepository<User, Long>, UsuarioRepository {


}
