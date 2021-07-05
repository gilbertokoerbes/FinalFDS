package com.finalfds.cidareira.aplicacao.modelos.respostas;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ComentarioOut;

public class ComentarioRes implements ComentarioOut<ComentarioRes>{
    private Long id;
    private Long idReclamacao;
    private String comentario;
    private String imagem;
    private Long idUsuario;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdReclamacao() {
        return idReclamacao;
    }

    public void setIdReclamacao(Long idReclamacao) {
        this.idReclamacao = idReclamacao;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public ComentarioRes fromEntity(Comentarios comentarios){
        this.setId(comentarios.getId());
        this.setIdReclamacao(comentarios.getReclamacao().getId());
        this.setComentario(comentarios.getComentario());
        this.setImagem(comentarios.getImagem());
        this.setIdUsuario(comentarios.getUsuario().getId());
        return this;
    }
}