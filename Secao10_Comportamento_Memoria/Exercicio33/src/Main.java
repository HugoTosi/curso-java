/*Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares. */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar?");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Digite um número:");
            vetor[i] = sc.nextDouble();
        }
        System.out.println("Números pares:");
        int qntdPares = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.printf("%.0f  ", vetor[i]);
                qntdPares ++;
            }
        }
        System.out.println("\n" + "Quantidade de PARES: " + qntdPares);

        sc.close();

    }
}
