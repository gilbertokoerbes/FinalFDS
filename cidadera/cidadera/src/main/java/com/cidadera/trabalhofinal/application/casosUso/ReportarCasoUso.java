package com.cidadera.trabalhofinal.application.casosUso;

import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoPorBairroResposta;
import com.cidadera.trabalhofinal.application.servicos.ReportarServico;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;

@Component
public class ReportarCasoUso {
    private final ReportarServico reportService;

    public ReportarCasoUso(ReportarServico reportService) {
        this.reportService = reportService;
    }

    public List<ReclamacaoPorBairroResposta> issuesPerNeighborhoodAndDateRange(LocalDate initialDate, LocalDate finalDate) {
        return reportService.issuesPerNeighborhoodAndDateRange(initialDate,finalDate);

    }
}
