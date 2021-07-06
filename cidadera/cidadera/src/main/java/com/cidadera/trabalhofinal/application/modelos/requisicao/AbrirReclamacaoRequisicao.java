package com.cidadera.trabalhofinal.application.modelos.requisicao;

import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.entidades.User;
import com.cidadera.trabalhofinal.negocio.entidades.enums.CategoriaReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.enums.StatusReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.mapeadores.ReclamacaoInput;

import java.time.LocalDate;

public class AbrirReclamacaoRequisicao implements ReclamacaoInput {
    private String title;
    private String description;
    private LocalDate date;
    private String neighborhood;
    private String street;
    private CategoriaReclamacaoEnum category;
    private String imageLink;
    private Long userId;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public Reclamacao toEntity() {
        Reclamacao reclamacao = new Reclamacao();
        reclamacao.setTitle(this.getTitle());
        reclamacao.setDescription(this.getDescription());
        reclamacao.setDate(this.getDate());
        reclamacao.setNeighborhood(this.getNeighborhood());
        reclamacao.setStreet(this.getStreet());
        reclamacao.setCategory(this.getCategory());
        reclamacao.setImageLink(this.getImageLink());
        reclamacao.setIssueStatus(StatusReclamacaoEnum.ABERTA);
        User user = new User();
        user.setId(this.getUserId());
        reclamacao.setUser(user);

        return reclamacao;
    }
}

