import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;
public class MyMP3 {
    public static void main(String[] args) {
        var musicas= new ArrayList<Musica>();
        //1 - Cadastrar
        //2 - Visualizar a lista de Musicas
        //3 - Remover
        //0 - Sair
        int op;
        var menu = "1- Cadastrar Musica\n 2 - Listar músicas\n 3 - Remover Muisca\n 0 - Sair";

        do {    
           op = parseInt(showInputDialog(menu));
           switch (op){
               case 1:{
                var titulo = showInputDialog("Titulo?") ;
                var musica = new Musica(titulo);
                musicas.add(musica);
                showMessageDialog(null, "Música Adicionada");
                break;
               }
                   
                case 2:{
                     if(!musicas.isEmpty()){
                        var sb = new StringBuilder("");
                        
                        for(var m : musicas){
                        sb.append(m.getTitulo()).append("\n");
                        }
                        showMessageDialog(null, sb.toString());
                    }
                    break;
                }
                   
                case 3:{
                    for(var m:musicas){ 
                        var titulo = showInputDialog("Titulo?");
                        musicas.remove(new Musica(titulo));
                            
                    }
                    break;
                }
                    
                    
                case 0:{
                    showMessageDialog(null, "Até mais");  
                    break;
                }
                   
                default:{
                    System.out.println("Numero Inválido");  
                }
                  
           }
            
        } while (op != 0);
    }
}