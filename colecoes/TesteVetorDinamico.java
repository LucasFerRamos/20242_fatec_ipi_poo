
import java.util.Random;

public class TesteVetorDinamico {
    public static void main(String[] args) throws Exception {
     
     //construir um vetor dinamico de tamanho 8
     //use o operadpr de inferencia de tipo
        var vetor = new VetorDinamico(8);
        var gerador = new  Random();
        while (true) {
        var valor = gerador.nextInt(10) + 1;
        var sorteio = gerador.nextDouble();
        if (sorteio <= 0.4){
            System.out.println("Removendo...");
            vetor.remover();
        }else{
            System.out.println("Adicionando....");
            vetor.adicionar(valor);
        }
        System.out.println(vetor);
        System.out.println("=================");
        Thread.sleep(2000);
        }

    }

}
