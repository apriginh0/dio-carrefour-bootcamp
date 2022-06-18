package br.dio.exercicios.loops;

import java.util.Scanner;

/**
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade números pares
 * e a quantidade de números impares
 * */
public class Ex4_ParEImpar {
    public static void main(String[] arg) {
        Scanner scan = new Scanner(System.in);

        int[] numero = new int[10];
        int par = 0, impar = 0;

        System.out.println("Digita algum número inteiro");
        for (int i=0; i<numero.length; i++) {
            System.out.println("Número:");
            numero[i] = scan.nextInt();
            if (numero[i]%2==0) {
                par++;
            } else impar++;
        }
        System.out.println("Número de pares é: "+par);
        System.out.println("Números de impares é: "+impar);

    }
}
