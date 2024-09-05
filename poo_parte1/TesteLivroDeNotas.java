import javax.swing.JOptionPane;
public class TesteLivroDeNotas{
    static public void main (String...args){
        //construir um livro de notas
       
        var disciplina1 = JOptionPane.showInputDialog("Digite o nome da disciplina");
        var meuLivro = new LivroDeNotas();
        meuLivro.nomeDisciplina = disciplina1;
        //acionar o comportamento sobre ele
        meuLivro.exibirMensagem();

        //construir um segundo livro de notas
        //e fazer com que ele exiba a mensagem

        var meulivro1 = new LivroDeNotas();
        
        var disciplina2 = JOptionPane.showInputDialog("Digite o nome da disciplina 2");
        meulivro1.nomeDisciplina = disciplina2;
        meulivro1.exibirMensagem();




    }
}