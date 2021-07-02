package com.finalfds.cidareira.negocio.entidades;

public class Endereco {
    private Long id;
    private String nomeRua;
    private String nomeBairro;
    private int numeroRua;
    private String complementoRua;

    public Endereco(Long id, String nomeRua, String nomeBairro, int numeroRua, String complementoRua){
        this.id = id;
        this.nomeRua = nomeRua;
        this.nomeBairro = nomeBairro;
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

    public String getNomeBairro(){
		return nomeBairro;
	}

    public int getNumeroRua(){
        return numeroRua;
    }

    public String getComplementoRua(){
        return complementoRua;
    }
}
