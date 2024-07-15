package br.com.streaming.modelos;

import br.com.streaming.calculos.Classificacao;
import org.w3c.dom.ls.LSOutput;

public class Episodio implements Classificacao {
    private int numeroEpisodio;
    private String nomeEpisodio;
    private Serie serie;
    private int totalDeVisualizacoes;

    public int getTotalDeVisualizacoes() {
        return totalDeVisualizacoes;
    }

    public void setTotalDeVisualizacoes(int totalDeVisualizacoes) {
        this.totalDeVisualizacoes = totalDeVisualizacoes;
    }

    public int getNumeroEpisodio() {
        return numeroEpisodio;
    }

    public void setNumeroEpisodio(int numeroEpisodio) {
        this.numeroEpisodio = numeroEpisodio;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public String getNomeEpisodio() {
        return nomeEpisodio;
    }

    public void setNomeEpisodio(String nomeEpisodio) {
        this.nomeEpisodio = nomeEpisodio;
    }

    @Override
    public int getClssificacao() {
        if (totalDeVisualizacoes > 100){
            return 4;
        } else {
            return 2;
        }
    }
}
