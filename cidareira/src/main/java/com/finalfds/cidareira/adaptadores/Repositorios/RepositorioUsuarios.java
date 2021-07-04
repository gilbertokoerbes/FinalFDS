package com.finalfds.cidareira.adaptadores.Repositorios;

import java.util.List;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;

public class RepositorioUsuarios implements IRepositorioUsuarios{
    private IRepositorioUsuariosCRUD usuariosCRUD;
    public void RepositorioUsuarios(IRepositorioUsuariosCRUD usuariosCRUD){
        this.usuariosCRUD = usuariosCRUD;
    }

    @Override
    public boolean register(Usuario usuario) {
        usuariosCRUD.save(usuario);
        return false;
    }

    @Override
    public void removeAllUsuarios() {
        usuariosCRUD.deleteAll();        
    }

    @Override
    public List<Usuario> GetAllUsuarios() {
        List<Usuario> usr = usuariosCRUD.findAll();
        return usr;
    }

    @Override
    public Usuario getReclamacao(Reclamacao reclamacao) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Usuario> getTipo(String tipo) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
