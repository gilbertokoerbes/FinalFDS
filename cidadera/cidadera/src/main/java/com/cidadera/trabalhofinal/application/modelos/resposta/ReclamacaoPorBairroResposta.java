package com.cidadera.trabalhofinal.application.modelos.resposta;

public class ReclamacaoPorBairroResposta {
    private Long count;
    private String neighborhood;
    private String category;

    public ReclamacaoPorBairroResposta(Long count, String neighborhood, String category) {
        this.count = count;
        this.neighborhood = neighborhood;
        this.category = category;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
