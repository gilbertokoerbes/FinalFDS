package com.finalfds.cidareira.negocio.entidades;

import java.time.LocalDate;
import java.util.*;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.finalfds.cidareira.negocio.entidades.enums.*;

@Entity
public class Reclamacao{
    @Id
    private long id;
    private String titulo;
    private String descricao;
    private LocalDate data;
    private String bairro;
    private String rua;
    private Categoria categoria;
    private String imgLink;
    private Status status;
    private List<Comentarios> comentarios;
    private Usuario usuario;
    
    public Reclamacao(){
    }

    public Reclamacao(String titulo, String descricao, LocalDate data, String bairro, String rua, Categoria categoria, Status status, Usuario usuario){
        this.titulo = titulo;
        this.descricao = descricao;
        this.data = data;
        this.bairro = bairro;
        this.rua = rua;
        this.categoria = categoria;
        this.status = status;
        this.usuario = usuario;
    }

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

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}