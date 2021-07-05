package com.finalfds.cidareira.aplicacao.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioUsuarios;
import com.finalfds.cidareira.negocio.servicos.ServicoUsuarios;
import org.springframework.stereotype.Service;

@Service
public class ServicoUsuariosApp extends ServicoUsuarios{
    public ServicoUsuariosApp(IRepositorioUsuarios iRepositorioUsuarios){
        super(iRepositorioUsuarios);
    }
}