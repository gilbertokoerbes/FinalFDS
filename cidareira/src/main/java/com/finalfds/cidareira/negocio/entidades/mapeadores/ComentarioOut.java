package com.finalfds.cidareira.negocio.entidades.mapeadores;

import com.finalfds.cidareira.negocio.entidades.*;

public interface ComentarioOut<T>{
    T fromEntity(Comentarios comentarios);
}
