package com.cidadera.trabalhofinal.application.modelos.resposta;

import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.entidades.enums.CategoriaReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.enums.StatusReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ReclamacaoOutput;

import java.time.LocalDate;

public class ReclamacaoResposta implements ReclamacaoOutput<ReclamacaoResposta> {
    private Long id;
    private String title;
    private String description;
    private LocalDate date;
    private String neighborhood;
    private String street;
    private CategoriaReclamacaoEnum category;
    private String imageLink;
    private StatusReclamacaoEnum issueStatus;
    private Long userId;

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

    public void setCategory(CategoriaReclamacaoEnum category) {
        this.category = category;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public ReclamacaoResposta fromEntity(Reclamacao reclamacao) {

        this.setId(reclamacao.getId());
        this.setTitle(reclamacao.getTitle());
        this.setDescription(reclamacao.getDescription());
        this.setDate(reclamacao.getDate());
        this.setNeighborhood(reclamacao.getNeighborhood());
        this.setStreet(reclamacao.getStreet());
        this.setCategory(reclamacao.getCategory());
        this.setImageLink(reclamacao.getImageLink());
        this.setIssueStatus(reclamacao.getIssueStatus());
        this.setUserId(reclamacao.getUser().getId());

        return this;
    }
}
