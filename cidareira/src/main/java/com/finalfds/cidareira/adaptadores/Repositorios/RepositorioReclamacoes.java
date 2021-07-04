package com.finalfds.cidareira.adaptadores.Repositorios;

import java.util.List;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Endereco;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RepositorioReclamacoes implements IRepositorioReclamacoes{

    private IRepositorioReclamacoesCRUD reclamacoesCRUD;

    @Autowired
    public RepositorioReclamacoes(IRepositorioReclamacoesCRUD reclamacoesCRUD){
        this.reclamacoesCRUD = reclamacoesCRUD;
    }

    @Override
    public boolean register(Reclamacao reclamacao) {
        reclamacoesCRUD.save(reclamacao) ;
        return true;
    }

    @Override
    public void romeveAllReclamacao() {
        reclamacoesCRUD.deleteAll();
        
    }

    @Override
    public List<Reclamacao> getAllReclamacao() {
        List<Reclamacao> reclam = reclamacoesCRUD.findAll();
        return reclam;
    }

    @Override
    public String getStatus(long id) {
        List<Reclamacao> r = reclamacoesCRUD.findId(id);
        if(r.size()>0)  return r.get(0).getStatus();
        return "Não encontradro status para o ID";
    }

    @Override
    public List<Reclamacao> getCategoria(Categoria categoria) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Reclamacao> getUsuario(Usuario usuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Reclamacao> getEndereco(Endereco endereco) {
        // TODO Auto-generated method stub
        return null;
    }
    
}
