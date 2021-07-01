package com.finalfds.cidareira.negocio.IRepositorios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import java.util.List;

public interface IRepositorioUsuarios {
    
    List<Usuario> all();
    void removeAll();
    boolean logIn(Usuario usuario);
    //....
    
    
}
