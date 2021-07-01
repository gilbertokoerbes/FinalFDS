package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
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

    public void cadastro(Usuario user){
        userRepo.cadastraUsuario(user);
    }
    


    
}
