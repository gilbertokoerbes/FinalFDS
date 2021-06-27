package com.finalfds.cidareira.negocio;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reclamacao {
    @Id
    private long n_reclamacao;
    private String titulo;
    private String descricao;
    private Date dataAbertura;
    private String endereco;
    private Usuario idAutor;

    

    public Reclamacao(long n_reclamacao, String titulo, String descricao, Date dataAbertura, String endereco, Usuario idUsuario) {
        this.n_reclamacao = n_reclamacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.endereco = endereco;
        this.idAutor = idUsuario;
    }


    
    @Override
    public String toString() {
        return "{" +
            " n_reclamacao='" + getN_reclamacao() + "'" +
            ", titulo='" + getTitulo() + "'" +
            ", descricao='" + getDescricao() + "'" +
            ", dataAbertura='" + getDataAbertura() + "'" +
            ", endereco='" + getEndereco() + "'" +
            ", idAutor='" + getIdAutor() + "'" +
            "}";
    }
    public long getN_reclamacao() {
        return this.n_reclamacao;
    }

    public void setN_reclamacao(long n_reclamacao) {
        this.n_reclamacao = n_reclamacao;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(Date dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Usuario getIdAutor() {
        return this.idAutor;
    }

    public void setIdAutor(Usuario idAutor) {
        this.idAutor = idAutor;
    }    
    
}
