package com.finalfds.cidareira.negocio.IRepositorios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import java.util.List;

public interface IRepositorioUsuarios {
    boolean register(Usuario usuario);
    void removeAllUsuarios();
    List<Usuario> GetAllUsuarios();
    Usuario getReclamacao(Reclamacao reclamacao);
    List<Usuario> getTipo(String tipo);
}