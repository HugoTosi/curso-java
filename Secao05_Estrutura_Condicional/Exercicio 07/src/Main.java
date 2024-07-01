/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        if (Math.abs(x) == x) {
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");

        }
    }
}