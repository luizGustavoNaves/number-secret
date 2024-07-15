package br.com.streaming.principal;

import br.com.streaming.modelos.Filme;
import br.com.streaming.modelos.Serie;
import br.com.streaming.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalListas {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------------");
        Filme meuFilme = new Filme("Coringa", 2019);
        meuFilme.avaliacao(10);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avaliacao(10);
        Filme filmeGustavo = new Filme("Constantine", 2005);
        filmeGustavo.avaliacao(10);
        Serie lost = new Serie("Stranger Things", 2020);
        lost.avaliacao(10);

        ArrayList<Titulo> listaDeMidias = new ArrayList<>();
        listaDeMidias.add(filmeGustavo);
        listaDeMidias.add(meuFilme);
        listaDeMidias.add(outroFilme);
        listaDeMidias.add(lost);

        for (Titulo item : listaDeMidias) {
            System.out.println(item);
            if (item instanceof Filme filme && filme.getClssificacao() >= 5) {
                System.out.println("Classificação = " + filme.getClssificacao() + " estrelas");
            }
        }

        System.out.println("------------------------------------------------");

        List<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Luiz Gustavo");
        buscaPorArtista.add("Bruno Martins");
        System.out.println(buscaPorArtista);

        System.out.println("------------------------------------------------");

        Collections.sort(buscaPorArtista);
        System.out.println("Lista de artistas ordenada: ");
        System.out.println(buscaPorArtista);

        System.out.println("------------------------------------------------");

        Collections.sort(listaDeMidias);
        System.out.println("Lista de titúlos ordenados: ");
        System.out.println(listaDeMidias);

        System.out.println("------------------------------------------------");

        listaDeMidias.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando a lista de mídias por ano - " + listaDeMidias );
    }
}
