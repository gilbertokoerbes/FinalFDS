package com.finalfds.cidareira.negocio.servicos;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Usuario;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoReclamacao{
    public IRepositorioReclamacoes reclamacoesR;

    @Autowired
    public ServicoReclamacao(IRepositorioReclamacoes reclamacoesR){
        this.reclamacoesR = reclamacoesR;
    }

    public List<Reclamacao>getAllReclamacao(){
        return reclamacoesR.getAllReclamacao();
    }

    public void registrarReclamacao(Reclamacao reclamacao){
        reclamacoesR.register(reclamacao);
    }

    public List<Reclamacao> getCategoria(Categoria categoria){
        return reclamacoesR.getCategoria(categoria);
    }

    public List<Reclamacao> getUsuario(Usuario usuario){
        return reclamacoesR.getUsuario(usuario);
    }

    public String getStatus(Long Statusid){
        return reclamacoesR.getStatus(Statusid);
    }
}