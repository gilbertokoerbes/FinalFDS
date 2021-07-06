package com.cidadera.trabalhofinal.adaptadores.configuracao;

import com.cidadera.trabalhofinal.negocio.entidades.Comentario;
import com.cidadera.trabalhofinal.negocio.entidades.Reclamacao;
import com.cidadera.trabalhofinal.negocio.entidades.User;
import com.cidadera.trabalhofinal.negocio.entidades.enums.CategoriaReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.enums.StatusReclamacaoEnum;
import com.cidadera.trabalhofinal.negocio.entidades.enums.TipoUsuarioEnum;
import com.cidadera.trabalhofinal.negocio.repositorios.ComentarioRepository;
import com.cidadera.trabalhofinal.negocio.repositorios.ReclamacaoRepository;
import com.cidadera.trabalhofinal.negocio.repositorios.UsuarioRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;

@Configuration
public class DataRunner implements ApplicationRunner {
    private final ReclamacaoRepository reclamacaoRepository;
    private final ComentarioRepository comentarioRepository;
    private final UsuarioRepository usuarioRepository;

    public DataRunner(ReclamacaoRepository reclamacaoRepository, ComentarioRepository comentarioRepository, UsuarioRepository usuarioRepository) {
        this.reclamacaoRepository = reclamacaoRepository;
        this.comentarioRepository = comentarioRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User guilherme = usuarioRepository.save(new User("Guilherme", TipoUsuarioEnum.NORMAL));
        User joao = usuarioRepository.save(new User("Joao", TipoUsuarioEnum.ADMINISTRADOR));
        User jose = usuarioRepository.save(new User("Jose", TipoUsuarioEnum.OFICIAL));

        Reclamacao reclamacao1 = reclamacaoRepository.save(new Reclamacao("teste", "teste1", LocalDate.now(), "teste2", "teste3", CategoriaReclamacaoEnum.BURACO_NA_VIA, StatusReclamacaoEnum.ABERTA, guilherme));
        Reclamacao reclamacao2 = reclamacaoRepository.save(new Reclamacao("teste", "teste1", LocalDate.of(2021, 5, 15), "teste4", "teste6", CategoriaReclamacaoEnum.ILUMINACAO, StatusReclamacaoEnum.ABERTA, guilherme));
        Reclamacao reclamacao3 = reclamacaoRepository.save(new Reclamacao("teste", "teste1", LocalDate.now(), "teste2", "teste3", CategoriaReclamacaoEnum.ILUMINACAO, StatusReclamacaoEnum.ABERTA, joao));
        Reclamacao reclamacao4 = reclamacaoRepository.save(new Reclamacao("teste", "teste1", LocalDate.now(), "teste2", "teste3", CategoriaReclamacaoEnum.ILUMINACAO, StatusReclamacaoEnum.ABERTA, jose));

        comentarioRepository.save(new Comentario("TESTE", reclamacao1, guilherme));
        comentarioRepository.save(new Comentario("TESTE1", reclamacao1, joao));
        comentarioRepository.save(new Comentario("TESTE2", reclamacao3, jose));

    }
}
