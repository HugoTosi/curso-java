/*Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
N funcionários. Não deve haver repetição de id.
Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
conforme exemplos.
Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
aumento por porcentagem dada.*/

package application;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        boolean incresed = false;

        //Registra quantos funcionarios serao incluidos
        System.out.println("How many employees will be registered?");
        int n = sc.nextInt();

        sc.nextLine();

        List<Employee> employees = new ArrayList<>();

        //Laco de repeticao para criacao de funcionarios
        for (int i = 0; i < n; i++){
            System.out.println("Employee #" + (i + 1));
            System.out.print("ID: ");
            long tempID = sc.nextLong();
            sc.nextLine();
            System.out.print("Name: ");
            String tempName = sc.nextLine();
            System.out.print("Salary:");
            double tempSalary = sc.nextDouble();

            Employee employee = new Employee(tempID, tempName, tempSalary);

            employees.add(employee);

        }
        //Entrada do ID e porcentagem para aumento de salario
        System.out.println("Enter the employee ID that will have salary increase:");
        long idIncrease = sc.nextLong();
        System.out.println("Enter the percentage:");
        double increase = sc.nextDouble();

        //Verfica se o ID inserido existe na lista de funcionarios
        for (Employee emp : employees){
            if (idIncrease == emp.getId()){
                emp.increaseSalary(increase);
                incresed = true;
            }
        }
        if (!incresed){
            System.out.println("This id does not exist");
        }



        //Mosta a lista de funcionarios, com o salario atualizado do funcionario selecionado
        for (Employee x : employees){
            System.out.println(x);
        }





    }


}
