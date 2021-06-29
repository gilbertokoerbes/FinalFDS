package com.finalfds.cidareira.adaptadores;

import com.finalfds.cidareira.negocio.Reclamacao;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class RepositorioReclamacoes implements IRepositorioReclamacoes{
    private JdbcTemplate jdbcTemplate;

    public RepositorioReclamacoes(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;  
        this.jdbcTemplate.execute("DROP TABLE reclamacao IF EXISTS");
        this.jdbcTemplate.execute("CREATE TABLE reclamacao("
                + "id_reclamacao INT, titulo VARCHAR(50), descricao VARCHAR(255)," 
                + "dataAbertura VARCHAR(10), endereco VARCHAR(100), id_Autor INT, statusReclamacao VARCHAR(30),linkImagem VARCHAR (255), PRIMARY KEY(id_reclamacao))");
    }


    @Override
    public boolean cadastraReclamacao(Reclamacao r) {
        this.jdbcTemplate.update(
            "INSERT INTO reclamacao(id_reclamacao,titulo,descricao,dataAbertura,endereco,id_Autor,statusReclamacao,linkImagem) VALUES (?,?,?,?,?,?,?,?,?)",
            r.getN_reclamacao(),r.getTitulo(),r.getDescricao(),r.getDataAbertura(),r.getEndereco(),r.getIdAutor(),r.getstatusReclamacao(),r.getLinkImagem());
        return true;
    }

    @Override
    public int getTotalReclamacoes() {
        String sql = "select count(*) from reclamacao";
        int rtn = this.jdbcTemplate.queryForList(sql);
        return rtn;
    }

    @Override
    public int getMediaComentarios() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override 
    public int getPercentualInfo() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int getOrgOficial() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
