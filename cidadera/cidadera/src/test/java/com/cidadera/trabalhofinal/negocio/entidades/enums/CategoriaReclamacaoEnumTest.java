package com.cidadera.trabalhofinal.negocio.entidades.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoriaReclamacaoEnumTest {

    @Test
    void valuesAgua() {
        CategoriaReclamacaoEnum Category = CategoriaReclamacaoEnum.AGUA;
        assertEquals(CategoriaReclamacaoEnum.valueOf("AGUA"), Category);
    }
    @Test
    void valuesIluminacao(){
        CategoriaReclamacaoEnum Category = CategoriaReclamacaoEnum.ILUMINACAO;
        assertEquals(CategoriaReclamacaoEnum.valueOf("ILUMINACAO"), Category);
    }
    @Test
    void valuesBuracoNaVia(){
        CategoriaReclamacaoEnum Category = CategoriaReclamacaoEnum.BURACO_NA_VIA;
        assertEquals(CategoriaReclamacaoEnum.valueOf("BURACO_NA_VIA"), Category);
    }

    @Test
    void valuesEsgoto(){
        CategoriaReclamacaoEnum Category = CategoriaReclamacaoEnum.ESGOTO;
        assertEquals(CategoriaReclamacaoEnum.valueOf("ESGOTO"), Category);
    }

    @Test
    void valuesSeguranca(){
        CategoriaReclamacaoEnum Category = CategoriaReclamacaoEnum.SEGURANCA;
        assertEquals(CategoriaReclamacaoEnum.valueOf("SEGURANCA"), Category);
    }
}