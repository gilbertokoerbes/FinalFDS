package com.finalfds.cidareira.negocio.entidades;

import javax.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Comentarios{
    @Id
    private Long id;
    private String comentario;
    private String imagem;
    private Reclamacao reclamacao;
    private Usuario usuario;

    public Comentarios(){
    }
    
    public Comentarios(String comentario, Reclamacao reclamacao, Usuario usuario){
        this.comentario = comentario;
        this.reclamacao = reclamacao;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public Reclamacao getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(Reclamacao reclamacao) {
        this.reclamacao = reclamacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}