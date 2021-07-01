package com.finalfds.cidareira.negocio.entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class Reclamacao {
    @Id
    private int n_reclamacao;
    private String titulo;
    private String descricao;
    private String dataAbertura;
    private String endereco;
    private Usuario idAutor;
    private Status statusReclamacao;
    private String linkImagem ;

    @Autowired    
    public Reclamacao(int n_reclamacao, String titulo, String descricao, String dataAbertura, String endereco, Usuario idUsuario, Status status){
        this.n_reclamacao = n_reclamacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.endereco = endereco;
        this.idAutor = idUsuario;
        this.statusReclamacao = status;
        this.linkImagem ="";
        statusReclamacao.setStatus("aberta", idUsuario);//Força a reclamacao estar como aberta
    }
    @Autowired    
    public Reclamacao(int n_reclamacao, String titulo, String descricao, String dataAbertura, String endereco, Usuario idUsuario, Status status, String url){
        this.n_reclamacao = n_reclamacao;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataAbertura = dataAbertura;
        this.endereco = endereco;
        this.idAutor = idUsuario;
        this.statusReclamacao = status;
        this.linkImagem = url;
        statusReclamacao.setStatus("aberta", idUsuario);//Força a reclamacao estar como aberta
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

    private void setN_reclamacao(int n_reclamacao) {
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

    public String getDataAbertura() {
        return this.dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getIdAutor() {
        return (int) this.idAutor.getIdUsuario();
    }

    private void setIdAutor(Usuario idAutor) {
        this.idAutor = idAutor;
    }

    public String getstatusReclamacao(){
        return statusReclamacao.toString();
    }
    public void setstatusReclamacao(String status, Usuario user){
        statusReclamacao.setStatus(status, user);
        
    }

    public String getLinkImagem(){
        return this.linkImagem;
    }

    public void setLinkImagem(String url){
        this.linkImagem = url;
    }   
}