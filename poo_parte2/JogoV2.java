import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        System.out.println("Começando...");
        var cacador = new Personagem();
        cacador.nome = "Lucas";
        var soneca = new Personagem(2,4,10);
        soneca.nome = "Ursinho Pooh";
        var fominha = new Personagem(6,10,2);
        fominha.nome = "Scooby";
        var gerador = new Random();
        while (true) {
            var acaoDoCacador = gerador.nextInt(3)+1;
            switch(acaoDoCacador){
                case 1:
                    cacador.cacar();
                    break;
                case 2:
                    cacador.comer();
                    break;
                case 3:
                    cacador.dormir();
                    break;
            }
            System.out.println(cacador);
            System.out.println("----------------------------------");
            var acaoDoSoneca = gerador.nextInt(3)+1;
            switch (acaoDoSoneca) {
                case 1:
                    soneca.cacar();
                    break;
                case 2:
                    soneca.comer();
                    break;
                case 3:
                    soneca.dormir();
                    break;    
            } 
            System.out.println(soneca);
            System.out.println("----------------------------------");
            switch (gerador.nextInt(3)+1) {
                case 1:
                    fominha.cacar();
                    break;

                case 2:
                    fominha.comer();
                    break;
                default:
                    fominha.dormir();
                    break;
            }
            //chamada implicita do toString 
            System.out.println(fominha);
            System.out.println("================================");

            Thread.sleep(5000);
        }
        
    }
}
