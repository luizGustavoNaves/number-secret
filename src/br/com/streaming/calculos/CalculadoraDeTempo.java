package br.com.streaming.calculos;

import br.com.streaming.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }
    // substituição pelo método inclui() da superclasse Titulo pois Série e Filme herdam de Titulo
//    public  void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//    public void inclui(Serie s){
//        this.tempoTotal += s.getDuracaoEmMinutos();
//    }
    public void inclui (Titulo t){
        this.tempoTotal += t.getDuracaoEmMinutos();
    }
}
