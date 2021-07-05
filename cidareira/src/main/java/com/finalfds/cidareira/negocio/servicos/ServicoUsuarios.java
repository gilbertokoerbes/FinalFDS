package com.finalfds.cidareira.negocio.servicos;

import java.util.*;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public abstract class ServicoUsuarios {
    private IRepositorioUsuarios usuarioRepo;

    public ServicoUsuarios(IRepositorioUsuarios usuarioRepo){
        this.usuarioRepo = usuarioRepo;
    }
}
