package com.opensanca.trilharest.filmes.filmes;


import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@RestController
@RequestMapping("/filmes")
public class FilmesAPI {

   @Autowired
   private FilmesRepository filmesRepository;



    @RequestMapping(path="/em-exibicao", method= RequestMethod.GET)
    public Pagina<Filme> getEmExibicao(
            ParametrosDePaginacao parametrosDePaginacao) {

        if(parametrosDePaginacao == null){
            parametrosDePaginacao = new ParametrosDePaginacao();
        }

        return this.filmesRepository.buscarPaginaEmExibicao(parametrosDePaginacao);
    }

    @GetMapping("/{id}")
    public  Filme getPorId(@PathVariable UUID id) {
        return this.filmesRepository.buscaPorId(id) ;
    }


}
