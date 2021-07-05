package com.finalfds.cidareira.aplicacao.modelos.respostas;

public class ReclamacaoBairroRes {
    private Long contador;
    private String bairro;
    private String categoria;

    public ReclamacaoBairroRes(Long contador, String bairro, String categoria){
        this.contador = contador;
        this.bairro = bairro;
        this.categoria = categoria;
    }

    public Long getContador() {
        return contador;
    }

    public void setContador(Long contador) {
        this.contador = contador;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}