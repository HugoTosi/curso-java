/*Uma empresa possui funcionários próprios e terceirizados.
Para cada funcionário, deseja-se registrar nome, horas
trabalhadas e valor por hora. Funcionários terceirizado
possuem ainda uma despesa adicional.
O pagamento dos funcionários corresponde ao valor da hora
multiplicado pelas horas trabalhadas, sendo que os
funcionários terceirizados ainda recebem um bônus
correspondente a 110% de sua despesa adicional.
Fazer um programa para ler os dados de N funcionários (N
fornecido pelo usuário) e armazená-los em uma lista. Depois
de ler todos os dados, mostrar nome e pagamento de cada
funcionário na mesma ordem em que foram digitados.*/

package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        char yn;
        OutsourcedEmployee empOut = new OutsourcedEmployee();
        Employee emp = new Employee();

        System.out.println("Enter the number of employees");
        n = sc.nextInt();

        List<Employee> employees = new ArrayList<>(n);

        for (int i = 0; i < n; i++){
            System.out.println("Outsourced (y/n)?");
            yn = sc.next().charAt(0);

            if (yn == 'y'){
                employees.add(empOut.createOutsourcedEmployee());
            }
            else {
                employees.add(emp.createEmployee());
            }

        }
        for (Employee employee : employees){
            System.out.println(employee.toString());
        }
        
    }
}
