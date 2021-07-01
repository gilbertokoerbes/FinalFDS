package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import com.finalfds.cidareira.adaptadores.controllers.ReclamacoesController;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Status;
import com.finalfds.cidareira.negocio.entidades.Usuario;


public class AbrirReclamacao{
    private IRepositorioReclamacoes repoReclamacao;

    public AbrirReclamacao(IRepositorioReclamacoes repoReclamacao){
        this.repoReclamacao = repoReclamacao;
    }
        
    public void cadastraReclamacao(Usuario user, Status status){
        
    }
    
    




}
