package com.finalfds.cidareira.adaptadores.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.finalfds.cidareira.adaptadores.Repositorios.RepositorioReclamacoes;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;


@RestController
@RequestMapping("/reclamacoes")
public class ReclamacoesController{

    @Autowired
    RepositorioReclamacoes rr = new RepositorioReclamacoes();

        @PostMapping("/adicionar"){
            public void adicionaReclamacao(@RequestParam){
            if (@Post)
            rr.cadastraReclamação(new Reclamacao())
            }
        }

    @GetMapping("/alterar/{id}")
    public void alterarReclamacao(@PathParam id){

    }

    @GetMapping("/comentar/{id}")
    public RepositorioComentario cadastraComentario()

    //@GetMapping("/corredor")
    //@CrossOrigin(origins = "*")
    //public List<Corredor> consultaCorredor() {
    //    return consultaCorredoresUC.run();
    //}
    
    //@GetMapping("/AdminConsulta")
    //@CrossOrigin(origins = "*")
    //public List<Corredor> consultaCorredor() {
    //   return consultaCorredoresUC.run();
    //}

    @RequestMapping("/admin"){
        
    }
}
