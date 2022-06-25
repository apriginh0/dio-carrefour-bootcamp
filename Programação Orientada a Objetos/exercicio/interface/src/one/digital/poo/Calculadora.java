package one.digital.poo;

public class Calculadora implements OperacaoMatematica {

    @Override
    public void soma(double operandoX, double operandoY) {
        System.out.println("Soma: " + operandoX + operandoY);
    };

    @Override
    public void subtracao(double operandoX, double operandoY) {
        System.out.println("Subtração: " + (operandoX - operandoY));
    };

    @Override
    public void multiplicacao(double operandoX, double operandoY) {
        System.out.println("Multiplicação: " + operandoX * operandoY);
    };

    @Override
    public void divisao(double operandoX, double operandoY) {
        System.out.println("Divisão: " + operandoX / operandoY);
    };

}
