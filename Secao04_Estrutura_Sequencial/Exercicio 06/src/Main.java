/* Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
mostre:
a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B. */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // Area triangulo retangulo (TR)

        double areaTR = A * C / 2;

        // Area circulo (C)

        double pi = 3.14159;
        double areaC = pi * (Math.pow(C, 2));

        // Area trapezio (TZ)

        double areaTZ = (A + B) * C / 2;

        // Area Quadrado (QD)

        double areaQD = B * B;

        // Area Retangulo(RT)

        double areaRT = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTR);
        System.out.printf("CIRCULO: %.3f%n", areaC);
        System.out.printf("TRAPEZIO: %.3f%n", areaTZ);
        System.out.printf("QUADRADO: %.3f%n", areaQD);
        System.out.printf("RETANGULO: %.3f%n", areaRT);

        sc.close();

    }
}