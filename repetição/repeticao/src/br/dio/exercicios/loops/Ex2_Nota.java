package br.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça uma nota, entre 0 e 10
 * Mostre uma mensagem caso o valor seja inválido e continue
 * pedindo até que o usuário informe um valor válido
 */

public class Ex2_Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Escreva uma nota, de 0 a 10.");

        do {
            System.out.println("Nota: ");
            nota = scan.nextInt();
            System.out.println("Tente novamente");

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota: " + nota);
            }
        } while (nota < 0 || nota > 10);

    }
}
