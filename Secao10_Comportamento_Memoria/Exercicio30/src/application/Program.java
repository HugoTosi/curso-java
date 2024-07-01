/*Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos. */

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Quantos numeros voce vai digitar?");
        n = sc.nextInt();
        int i;
        if (n <= 0 || n > 10) {
            System.out.println("Número invalido. Digite novamente:");
            n = sc.nextInt();
        }
        int[] vect = new int[n];

        for (i = 0; i < vect.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos:");

        for (i = 0; i < vect.length; i++) {
            if (vect[i] < 0) {
                System.out.printf("%d\n", vect[i]);
            }
        }
    }
}
