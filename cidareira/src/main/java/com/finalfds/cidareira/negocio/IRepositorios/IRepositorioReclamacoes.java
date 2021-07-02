package com.finalfds.cidareira.negocio.IRepositorios;

import java.util.List;

import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Endereco;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;

public interface IRepositorioReclamacoes{
    boolean register(Reclamacao reclamacao);
    void romeveAllReclamacao();
    List<Reclamacao> getAllReclamacao();
    List<Reclamacao> getStatus(String status);
    List<Reclamacao> getCategoria(Categoria categoria);
    List<Reclamacao> getUsuario(Usuario usuario);
    List<Reclamacao> getEndereco(Endereco endereco);
}
