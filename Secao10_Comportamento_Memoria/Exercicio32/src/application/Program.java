/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver. */

package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double mediaAltura = 0, porcentagem = 0, sub = 0;

        System.out.println("Quantas pessoas serao digitadas?");
        n = sc.nextInt();
        Person[] vetor = new Person[n];

        for (int i = 0; i < vetor.length; i++) {
            sc.nextLine();
            System.out.println("Digite os dados da " + (i + 1) +"a pessoa:");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new Person(nome, idade, altura);
        }
        for (int i = 0; i < vetor.length; i++) {
            mediaAltura += vetor[i].getHeight() / n;

        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getAge() < 16) {
                sub += 1;
                porcentagem = sub * 100 / n;


            }
        }
        System.out.println("Altura média:" + mediaAltura);
        System.out.println("Pessoas com menos de 16 anos: " + porcentagem + "%");

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getAge() < 16) {
                System.out.println(vetor[i].getName());
            }

    }
}
}
