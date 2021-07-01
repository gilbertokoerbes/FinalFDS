package com.finalfds.cidareira.negocio.IRepositorios;

import java.util.List;

import com.finalfds.cidareira.negocio.entidades.Bairros;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;

public interface IRepositorioReclamacoes {
    List<Reclamacao> all();
    void romeveAll();
    boolean register(Reclamacao reclamacao);
    List<Reclamacao> getBairros(Bairros bairros);
    List<Reclamacao> getStatus(String status);
    List<Reclamacao> getCategoria(Categoria categoria);
    List<Reclamacao> getUsuario(Usuario usuario);
}
