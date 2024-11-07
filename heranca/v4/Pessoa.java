package heranca.v4;

public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome, int idade){
        System.out.println("Construindo uma pessoa...");
        this.nome = nome;
        this.idade = idade;
    }
    public String getNome() {
        return nome;
    }
}
