package br.com.streaming.modelos;

public abstract class Titulo implements Comparable<Titulo> {
    private String nome;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;
    private int anoDeLancamento;

    public Titulo( String nomeDoFilme, int anoDeLancamento) {
        this.nome = nomeDoFilme;
        this.anoDeLancamento = anoDeLancamento;
    }

    String getNomeDaMidia(){
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nome = nomeDoFilme;
    }

    void exibirFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("O filme foi lançado em: " + anoDeLancamento);
    }

    public void avaliacao(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    void mediaAvaliacoes(){
        somaDasAvaliacoes /= totalDeAvaliacoes;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    double getMediaAvaliacoes(){
        return somaDasAvaliacoes;
    }
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNomeDaMidia().compareTo(outroTitulo.getNomeDaMidia());
    }
}

