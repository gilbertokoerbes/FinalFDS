package com.finalfds.cidareira.adaptadores.Repositorios;

import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface RepositorioComentarios extends CrudRepository<Comentarios, Long>{
    List<Comentarios> findAll();
    List<Comentarios> findId(long id);
    List<Comentarios> findUsuario(Usuario usuario);
    List<Comentarios> findCategoria(Categoria categoria);

    @Query ("selec * from Comentarios c where c.dataPublicacao >= :dataInicia AND c.dataPublica < :dataFinal")
    List<Reclamacao> findData(LocalDate dataInicial, LocalDate dataFinal);
}