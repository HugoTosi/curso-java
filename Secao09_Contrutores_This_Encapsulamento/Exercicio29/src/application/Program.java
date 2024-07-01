package application;

import entities.Client;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the account number: ");
        int number = sc.nextInt();
        System.out.println("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        Client client = new Client(name, number);
        System.out.println("Is there na initial deposit (y/n)?");
        char initialDeposit = sc.next().charAt(0);

        if (initialDeposit == 'y') {
            System.out.println("Enter initial deposit value: ");
            double initialDepositValue = sc.nextDouble();
            client.deposit(initialDepositValue);
        }

        System.out.println("\n" + client);

        System.out.println("\nEnter a deposit value:");
        double addBalance = sc.nextDouble();
        client.deposit(addBalance);

        System.out.println("\n" + client.updatedToString());

        System.out.println("\nEnter a Withdraw value: ");
        double remBalance = sc.nextDouble();
        client.withdraw(remBalance);

        System.out.println(client.updatedToString());

    }
}
