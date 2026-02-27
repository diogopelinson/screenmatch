import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.setNome("A ilha do Medo");
        meuFilme.setAnoDeLancamento(2010);
        meuFilme.setIncluidoNoPlano(true);
        meuFilme.setDuracaoEmMinutos(120);

        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

        Serie serie = new Serie();

        serie.setNome("The Good Doctor");
        serie.setAnoDeLancamento(2017);
        serie.exibeFichaTecnica();
        serie.setTemporadas(7);
        serie.setEpisodiosPorTemporada(20);
        serie.setMinutosPorEpisodio(50);
        System.out.println("Duração da serie: "+serie.getDuracaoEmMinutos()+" minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar 3");
        outroFilme.setAnoDeLancamento(2026);
        outroFilme.setIncluidoNoPlano(true);
        outroFilme.setDuracaoEmMinutos(185);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.calculaTempoTotal(meuFilme);
        calculadora.calculaTempoTotal(outroFilme);
        calculadora.calculaTempoTotal(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(2);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(2000);
        filtro.filtra(episodio);

        var filmeDiogo = new Filme();
        filmeDiogo.setDuracaoEmMinutos(210);
        filmeDiogo.setNome("Carros 3");
        filmeDiogo.setAnoDeLancamento(2017);
        filmeDiogo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDiogo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: "+listaDeFilmes.size());
        System.out.println("Primeiro Filme: "+listaDeFilmes.get(0).getNome());

        for (int i = 0; i < listaDeFilmes.size(); i++){
            System.out.println("Indice "+ i + ": " + listaDeFilmes.get(i));
        }
        System.out.println("toString do filme: "+listaDeFilmes.get(0).toString());
    }
}
