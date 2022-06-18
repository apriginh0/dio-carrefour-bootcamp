package br.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário
 * Ex: 5! = 120
 * */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o número que deseja o fatorial:");
        int numero = scan.nextInt();
        int fatorial = numero;
        for (int number=numero-1; number>1; number--) {
            System.out.println(number);
            fatorial*=number;
        }
        System.out.println("Fatorial "+numero+"! = "+fatorial);
    }
}
