import javax.swing.JOptionPane;
public class LivroDeNotas{
    private String nomeDisciplina =null;


    
    //método setter -  cause um efeito colateral, vai receber o valor  // temo tipo de retorno void 
    //efeito shadowing
    public void setNomeDisciplina(String n){
        nomeDisciplina = n;
    }
    public void exibirMensagem(){
        //System.out.println("Bem vindo ao livro de notas");
        JOptionPane.showMessageDialog(
            null,
            String.format("Bem vindo ao livro de notas da disciplina %s", nomeDisciplina)
        );
    
    }

}