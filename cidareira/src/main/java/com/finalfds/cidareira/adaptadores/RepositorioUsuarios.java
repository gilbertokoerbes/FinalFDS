package com.finalfds.cidareira.adaptadores;

import com.finalfds.cidareira.negocio.Usuario;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;

import org.springframework.stereotype.Component;

@Component
public class RepositorioUsuarios implements IRepositorioUsuarios{

    @Override
    public boolean cadastraUsuario(Usuario user) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
