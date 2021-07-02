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

    public boolean register(Usuario usuario){
        return userRepo.register(usuario);
    }
    
    public List<Usuario> GetAllUsuarios(){
        return userRepo.GetAllUsuarios();
    }

    public void removeAllUsuarios(){
        userRepo.removeAllUsuarios();
    }

    public Usuario getReclamacao(Reclamacao reclamacao){
        return userRepo.getReclamacao(reclamacao);
    }

    public List<Usuario> getTipo(String tipo){
        return userRepo.getTipo(tipo);
    }
}
