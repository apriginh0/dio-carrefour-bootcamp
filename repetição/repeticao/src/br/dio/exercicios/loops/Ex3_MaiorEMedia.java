package br.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que leia 5 números
 * informe o maior número
 * e a média desses números
 * */
public class Ex3_MaiorEMedia {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int[] numero = new int[5];
        int i;
        int maior = 0;
        int media = 0;

        for (i=0;i<numero.length; i++) {
            System.out.println("Digite um número:");
            numero[i] = scan.nextInt();
            if (numero[i] > maior) maior = numero[i];
            media+=numero[i];
        }
        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + media/numero.length);

    }
}
