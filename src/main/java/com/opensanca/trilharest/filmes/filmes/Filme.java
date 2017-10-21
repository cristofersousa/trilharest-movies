package com.opensanca.trilharest.filmes.filmes;

import java.time.Duration;
import java.time.LocalDate;
import java.util.UUID;

public class Filme {

    private UUID id;

    public Filme() {

    }

    public Filme(UUID id, String nome, String sinopse, Duration duracao, LocalDate inicioExibicao, LocalDate fimExibicao) {
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.duracao = duracao;
        this.inicioExibicao = inicioExibicao;
        this.fimExibicao = fimExibicao;
    }

    private String nome;
    private String sinopse;
    private Duration duracao;
    private LocalDate inicioExibicao;
    private LocalDate fimExibicao;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Duration getDuracao() {
        return duracao;
    }

    public void setDuracao(Duration duracao) {
        this.duracao = duracao;
    }

    public LocalDate getInicioExibicao() {
        return inicioExibicao;
    }

    public void setInicioExibicao(LocalDate inicioExibicao) {
        this.inicioExibicao = inicioExibicao;
    }

    public LocalDate getFimExibicao() {
        return fimExibicao;
    }

    public void setFimExibicao(LocalDate fimExibicao) {
        this.fimExibicao = fimExibicao;
    }

    public boolean emExibicao(){
        return true;
    }
}