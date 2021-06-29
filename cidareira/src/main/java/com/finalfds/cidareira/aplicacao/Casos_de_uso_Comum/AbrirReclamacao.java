package com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum;

import com.finalfds.cidareira.adaptadores.ReclamacoesController;
import com.finalfds.cidareira.negocio.Reclamacao;
import com.finalfds.cidareira.negocio.Status;
import com.finalfds.cidareira.negocio.Usuario;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioComentarios;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;


public class AbrirReclamacao{
    private IRepositorioReclamacoes repoReclamacao;

    public AbrirReclamacao(IRepositorioReclamacoes repoReclamacao){
        this.repoReclamacao = repoReclamacao;
    }
        
    public void cadastraReclamacao(Usuario user, Status status){
        
    }
    
    




}
