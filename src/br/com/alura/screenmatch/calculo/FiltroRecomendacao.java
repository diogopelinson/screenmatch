package br.com.alura.screenmatch.calculo;


public class FiltroRecomendacao {

    public void filtra(Classifcavel classifcavel){
        if (classifcavel.getClassificacao() >= 4){
            System.out.println("Está entre os preferidos do momento!");
        } else if(classifcavel.getClassificacao() >= 2){
            System.out.println("Muito bem avaliado no momento!");
        }else {
            System.out.println("Coloque na sua lista pra assistir depois!");
        }
    }


}
