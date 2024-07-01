/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem
que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem
qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e
mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo.*/

import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double sal, imposto1,imposto2, imposto3, imposto4;
        sal = sc.nextDouble();
        if (sal < 2000){
            System.out.println("Isento");
        }
        else if (sal > 2000 && sal < 3000) {
            imposto1 = (sal - 2000) * 0.08;
            System.out.printf("Imposto: R$%.2f%n", imposto1);
        }
        else if (sal > 3000 && sal < 4500){
            imposto1 = (sal - 3000);
            imposto2 = sal - (2000 + imposto1);
            imposto3 = (imposto1 * 0.18) + (imposto2 * 0.08);
            System.out.printf("Imposto: R$%.2f%n", imposto3);
        }
        else {
            imposto1 = (sal - 4500);
            imposto2 = sal - (3000 + imposto1) ;
            imposto3 = sal - (2000 + imposto1 + imposto2);
            imposto4 = (imposto1 * 0.28) + (imposto2 * 0.18) + (imposto3 * 0.08);
            System.out.printf("Imposto: R$%.2f%n", imposto4);
        }
        sc.close();
    }
}