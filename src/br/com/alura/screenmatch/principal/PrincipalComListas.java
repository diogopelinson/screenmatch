package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("A ilha do medo", 2010);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar 3", 2026);
        outroFilme.avalia(10);
        var filmeDiogo = new Filme("Monstros S.A", 2017);
        filmeDiogo.avalia(12);
        Serie serie = new Serie("The Good Doctor", 2017);

        Filme f1 = filmeDiogo;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDiogo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificacao " + filme.getClassificacao());
            }

        }


    }
}
