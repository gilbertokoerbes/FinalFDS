package com.finalfds.cidareira.negocio.servicos;

import java.util.List;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoUsuarios {
    
    private IRepositorioUsuarios userRepo;

    @Autowired
    public ServicoUsuarios(IRepositorioUsuarios userRepo){
        this.userRepo = userRepo;
    }

    public boolean logIn(Usuario usuario){
        return userRepo.logIn(usuario);
    }
    
    public List<Usuario> all(){
        return userRepo.all();
    }

    public void removeAll(){
        userRepo.removeAll();
    }

    public Usuario getReclamacao(Reclamacao reclamacao){
        return userRepo.getReclamacao(reclamacao);
    }

    public List<Usuario> getTipo(String tipo){
        return userRepo.getTipo(tipo);
    }
}
