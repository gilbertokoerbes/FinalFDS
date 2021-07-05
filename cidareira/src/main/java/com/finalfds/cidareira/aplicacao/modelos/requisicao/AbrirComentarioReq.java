package com.finalfds.cidareira.aplicacao.modelos.requisicao;

import com.finalfds.cidareira.negocio.entidades.Comentarios;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.mapeadores.ComentarioIn;

public class AbrirComentarioReq implements ComentarioIn{
    private Long id;
    private String comentario;
    private String imagem;
    private Long idUsuario;

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
    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public Comentarios toEntity(){
        Comentarios comentarios = new Comentarios();
        Reclamacao reclamacao = new Reclamacao();
        reclamacao.setId(this.getId());
        comentarios.setReclamacao(reclamacao);
        comentarios.setComentario(this.getComentario());
        comentarios.setImagem(this.getImagem());
        Usuario usuario = new Usuario();
        usuario.setId(this.getIdUsuario());
        comentarios.setUsuario(usuario);
        return comentarios;
    }
}
