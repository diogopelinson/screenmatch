public class Filme {
    //Atributos
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //Métodos
    void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double retornaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    //Geters
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
}
