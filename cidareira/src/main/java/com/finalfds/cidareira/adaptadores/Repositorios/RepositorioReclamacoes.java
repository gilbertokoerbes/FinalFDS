package com.finalfds.cidareira.adaptadores.Repositorios;

import java.util.List;

import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Categoria;
import com.finalfds.cidareira.negocio.entidades.Endereco;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.entidades.Usuario;

public class RepositorioReclamacoes implements IRepositorioReclamacoes{

    private IRepositorioReclamacoesCRUD reclamacoesCRUD;
    
    public void RepositorioReclamacoes(IRepositorioReclamacoesCRUD reclamacoesCRUD){
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
        return null;
    }

    @Override
    public String getStatus(long id) {
        List<Reclamacao> r = reclamacoesCRUD.findId(id);
        String status;
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
