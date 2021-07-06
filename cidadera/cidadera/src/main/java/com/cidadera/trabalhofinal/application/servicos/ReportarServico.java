package com.cidadera.trabalhofinal.application.servicos;

import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoPorBairroResposta;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ReportarServico {
    private final ReclamacaoServicoImpl issueService;
    private final ComentarioServicoImpl commentService;
    private final UsuarioServicoImpl userService;

    public ReportarServico(ReclamacaoServicoImpl issueService, ComentarioServicoImpl commentService, UsuarioServicoImpl userService) {
        this.issueService = issueService;
        this.commentService = commentService;
        this.userService = userService;
    }

    public List<ReclamacaoPorBairroResposta> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate) {
      return issueService.issuesPerNeighborhoodAndDateRange(initialDate, finalDate);
    }
}
