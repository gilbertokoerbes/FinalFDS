package com.cidadera.trabalhofinal.negocio.entidades;

import javax.persistence.*;

@Entity(name="comments")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String comment;
    private String image;
    @ManyToOne
    @JoinColumn(name="issue_id", nullable=false)
    private Reclamacao reclamacao;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Comentario() {
    }

    public Comentario(String comment, Reclamacao reclamacao, User user) {
        this.comment = comment;
        this.reclamacao = reclamacao;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Reclamacao getIssue() {
        return reclamacao;
    }

    public void setIssue(Reclamacao reclamacao) {
        this.reclamacao = reclamacao;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}