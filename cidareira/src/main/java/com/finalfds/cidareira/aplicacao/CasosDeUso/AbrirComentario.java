package com.finalfds.cidareira.aplicacao.CasosDeUso;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.servicos.ServicoComentarios;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AbrirComentario {
    private ServicoComentarios servicoComentarios;
}