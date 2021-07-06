package com.cidadera.trabalhofinal.negocio.entidades.mapeadores;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;

public interface ComentarioOutput<T> {

    T fromEntity(Comentario comentario);
}
