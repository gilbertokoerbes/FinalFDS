package com.cidadera.trabalhofinal.application.servicos;

import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoPorBairroResposta;
import com.cidadera.trabalhofinal.negocio.repositorios.ReclamacaoRepository;
import com.cidadera.trabalhofinal.negocio.servicos.ReclamacaoService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class ReclamacaoServicoImpl extends ReclamacaoService {
    public ReclamacaoServicoImpl(ReclamacaoRepository repository) {
        super(repository);
    }

    public List<ReclamacaoPorBairroResposta> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate){
        return repository.issuesPerNeighborhoodAndDateRange(initialDate, finalDate).stream()
        .map(obj-> new ReclamacaoPorBairroResposta(Long.valueOf(obj[0]),obj[1],obj[2]))
        .collect(Collectors.toList());
    }

}
