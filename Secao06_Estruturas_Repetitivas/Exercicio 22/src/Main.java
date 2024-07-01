/*Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fat = 0;
        int n = sc.nextInt();
        if (n == 0 || n == 1){
            System.out.println("1");
        }
        else {
            for(int i = 0; i < n ; i++){
                fat = fat + (n * (n - i));
                System.out.println(fat);
            }
        }
        }
    }