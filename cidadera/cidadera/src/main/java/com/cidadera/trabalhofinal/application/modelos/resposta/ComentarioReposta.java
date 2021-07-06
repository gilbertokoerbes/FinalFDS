package com.cidadera.trabalhofinal.application.modelos.resposta;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ComentarioOutput;


public class ComentarioReposta implements ComentarioOutput<ComentarioReposta> {
    private Long id;
    private Long issueId;
    private String comment;
    private String image;
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIssueId() {
        return issueId;
    }

    public void setIssueId(Long issueId) {
        this.issueId = issueId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public ComentarioReposta fromEntity(Comentario comentario) {

        this.setId(comentario.getId());
        this.setIssueId(comentario.getIssue().getId());
        this.setComment(comentario.getComment());
        this.setImage(comentario.getImage());
        this.setUserId(comentario.getUser().getId());

        return this;
    }
}
