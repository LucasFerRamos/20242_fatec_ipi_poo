public class TesteGenerics {
    public static void main(String[] args) {
        VetorDinamico <Integer> inteiros = new VetorDinamico<Integer>(8);
        inteiros.adicionar(1);

        VetorDinamico<String> strings = new VetorDinamico<String>(8);
        strings.adicionar("OLA");

        var reais = new VetorDinamico<Double>(4);
        reais.adicionar(2.0);
        //reais.adicionar(new Musica("MUSICA1"))
        VetorDinamico<Musica> musicas = new VetorDinamico<>(4);
    }
}
