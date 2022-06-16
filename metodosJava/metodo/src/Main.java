import metodo.Mensagem;
import metodo.calculadora;
import metodo.emprestimo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Calculadora");
        calculadora.somar(120, 80);
        calculadora.subtrair(160, 80);
        calculadora.multiplicar(9, 11);
        calculadora.dividir(999, 111);
        calculadora.modulo(10, 3);
        System.out.println("--------");

        System.out.println("Mensagem");
        System.out.println(Mensagem.date());
        System.out.println("--------");

        // Empréstimo
        System.out.println("Exercício empréstimo");
        emprestimo.calcular(1000, emprestimo.getDuasParcelas());
        emprestimo.calcular(1000, emprestimo.getTresParcelas());
        emprestimo.calcular(1000, 5);

    }
}