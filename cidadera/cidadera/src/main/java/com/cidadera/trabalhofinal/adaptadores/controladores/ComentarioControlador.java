package com.cidadera.trabalhofinal.adaptadores.controladores;

import com.cidadera.trabalhofinal.application.modelos.requisicao.EditarComentarioRequisicao;
import com.cidadera.trabalhofinal.application.modelos.requisicao.AbrirComentarioRequisicao;
import com.cidadera.trabalhofinal.application.modelos.resposta.ComentarioReposta;
import com.cidadera.trabalhofinal.application.casosUso.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/comentarios")
public class ComentarioControlador {
    private final AbrirComentarioCasoUso abrirComentarioCasoUso;
    private final EncontrarComentarioCasoUso encontrarComentarioCasoUso;
    private final EditarComentarioCasoUso editarComentarioCasoUso;

    public ComentarioControlador(AbrirComentarioCasoUso abrirComentarioCasoUso, EncontrarComentarioCasoUso encontrarComentarioCasoUso, EditarComentarioCasoUso editarComentarioCasoUso) {
        this.abrirComentarioCasoUso = abrirComentarioCasoUso;
        this.encontrarComentarioCasoUso = encontrarComentarioCasoUso;
        this.editarComentarioCasoUso = editarComentarioCasoUso;
    }

    @PostMapping
    public ResponseEntity<ComentarioReposta> openComment(@RequestBody AbrirComentarioRequisicao request) {
        return new ResponseEntity<>(abrirComentarioCasoUso.run(request), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<ComentarioReposta> editComment(@RequestBody EditarComentarioRequisicao request) {
        return editarComentarioCasoUso.run(request)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/{userId}")
    public ResponseEntity<ComentarioReposta> findCommentById(@PathVariable Long userId) {
       return encontrarComentarioCasoUso.byId(userId)
               .map(ResponseEntity::ok)
               .orElse(ResponseEntity.notFound().build());
    }
}
