package com.finalfds.cidareira.negocio.entidades;

public class Endereco {
    private Long id;
    private String nomeRua;
    private int numeroRua;
    private String complementoRua;
    private Bairros bairros;

    public Endereco(Long id, String nomeRua, int numeroRua, String complementoRua, Bairros bairros){
        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.complementoRua = complementoRua;
        this.bairros = bairros;
    }

    public Endereco(Long id, String nomeRua, int numeroRua, Bairros bairros){
        this.id = id;
        this.nomeRua = nomeRua;
        this.numeroRua = numeroRua;
        this.bairros = bairros;
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

    public Bairros getBairros(){
        return bairros;
    }
}
