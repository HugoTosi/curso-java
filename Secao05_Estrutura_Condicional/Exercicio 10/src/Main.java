/*Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ini, fim, teste;
        Scanner sc = new Scanner(System.in);

        ini = sc.nextInt();
        fim = sc.nextInt();

        if (ini < fim) {
            teste = fim - ini;
        }
        else {
            teste = 24 - ini + fim;
        }
        System.out.printf("O jogo durou %d horas (s)", teste);

        sc.close();
    }
}