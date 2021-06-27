package com.finalfds.cidareira.negocio;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comentarios{
    @Id
    private long n_comentario;
    private long n_reclamacao;
    private String titulo;
    private String descricao;
    private Date dataInsercao;
    private Usuario idAutor;

    public Comentarios(long n_comentario, long n_reclamacao, String titulo, String descricao, Date dataInsercao, Usuario usuario){

        this.n_comentario = n_comentario;
        this.n_reclamacao = n_reclamacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInsercao = dataInsercao;
        this.idAutor = usuario;

    }

    public long get_n_reclamacao(){
        return this.n_reclamacao;
    }
    
    public long get_n_comentario(){
        return this.n_comentario;
    }

    public String getTitulo(){
        return this.titulo;
    }
    
    public String getDescricao(){
        return this.descricao;
    }

    public Date setDataInsercao(){
        return this.dataInsercao;
    }

    public Usuario getIdAutor()){
        return this.idAutor;
    }
    
    public void set_n_comentario(long n_comentario){
        this.n_comentario = n_comentario;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setStatusReclamacao(){
        super.setStatusResolvido();
    }

    
}
