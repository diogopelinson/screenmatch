package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void calculaTempoTotal(Filme filme){
//        this.tempoTotal += filme.getDuracaoEmMinutos();
//    }
//
//    public void calculaTempoTotal(Serie serie){
//        this.tempoTotal += serie.getDuracaoEmMinutos();
//    }


    public void calculaTempoTotal(Titulo titulo){
        System.out.println("Adicionando duração em minutos de" + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}