/*Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double res;
        for (int i = 0; i < n; i++){
            double num = sc.nextDouble();
            double div = sc.nextDouble();
            if (div == 0){
                System.out.println("Divisão impossível");
            }
            else {
                res = num / div;
                System.out.printf("%.1f%n", res);
            }

        }
    }
}