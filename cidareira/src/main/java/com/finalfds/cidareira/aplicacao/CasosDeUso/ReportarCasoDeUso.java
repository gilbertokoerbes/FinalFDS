package com.finalfds.cidareira.aplicacao.CasosDeUso;

import java.time.LocalDate;
import java.util.List;
import com.finalfds.cidareira.aplicacao.modelos.respostas.ReclamacaoBairroRes;
import com.finalfds.cidareira.aplicacao.servicos.ReportarServico;
import org.springframework.stereotype.Component;

@Component
public class ReportarCasoDeUso {
    private ReportarServico reportarServico;

    public ReportarCasoDeUso(ReportarServico reportarServico){
        this.reportarServico = reportarServico;
    }

    public List<ReclamacaoBairroRes> reclamacaoBairroRes(LocalDate dataInicial, LocalDate dataFinal){
        return reportarServico.reclamacaoBairroRes(dataInicial, dataFinal);
    }
}
