public class Main {
    public static void main(String[] args){
        Filme meuFilme = new Filme();
        meuFilme.nome = "A ilha do Medo";
        meuFilme.anoDeLancamento = 2010;
        meuFilme.incluidoNoPlano = true;
        meuFilme.duracaoEmMinutos = 120;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.retornaMedia());

    }
}
