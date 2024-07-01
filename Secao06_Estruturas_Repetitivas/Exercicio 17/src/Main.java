/*Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme
exemplo.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alcool = 0, gasolina = 0, diesel = 0 , fim = 0, pesquisa;

        while (fim == 0){
        pesquisa = sc.nextInt();
        switch (pesquisa){
            case 1:
                alcool += 1;
                break;
            case 2:
                gasolina += 1;
                break;
            case 3:
                diesel +=1;
                break;
            case 4:
                fim += 1;
                break;
            default:
                System.out.println("Codigo Invalido");
        }
        }
        System.out.println("MUITO OBRIGADO!");
        System.out.printf("ALCOOL: %d%nGASOLINA: %d%nDIESEL: %d%n", alcool, gasolina, diesel);

    }
}