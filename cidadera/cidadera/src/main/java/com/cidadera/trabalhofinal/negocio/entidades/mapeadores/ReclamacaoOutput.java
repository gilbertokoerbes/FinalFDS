package com.cidadera.trabalhofinal.negocio.entidades.mapeadores;

import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;

public interface ReclamacaoOutput<T> {

    T fromEntity(Reclamacao reclamacao);
}
