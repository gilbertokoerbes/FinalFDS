package com.finalfds.cidareira.negocio.entidades;

import java.util.Date;

public class Comentarios{

    private int n_comentario;
    private Reclamacao n_reclamacao;
    private String titulo;
    private String descricao;
    private Date dataInsercao;
    private Usuario idAutor;
    private String linkImagem;


    public Comentarios(int n_comentario, Reclamacao n_reclamacao, String titulo, String descricao, Date dataInsercao, Usuario usuario){

        this.n_comentario = n_comentario;
        this.n_reclamacao = n_reclamacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInsercao = dataInsercao;
        this.idAutor = usuario;
    }


    public Comentarios(int n_comentario, Reclamacao n_reclamacao, String titulo, String descricao, Date dataInsercao, Usuario usuario, String link){

        this.n_comentario = n_comentario;
        this.n_reclamacao = n_reclamacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataInsercao = dataInsercao;
        this.idAutor = usuario;
        this.linkImagem = link;
    }

    public Reclamacao get_n_reclamacao(){
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

    public Usuario getIdAutor(){
        return this.idAutor;
    }
    
    public void set_n_comentario(int n_comentario){
        this.n_comentario = n_comentario;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getLinkImagem(){
        return this.linkImagem;
    }    

    public void setUrlImagem(String url){
        this.linkImagem = url;
    }
    
}
