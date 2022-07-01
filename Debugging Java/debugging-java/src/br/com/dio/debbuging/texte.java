package br.com.dio.debbuging;
import java.util.Scanner;

public class texte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[]  par = new int[5];
        int[]  impar = new int[5];
        int[]  positivo = new int[5];
        int[]  negativo = new int[5];
        int n = scan.nextInt();

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.2f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }

}
