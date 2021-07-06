package com.cidadera.trabalhofinal.application.servicos;

import com.cidadera.trabalhofinal.negocio.repositorios.ComentarioRepository;
import com.cidadera.trabalhofinal.negocio.servicos.ComentarioService;
import com.cidadera.trabalhofinal.negocio.servicos.ReclamacaoService;
import org.springframework.stereotype.Service;


@Service
public class ComentarioServicoImpl extends ComentarioService {
    public ComentarioServicoImpl(ComentarioRepository repository, ReclamacaoService reclamacaoService) {
        super(repository, reclamacaoService);
    }
}
