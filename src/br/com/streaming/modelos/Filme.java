package br.com.streaming.modelos;

import br.com.streaming.calculos.Classificacao;

public class Filme extends Titulo implements Classificacao {
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClssificacao() {
        return (int) getMediaAvaliacoes() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNomeDaMidia() + " (" + this.getAnoDeLancamento() + ") ";
    }
}