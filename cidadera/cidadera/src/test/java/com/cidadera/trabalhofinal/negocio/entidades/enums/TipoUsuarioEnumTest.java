package com.cidadera.trabalhofinal.negocio.entidades.enums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TipoUsuarioEnumTest {
    @Test
    void valuesNormal(){
        TipoUsuarioEnum Category = TipoUsuarioEnum.NORMAL;
        assertEquals(TipoUsuarioEnum.valueOf("NORMAL"), Category);
    }

    @Test
    void valuesAdministrador(){
        TipoUsuarioEnum Category = TipoUsuarioEnum.ADMINISTRADOR;
        assertEquals(TipoUsuarioEnum.valueOf("ADMINISTRADOR"), Category);
    }

    @Test
    void valuesOficial(){
        TipoUsuarioEnum Category = TipoUsuarioEnum.OFICIAL;
        assertEquals(TipoUsuarioEnum.valueOf("OFICIAL"), Category);
    }

}