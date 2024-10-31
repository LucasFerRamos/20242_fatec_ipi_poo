package  sobrecarga_de_metodos;
public class TesteCalculadora {
    public static void main(String[] args) {
        var calc = new Calculadora();
        System.out.println(calc.somar(2, 3));
        System.out.println(calc.somar(5.5, 3.5));
        System.out.println(calc.somar(5, "5"));
        System.out.println(calc.somar("5", 6));
    }
}
