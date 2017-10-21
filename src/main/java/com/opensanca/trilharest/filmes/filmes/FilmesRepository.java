package com.opensanca.trilharest.filmes.filmes;

import com.opensanca.trilharest.filmes.comum.Pagina;
import com.opensanca.trilharest.filmes.comum.ParametrosDePaginacao;
import java.util.UUID;

public interface FilmesRepository{



    Pagina<Filme> buscarPaginaEmExibicao(
            ParametrosDePaginacao parametrosDePaginacao);

   // @throws IllegalArgumentException se não encontrar id

    Filme buscaPorId(UUID id);


}
