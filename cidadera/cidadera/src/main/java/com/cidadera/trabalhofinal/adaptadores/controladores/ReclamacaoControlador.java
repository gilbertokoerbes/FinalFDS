package com.cidadera.trabalhofinal.adaptadores.controladores;

import com.cidadera.trabalhofinal.application.modelos.requisicao.EditarReclamacaoRequisicao;
import com.cidadera.trabalhofinal.application.modelos.resposta.ReclamacaoResposta;
import com.cidadera.trabalhofinal.application.modelos.requisicao.AbrirReclamacaoRequisicao;
import com.cidadera.trabalhofinal.application.casosUso.EditarReclamacaoCasoUso;
import com.cidadera.trabalhofinal.application.casosUso.EncontrarReclamacaoCasoUso;
import com.cidadera.trabalhofinal.application.casosUso.AbrirReclamacaoCasoUso;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/reclamacoes")
public class ReclamacaoControlador {
    private final AbrirReclamacaoCasoUso abrirReclamacaoCasoUso;
    private final EncontrarReclamacaoCasoUso encontrarReclamacaoCasoUso;
    private final EditarReclamacaoCasoUso editarReclamacaoCasoUso;

    public ReclamacaoControlador(AbrirReclamacaoCasoUso abrirReclamacaoCasoUso, EncontrarReclamacaoCasoUso encontrarReclamacaoCasoUso, EditarReclamacaoCasoUso editarReclamacaoCasoUso) {
        this.abrirReclamacaoCasoUso = abrirReclamacaoCasoUso;
        this.encontrarReclamacaoCasoUso = encontrarReclamacaoCasoUso;
        this.editarReclamacaoCasoUso = editarReclamacaoCasoUso;
    }

    @PostMapping
    public ResponseEntity<ReclamacaoResposta> openIssue(@RequestBody AbrirReclamacaoRequisicao request) {
        return new ResponseEntity<>(abrirReclamacaoCasoUso.run(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ReclamacaoResposta> editIssue(@RequestBody EditarReclamacaoRequisicao request) {
        return editarReclamacaoCasoUso.run(request)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{reclamacaoId}")
    public ResponseEntity<ReclamacaoResposta> findIssueById(@PathVariable Long reclamacaoId) {
       return encontrarReclamacaoCasoUso.byId(reclamacaoId)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }
}
