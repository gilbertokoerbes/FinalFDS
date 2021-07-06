package com.cidadera.trabalhofinal.negocio.entidades.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatusReclamacaoEnumTest {

    @Test
    void valuesAberta() {
        StatusReclamacaoEnum Category = StatusReclamacaoEnum.ABERTA;
        assertEquals(StatusReclamacaoEnum.valueOf("ABERTA"), Category);
    }
    @Test
    void valuesResolvida(){
        StatusReclamacaoEnum Category = StatusReclamacaoEnum.RESOLVIDA;
        assertEquals(StatusReclamacaoEnum.valueOf("RESOLVIDA"), Category);
    }
    @Test
    void valuesEncerrada(){
        StatusReclamacaoEnum Category = StatusReclamacaoEnum.ENCERRADA;
        assertEquals(StatusReclamacaoEnum.valueOf("ENCERRADA"), Category);
    }

}