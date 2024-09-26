import java.util.Random;
public class ExemploVetores {
    public static void main(String[] args) {
        int notas [] = new int[4];
        //preenecher o vetor com valores de interesse
       //notas[0] = 10; 
       //notas[1] = 7; 
       //notas[2] = 7;
       //notas[3] = 9;
       
       //notas = new int[] {10,7, 7, 9};
       var gerador = new  Random();
       
       
       for(int i = 0; i < notas.length; i++){
        notas[i] = gerador.nextInt(11);
        
       }
       //for each 5++;
       for(var nota : notas){
        System.out.println(nota);
       }
       //exibir os valores nele existentes
        // System.out.println(notas[0]);
        // System.out.println(notas[1]);
        // System.out.println(notas[2]);
        // System.out.println(notas[3]);
        //fazer os somatorio dos elementos
        int soma = 0;
        for(var nota : notas){
        soma += nota;
        }
        System.out.println(soma);
        //calcular média
        System.out.println(notas.length == 0 ? "Sem notas": soma / notas.length);
        
    }

    
}