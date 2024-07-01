/*Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double media;
        int ncaso = sc.nextInt();
        double r1, r2, r3;

        for (int i = 0; i < ncaso; i++){
            r1 = sc.nextDouble();
            r2 = sc.nextDouble();
            r3 = sc.nextDouble();
            media = ((r1 * 2) + (r2 * 3) + (r3 * 5)) / 10;
            System.out.printf("%.1f", media);
        }
        sc.close();
    }
}