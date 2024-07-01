/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero). */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int maior = 0, posicao = 0;

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();

        int[] vetor = new int[n + 1];

        for (int i = 1; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i] = sc.nextInt();
            if (vetor[i] > vetor[i - 1]) {
                maior = vetor[i];
                posicao = i - 1;
            }
        }
        System.out.printf("Maior: %d\nPosição: %d", maior, posicao);

    }
}