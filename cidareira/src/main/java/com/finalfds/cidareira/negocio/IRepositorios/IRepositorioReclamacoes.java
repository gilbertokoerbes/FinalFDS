package com.finalfds.cidareira.negocio.IRepositorios;

import java.util.*;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;

public interface IRepositorioReclamacoes{
    Reclamacao save(Reclamacao reclamacao);

    Optional<Reclamacao> FindById(long id);

    //List<String[]> ....(LocalDate dataInicial, LocalDate dataFinal);
}