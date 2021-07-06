package com.cidadera.trabalhofinal.negocio.entidades;

import com.cidadera.trabalhofinal.negocio.entidades.enums.TipoUsuarioEnum;

import javax.persistence.*;
import java.util.List;

@Entity(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private TipoUsuarioEnum userType;
    @OneToMany(mappedBy="user")
    private List<Reclamacao> issues;
    @OneToMany(mappedBy="user")
    private List<Comentario> comments;

    public User() {
    }

    public User(String name, TipoUsuarioEnum userType) {
        this.name = name;
        this.userType = userType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TipoUsuarioEnum getUserType() {
        return userType;
    }

    public void setUserType(TipoUsuarioEnum userType) {
        this.userType = userType;
    }

    public List<Reclamacao> getIssues() {
        return issues;
    }

    public void setIssues(List<Reclamacao> issues) {
        this.issues = issues;
    }

    public List<Comentario> getComments() {
        return comments;
    }

    public void setComments(List<Comentario> comments) {
        this.comments = comments;
    }
}