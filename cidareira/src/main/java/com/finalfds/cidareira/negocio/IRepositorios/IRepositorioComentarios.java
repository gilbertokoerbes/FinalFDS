package com.finalfds.cidareira.negocio.IRepositorios;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Endereco;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import java.util.List;

public interface IRepositorioComentarios{
    boolean register(Comentarios comentarios, Reclamacao reclamacao);
    void romeveAllComentarios();
    List<Comentarios> allComentarios();
    List<Comentarios> getUsuario(Usuario usuario);
    List<Comentarios> getCategoria(Categoria categoria);
    List<Comentarios> getReclamacao(Reclamacao reclamacao); 
    List<Comentarios> getEndereco(Endereco endereco);
}
