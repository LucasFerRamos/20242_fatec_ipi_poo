import javax.swing.JOptionPane;
public class LivroDeNotas{
    String nomeDisciplina;
    public void exibirMensagem(){
        //System.out.println("Bem vindo ao livro de notas");
        JOptionPane.showMessageDialog(
            null,
            String.format("Bem vindo ao livro de notas da disciplina %s", nomeDisciplina)
        );
    
    }

}