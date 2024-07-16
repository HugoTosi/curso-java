/*A dona de um pensionato possui dez quartos para alugar para estudantes,
sendo esses quartos identificados pelos números 0 a 9.
Fazer um programa que inicie com todos os dez quartos vazios, e depois
leia uma quantidade N representando o número de estudantes que vão
alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
N estudantes. Para cada registro de aluguel, informar o nome e email do
estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
um relatório de todas ocupações do pensionato, por ordem de quarto,
conforme exemplo.*/


package Application;

import Entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Verifica o numero de quartos conforme valor informado
        Student[] students = new Student[10];
        int n = 0;
        do {
            System.out.println("How many rooms will be rented?");
            n = sc.nextInt();
            if (n > 10){
                System.out.println("Error\nEnter a number between 1 - 10");
            }
        } while (n > 10);


        sc.nextLine();

        //Laco de repeticao para alocar no vetor o quarto correspondente junto aos dados do estudante
        for (int i = 0; i < n; i++){

            System.out.println("Rent #" + (i + 1));

            System.out.print("Name:");

            String tempName = sc.nextLine();

            System.out.print("E-mail:");

            String tempEmail = sc.next();

            System.out.print("Room:");

            int tempRoom = sc.nextInt();

            students[tempRoom] = new Student();
            students[tempRoom].setName(tempName);
            students[tempRoom].setEmail(tempEmail);
            students[tempRoom].setRoom(tempRoom);
            sc.nextLine();
        }

        // Mostra os quartos reservados em ordem crescente e os dados do estudante
        System.out.println("Busy rooms:");

        for (int i = 0; i < students.length; i ++){

            if (students[i] != null){
                System.out.println(students[i].toString());

            }
        }


    }
}