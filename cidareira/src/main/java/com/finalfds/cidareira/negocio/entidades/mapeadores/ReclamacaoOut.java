package com.finalfds.cidareira.negocio.entidades.mapeadores;

import com.finalfds.cidareira.negocio.entidades.*;

public interface ReclamacaoOut<T>{
    T fromEntity(Reclamacao reclamacao);
}
