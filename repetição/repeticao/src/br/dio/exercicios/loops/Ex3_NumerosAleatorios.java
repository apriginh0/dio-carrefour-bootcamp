package br.dio.exercicios.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * Faça um programa que leia 20 números inteiros aleatórios (entre 0 e 100), armazenando-os num vetor
 * Ao final mostre os números e seu sucessores
 * */

public class Ex3_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i=0; i<numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero+1 + " ");
        }
    }
}
