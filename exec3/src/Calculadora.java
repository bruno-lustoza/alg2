public class Calculadora {
    private Float num1;
    private Float num2;

    public Calculadora(Float num1, Float num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    static void somar(Float num1, Float num2){
        System.out.println(num1 + num2);
    }

    static void subtrair(Float num1, Float num2){
        System.out.println(num1 - num2);
    }

    static void multiplicar(Float num1, Float num2){
        System.out.println(num1 * num2);
    }

    static void dividir(Float num1, Float num2){
        System.out.println(num1 / num2);
    }

}
