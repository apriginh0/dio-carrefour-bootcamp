package metodo;

public class calculadora {
    public static void somar(double number1, double number2) {
        double result = number1 + number2;
        System.out.println("A soma entre "+number1+" e "+number2+" é igual a: "+result);
    }
    public static void subtrair(double number1, double number2) {
        double result = number1 - number2;
        System.out.println("A subtração entre "+number1+" e "+number2+" é igual a: "+result);
    }
    public static void multiplicar(double number1, double number2) {
        double result = number1 * number2;
        System.out.println("A multiplicação entre "+number1+" e "+number2+" é igual a: "+result);
    }
    public static void dividir(double number1, double number2) {
        double result = number1 / number2;
        System.out.println("A divisão entre "+number1+" e "+number2+" é igual a: "+result);
    }
    public static void modulo(double number1, double number2) {
        double result = number1 % number2;
        System.out.println("O modulo entre "+number1+" e "+number2+" é igual a: "+result);
    }
}
