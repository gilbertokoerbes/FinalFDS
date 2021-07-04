package com.finalfds.cidareira.negocio.entidades;


public class Usuario {
    

    private long idUsuario;
    private String tipo;

    public Usuario(long idUsuario, String tipo) {
        this.idUsuario = idUsuario;
        this.tipo = tipo;
    }        

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public String getTipo() {
        return this.tipo;
    }

}
