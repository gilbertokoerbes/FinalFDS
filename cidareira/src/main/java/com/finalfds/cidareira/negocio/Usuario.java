package com.finalfds.cidareira.negocio;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    @Id
    private long idUsuario;
    private String tipo;

    public Usuario(long idUsuario, String tipo) {
        this.idUsuario = idUsuario;
        this.tipo = tipo;
    }

         

    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
