package br.com.streaming.modelos;

public class Serie extends Titulo {
    private int totalDeTemporadas;
    private boolean ativa;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie( String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTotalDeTemporadas() {
        return totalDeTemporadas;
    }

    public void setTotalDeTemporadas(int totalDeTemporadas) {
        this.totalDeTemporadas = totalDeTemporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    // Anotação de sobrescrita.
    @Override
    public int getDuracaoEmMinutos(){
        return totalDeTemporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
    @Override
    public String toString() {
        return "Série: " + this.getNomeDaMidia() + " (" + this.getAnoDeLancamento() + ") ";
    }
}

