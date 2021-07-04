package com.finalfds.cidareira.negocio.entidades;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reclamacao{
    @Id
    private long id;
    private String titulo;
    private String descricao;
    private String status;
    private ArrayList<Comentarios> comentarios[];
    private Usuario usuario;
    private Endereco endereco;
    private Categoria categoria;

    public Reclamacao(Long id, String titulo, String descricao, String status, Usuario usuario, Categoria categoria, Endereco endereco){
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.status = "status";
    }

    public Reclamacao(){

    }

    public Long getID(){
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getStatus(){
        return status;
    }
 
    public ArrayList<Comentarios>[] getComentarios() {
        return comentarios;
    }

    public Usuario getUsuario() {
        return usuario;
    }
  
    public Endereco getEndereco() {
        return endereco;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}