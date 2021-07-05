package com.finalfds.cidareira.aplicacao.modelos.respostas;

import java.time.LocalDate;

import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.enums.Categoria;
import com.finalfds.cidareira.negocio.entidades.enums.Status;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ReclamacaoOut;

public class ReclamacaoRes implements ReclamacaoOut<ReclamacaoRes>{
    private long id;
    private String titulo;
    private String descricao;
    private LocalDate data;
    private String bairro;
    private String rua;
    private Categoria categoria;
    private String imgLink;
    private Status status;
    private Long idUsuario;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public ReclamacaoRes fromEntity(Reclamacao reclamacao){
        this.setId(reclamacao.getId());
        this.setTitulo(reclamacao.getTitulo());
        this.setDescricao(reclamacao.getDescricao());
        this.setData(reclamacao.getData());
        this.setBairro(reclamacao.getBairro());
        this.setRua(reclamacao.getRua());
        this.setCategoria(reclamacao.getCategoria());
        this.setImgLink(reclamacao.getImgLink());
        this.setStatus(reclamacao.getStatus());
        this.setIdUsuario(reclamacao.getUsuario().getId());
        return this;
    }
}