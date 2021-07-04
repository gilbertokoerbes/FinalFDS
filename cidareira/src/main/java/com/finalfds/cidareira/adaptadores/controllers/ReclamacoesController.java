package com.finalfds.cidareira.adaptadores.controllers;

import java.util.List;

import com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum.AbrirReclamacaoUC;
import com.finalfds.cidareira.aplicacao.Casos_de_uso_Comum.TotReclamacoesUCAdmin;
import com.finalfds.cidareira.negocio.entidades.Reclamacao;
import com.finalfds.cidareira.negocio.servicos.ServicoReclamacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/reclamacoes")
public class ReclamacoesController{
    private AbrirReclamacaoUC abrirReclamacaoUC;
    private ServicoReclamacao servicoReclamacao;
    private TotReclamacoesUCAdmin totReclamacoesUCAdmin;

    @Autowired
    public void ReclamacoesController(AbrirReclamacaoUC abrirReclamacaoUC, TotReclamacoesUCAdmin totReclamacoesUCAdmin){
        this.abrirReclamacaoUC = abrirReclamacaoUC;
        this.servicoReclamacao = servicoReclamacao;
        this.totReclamacoesUCAdmin = totReclamacoesUCAdmin;

    }
    
        @GetMapping ("/adicionar")
        @CrossOrigin(origins = "*")
        public List<Reclamacao> consultaReclamacoes(){
            return totReclamacoesUCAdmin.run();
        }

        @PostMapping ("/adicionar")
        @CrossOrigin(origins = "*")
        public boolean adicionaReclamacao(@RequestBody final Reclamacao reclamacao){
            abrirReclamacaoUC.run(reclamacao);
            return true;
        }
        


  //  @GetMapping("/alterar/{id}")
  //  public void alterarReclamacao(@PathParam id){
//
  //  }
//
  //  @GetMapping("/comentar/{id}")
  //  public RepositorioComentario cadastraComentario(){
  //      
  //  }

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
}
