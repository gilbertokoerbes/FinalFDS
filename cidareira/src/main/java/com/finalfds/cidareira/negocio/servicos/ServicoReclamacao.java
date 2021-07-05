package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum.AbrirReclamacao;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.enums.Categoria;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public abstract class ServicoReclamacao{
    public IRepositorioReclamacoes reclamacoesRepo;

    public ServicoReclamacao(IRepositorioReclamacoes reclamacoesRepo){
        this.reclamacoesRepo = reclamacoesRepo;
    }

    public <T> T AbrirReclamacao(){
    }

    public Optional<Reclamacao> findById(long id){
        return reclamacoesRepo.FindById(id);
    }

    public <T> Optional<T> editarReclamacao(){
    }
}