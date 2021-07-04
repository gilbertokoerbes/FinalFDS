package com.finalfds.cidareira.adaptadores.Repositorios;

import java.time.LocalDate;
import java.util.List;
import com.finalfds.cidareira.negocio.IRepositorios.IRepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

public interface IRepositorioReclamacoesCRUD extends CrudRepository<Reclamacao, Long>{
    List<Reclamacao> findAll();
    List<Reclamacao> findId(long id);
    List<Reclamacao> findUsuario(Usuario usuario);
    List<Reclamacao> findByStatus(Reclamacao r);
    List<Reclamacao> findCategoria(Categoria categoria);

    @Query ("selec * from Reclamacao c where c.dataPublicacao >= :dataInicia AND c.dataPublica < :dataFinal")
    List<Reclamacao> findData(LocalDate dataInicial, LocalDate dataFinal);
}





/*
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
*/