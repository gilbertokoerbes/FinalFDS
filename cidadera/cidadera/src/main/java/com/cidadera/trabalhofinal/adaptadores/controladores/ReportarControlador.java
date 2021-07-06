package com.cidadera.trabalhofinal.adaptadores.controladores;

import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoPorBairroResposta;
import com.cidadera.trabalhofinal.application.casosUso.ReportarCasoUso;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/v1/reportes")
public class ReportarControlador {
    private final ReportarCasoUso reportarCasoUso;

    public ReportarControlador(ReportarCasoUso reportarCasoUso) {
        this.reportarCasoUso = reportarCasoUso;
    }

    @GetMapping("/issues/neighborhood/category")
    public ResponseEntity<List<ReclamacaoPorBairroResposta>> issuesPerNeighborhood(@RequestParam(required = false)@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate initialDate, @RequestParam(required = false) @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate finalDate) {
        return ResponseEntity.ok(reportarCasoUso.issuesPerNeighborhoodAndDateRange(initialDate,finalDate));

    }
}
