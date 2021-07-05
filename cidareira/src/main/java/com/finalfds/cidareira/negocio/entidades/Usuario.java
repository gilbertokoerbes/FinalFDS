package com.finalfds.cidareira.negocio.entidades;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import com.finalfds.cidareira.negocio.entidades.enums.TipoUsuario;

@Entity
public class Usuario {
    
    @Id
    private long id;
    private String nome;
    private TipoUsuario tipoUsuario;
    private List<Reclamacao> reclamacao;
    private List<Comentarios> comentarios;

    public Usuario(){
    }

    public Usuario(String nome, TipoUsuario tipoUsuario){
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public List<Reclamacao> getReclamacao() {
        return reclamacao;
    }

    public void setReclamacao(List<Reclamacao> reclamacao) {
        this.reclamacao = reclamacao;
    }

    public List<Comentarios> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<Comentarios> comentarios) {
        this.comentarios = comentarios;
    }
}