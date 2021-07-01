package com.finalfds.cidareira.negocio.entidades;

public class Endereco {
    private Long id;
    private String nomeRua;
    private int numeroRua;
    private String complementoRua;

    public Endereco(Long id, String nomeRua, int numeroRua, String complementoRua){
        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.complementoRua = complementoRua;
    }

    public Endereco(Long id, String nomeRua, int numeroRua){
        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
    }

    public Endereco(){

    }

    public Long getID(){
        return id;
    }

    public String getNomeRua(){
        return nomeRua;
    }

    public int getNumeroRua(){
        return numeroRua;
    }

    public String getComplementoRua(){
        return complementoRua;
    }
}
