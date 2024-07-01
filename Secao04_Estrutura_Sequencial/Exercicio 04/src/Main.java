/* Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
decimais. */

import java.util.Locale;
import  java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);

        System.out.println("Digite o COD do funcionario:");
        int cod = sc.nextInt();
        System.out.println("Digite as Horas trabalhadas:");
        double ht = sc.nextDouble();
        System.out.println("Digite o valor da hora: R$");
        double sal = sc.nextDouble();
        System.out.printf("COD: %d%n", cod);
        System.out.printf("Salário: R$%.2f", sal * ht);

    }
}