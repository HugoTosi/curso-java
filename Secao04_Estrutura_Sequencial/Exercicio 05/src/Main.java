/* Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int codA, qntdA, codB, qntdB;
        double precoA, precoB, totalA, totalB;

       codA = sc.nextInt();
       qntdA = sc.nextInt();
       precoA = sc.nextDouble();
       totalA = qntdA * precoA;
       codB = sc.nextInt();
       qntdB = sc.nextInt();
       precoB = sc.nextDouble();
       totalB = qntdB * precoB;

        System.out.printf("Total a pagar: R$%.2f", totalA + totalB);

        sc.close();
    }
}