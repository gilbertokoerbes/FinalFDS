package com.finalfds.cidareira.aplicacao.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;
import com.finalfds.cidareira.negocio.servicos.ServicoComentarios;
import com.finalfds.cidareira.negocio.servicos.ServicoReclamacao;
import org.springframework.stereotype.Service;

@Service
public class ServicoComentariosApp extends ServicoComentarios{
    public ServicoComentariosApp(IRepositorioComentarios iRepositorioComentarios, ServicoReclamacao servicoReclamacao){
        super(iRepositorioComentarios, servicoReclamacao);    
    }
}