
import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
     
     //construir um vetor dinamico de tamanho 8
     //use o operadpr de inferencia de tipo
        var vetor = new VetorDinamico(8);
        var gerador = new  Random();
        while (true) {
        var valor = gerador.nextInt(10) + 1;
        vetor.adicionar(valor);
        System.out.println(vetor);
        System.out.println("=================");
        Thread.sleep(5000);
        }

    }
}
