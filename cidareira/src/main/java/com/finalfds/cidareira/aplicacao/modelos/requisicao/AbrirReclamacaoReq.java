package com.finalfds.cidareira.aplicacao.modelos.requisicao;

import java.time.LocalDate;

import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.enums.Categoria;
import com.finalfds.cidareira.negocio.entidades.enums.Status;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ReclamacaoIn;

public class AbrirReclamacaoReq implements ReclamacaoIn{
    private String titulo;
    private String descricao;
    private LocalDate data;
    private String bairro;
    private String rua;
    private Categoria categoria;
    private String imgLink;
    private Long idUsuario;

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

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public Reclamacao toEntity(){
        Reclamacao reclamacao = new Reclamacao();
        reclamacao.setTitulo(this.getTitulo());
        reclamacao.setDescricao(this.getDescricao());
        reclamacao.setData(this.getData());
        reclamacao.setBairro(this.getBairro());
        reclamacao.setRua(this.getRua());
        reclamacao.setCategoria(this.getCategoria());
        reclamacao.setImgLink(this.getImgLink());
        reclamacao.setStatus(Status.ABERTA);
        Usuario usuario = new Usuario();
        usuario.setId(this.getIdUsuario());
        reclamacao.setUsuario(usuario);
        return reclamacao;
    }

    
}
