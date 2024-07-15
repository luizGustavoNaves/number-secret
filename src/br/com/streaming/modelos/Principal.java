package br.com.streaming.modelos;

import br.com.streaming.calculos.CalculadoraDeTempo;
import br.com.streaming.calculos.FiltroDeRecomendacoes;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Coringa", 2019);
        meuFilme.setDuracaoEmMinutos(122);
        System.out.println("O filme tem duração de: " + meuFilme.getDuracaoEmMinutos() + " minutos");

        meuFilme.exibirFichaTecnica();
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(8);
        meuFilme.avaliacao(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        meuFilme.mediaAvaliacoes();
        System.out.println("Média das avaliações: " + meuFilme.getMediaAvaliacoes());

        Serie lost = new Serie("Stranger Things", 2020);
        lost.setTotalDeTemporadas(8);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Tempo total necessário para maratonar " + meuFilme.getNomeDaMidia() + " é de " + meuFilme.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.setDuracaoEmMinutos(250);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        br.com.streaming.modelos.Episodio primeiro = new br.com.streaming.modelos.Episodio();
        primeiro.setNumeroEpisodio(1);
        primeiro.setSerie(lost);
        primeiro.setTotalDeVisualizacoes(100);

        FiltroDeRecomendacoes filtro = new FiltroDeRecomendacoes();
        filtro.filtrar(meuFilme);

        Filme filmeGustavo = new Filme("Constantine", 2005);
        filmeGustavo.setDuracaoEmMinutos(200);
        filmeGustavo.avaliacao(9);

        ArrayList<Filme> listaDeFilmes = new ArrayList<Filme>();
        listaDeFilmes.add(filmeGustavo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);
    }
}
