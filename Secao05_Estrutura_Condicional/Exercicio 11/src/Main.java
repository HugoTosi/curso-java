/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.*/

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int cod = sc.nextInt();
        int qntd = sc.nextInt();
        double total = 0;

        if (cod == 1) {
            total = qntd * 4;
        }
        else if (cod == 2) {
            total = qntd * 4.5;
        }
        else if (cod == 3) {
            total = qntd * 5;
        }
        else if (cod == 4) {
            total = qntd * 2;
        }
        else if (cod == 5){
            total = qntd * 1.5;
        }
        System.out.printf("TOTAL: R$%.2f", total);

        sc.close();
    }
}