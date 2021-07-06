package com.cidadera.trabalhofinal.negocio.servicos;

import com.cidadera.trabalhofinal.negocio.repositorios.UsuarioRepository;

public abstract class UsuarioService {
    protected UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }


}