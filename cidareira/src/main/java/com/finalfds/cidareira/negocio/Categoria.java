package com.finalfds.cidareira.negocio;

public class Categoria {

    private String categoria;

    public Categoria(String categoria){
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "{ Categoria = " +getCategoria() +"}";
    }

    public String getCategoria(){
        return categoria;
    }

}
