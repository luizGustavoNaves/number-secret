package br.com.streaming.calculos;

public class FiltroDeRecomendacoes {

        public void filtrar(Classificacao classificacao){
            if (classificacao.getClssificacao() >= 4){
                System.out.println("Está entre os preferidos do momento!");
            } else if (classificacao.getClssificacao() >= 2) {
                System.out.println("Bem avaliado até o momento!");
            } else {
                System.out.println("Coloque na sua lista para assistir depois.");
            }
        }
    }
