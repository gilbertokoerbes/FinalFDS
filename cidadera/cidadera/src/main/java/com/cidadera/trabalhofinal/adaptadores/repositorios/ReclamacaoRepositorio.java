package com.cidadera.trabalhofinal.adaptadores.repositorios;

import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.repositorios.ReclamacaoRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ReclamacaoRepositorio extends CrudRepository<Reclamacao,Long>, ReclamacaoRepository {

    @Query(value = "select count(*), i.neighborhood, i.category " +
            "from issues i " +
            "where i.date between ?1 and ?2 " +
            "group by i.neighborhood, i.category", nativeQuery = true)
    List<String[]> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate);

}
