/*Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Defina uma senha:");
       int senha, confSenha;

       senha = sc.nextInt();
       confSenha = sc.nextInt();

       while (senha != confSenha){
           System.out.println("Senha incorreta. Digite novamente:");
           confSenha = sc.nextInt();
       }
        System.out.println("Acesso permitido");
    }
}