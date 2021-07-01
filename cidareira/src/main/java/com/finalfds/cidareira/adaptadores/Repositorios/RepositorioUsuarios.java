package com.finalfds.cidareira.adaptadores.Repositorios;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
import com.finalfds.cidareira.negocio.entidades.Usuario;

import org.springframework.stereotype.Component;

@Component
public class RepositorioUsuarios implements IRepositorioUsuarios{

    @Override
    public boolean cadastraUsuario(Usuario user) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
