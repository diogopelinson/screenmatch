package br.com.alura.screenmatch.modelos;

public class Titulo {
    //Atributos
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    //Métodos
    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    public double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    //Setters - Incluir um Valor no Atributo
    public void setNome(String nome) {
        this.nome = nome;
    }

    //Setter
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    //Setter
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    //Setter
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Getter
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //Getter
    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    //Getter
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    //Getter
    public String getNome() {
        return nome;
    }

    //Getter
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
}
