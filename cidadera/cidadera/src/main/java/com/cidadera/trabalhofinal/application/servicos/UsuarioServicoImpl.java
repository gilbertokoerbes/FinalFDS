package com.cidadera.trabalhofinal.application.servicos;

import com.cidadera.trabalhofinal.negocio.repositorios.UsuarioRepository;
import com.cidadera.trabalhofinal.negocio.servicos.UsuarioService;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServicoImpl extends UsuarioService {
    public UsuarioServicoImpl(UsuarioRepository repository) {
        super(repository);
    }

}
