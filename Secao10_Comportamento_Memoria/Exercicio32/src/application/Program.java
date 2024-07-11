/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package application;

import entities.Individual;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        double soma = 0, media = 0;

        System.out.println("Quantas pessoas serão digitadas?");
        int n = sc.nextInt();
        Individual[] vect = new Individual[n];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i + 1) + "ª pessoa:\n");
            vect[i] = new Individual();
            sc.nextLine();
            System.out.print("Nome:");
            vect[i].setNome(sc.nextLine());
            System.out.print("Idade:");
            vect[i].setIdade(sc.nextInt());
            System.out.print("Altura:");
            vect[i].setAltura(sc.nextDouble());

            if (vect[i].getIdade() > 16) {
                contador += 1;
            }
        }

        Individual[] qtdMenores = new Individual[contador];
        contador = 0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getAltura();

            if (vect[i].getIdade() < 16) {
                qtdMenores[contador++] = vect[i];
            }

        }
        media = soma / vect.length;
        double porcentagem = (double) qtdMenores.length * 100 / vect.length;

        System.out.printf("\nAltura média: %.2f", media);
        System.out.printf("\nPessoas com menos de 16 anos: %.0f%%\n", porcentagem);


        if (contador > 0) {

            for (int i = 0; i < qtdMenores.length; i++) {
                System.out.println(qtdMenores[i].toString());
            }
        } else {
            System.out.println("Não existem menores de 16 anos no grupo informado.");
        }


    }
}
