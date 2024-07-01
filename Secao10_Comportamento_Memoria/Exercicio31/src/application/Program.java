/*Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double soma = 0, media = 0;
        System.out.println("Digite a quantidade de números:");
        int n = sc.nextInt();

        double[] vect = new double[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o " + (i + 1) + " valor");
            vect[i] = sc.nextDouble();
        }

        System.out.print("Valores: ");
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i];
            media = soma / n;
            System.out.printf("%.0f   ", vect[i]);
        }
        System.out.printf("\nSoma: %.2f\nMédia: %.2f", soma, media);




    }
}
