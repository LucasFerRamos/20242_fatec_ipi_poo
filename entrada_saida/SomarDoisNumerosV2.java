import javax.swing.JOptionPane;
public class SomarDoisNumerosV2{
    static public void main(String args[]){
    //declaração de variáveis
        double a, b, resultado;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro valor"));
        //processamento
        resultado = a + b;
        //saída
        JOptionPane.showMessageDialog(
            null,
            String.format("%.2f + %.2f = %.2f ", a, b, resultado)
        );
    }
}