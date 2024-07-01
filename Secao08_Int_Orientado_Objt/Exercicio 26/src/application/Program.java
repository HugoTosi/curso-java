/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
projetada abaixo.*/

package application;
import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee;
        employee = new Employee();
        System.out.println("Enter the name of Employee: ");
        employee.name = sc.nextLine();
        System.out.println("Enter the Gross Salary of Employee: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Enter the Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.println("Which percentage to increase salary");
        employee.IncreaseSalary(sc.nextDouble());

        System.out.println(employee);


    }
}
