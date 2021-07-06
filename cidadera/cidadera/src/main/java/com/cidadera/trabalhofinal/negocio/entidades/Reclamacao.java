package com.cidadera.trabalhofinal.negocio.entidades;

import com.cidadera.trabalhofinal.negocio.entidades.enums.CategoriaReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.enums.StatusReclamacaoEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity(name="issues")
public class Reclamacao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String neighborhood;
    private String street;
    @Enumerated(EnumType.STRING)
    private CategoriaReclamacaoEnum category;
    private String imageLink;
    @Enumerated(EnumType.STRING)
    private StatusReclamacaoEnum issueStatus;
    @OneToMany(mappedBy="reclamacao")
    private List<Comentario> comments;
    @ManyToOne
    @JoinColumn(name="user_id", nullable=false)
    private User user;

    public Reclamacao() {
    }

    public Reclamacao(String title, String description, LocalDate date, String neighborhood, String street, CategoriaReclamacaoEnum category, StatusReclamacaoEnum issueStatus, User user) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.neighborhood = neighborhood;
        this.street = street;
        this.category = category;
        this.issueStatus = issueStatus;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public CategoriaReclamacaoEnum getCategory() {
        return category;
    }

    public void setCategory(CategoriaReclamacaoEnum type) {
        this.category = type;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public StatusReclamacaoEnum getIssueStatus() {
        return issueStatus;
    }

    public void setIssueStatus(StatusReclamacaoEnum issueStatus) {
        this.issueStatus = issueStatus;
    }

    public List<Comentario> getComments() {
        return comments;
    }

    public void setComments(List<Comentario> comment) {
        this.comments = comment;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}