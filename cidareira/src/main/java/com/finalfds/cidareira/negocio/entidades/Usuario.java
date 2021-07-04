package com.finalfds.cidareira.negocio.entidades;

//import javax.persistence.Entity;
//import javax.persistence.Id;

//@Entity
public class Usuario {
    
    //@Id
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
