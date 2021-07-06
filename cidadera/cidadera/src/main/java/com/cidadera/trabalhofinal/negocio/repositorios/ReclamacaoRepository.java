package com.cidadera.trabalhofinal.negocio.repositorios;

import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ReclamacaoRepository {
    Reclamacao save(Reclamacao reclamacao);

    Optional <Reclamacao> findById(long id);

    List<String[]> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate);
}
