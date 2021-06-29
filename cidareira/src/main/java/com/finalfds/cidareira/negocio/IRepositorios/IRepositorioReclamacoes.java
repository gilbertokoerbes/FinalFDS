package com.finalfds.cidareira.negocio.IRepositorios;

import com.finalfds.cidareira.negocio.Reclamacao;
import com.finalfds.cidareira.negocio.Usuario;

public interface IRepositorioReclamacoes {
    boolean cadastraReclamacao(Reclamacao reclamacao);
    int getTotalReclamacoes();
    int getMediaComentarios();
    int getPercentualInfo();
    int getOrgOficial();

    
}
