package com.cidadera.trabalhofinal.application.modelos.requisicao;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;
import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.entidades.User;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ComentarioInput;

public class EditarComentarioRequisicao implements ComentarioInput {
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
    public Comentario toEntity() {
        Comentario comentario = new Comentario();
        Reclamacao reclamacao = new Reclamacao();
        reclamacao.setId(this.getIssueId());
        comentario.setIssue(reclamacao);
        comentario.setId(this.getId());
        comentario.setComment(this.getComment());
        comentario.setImage(this.getImage());
        User user = new User();
        user.setId(this.getUserId());
        comentario.setUser(user);

        return comentario;
    }
}

