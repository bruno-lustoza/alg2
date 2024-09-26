//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Calculadora calc = new Calculadora(10f, 10f);

        Calculadora.somar(15f, 15f);
        Calculadora.subtrair(10f,5f);
        Calculadora.dividir(10f,2f);
        Calculadora.multiplicar(2f,5f);
    }
}