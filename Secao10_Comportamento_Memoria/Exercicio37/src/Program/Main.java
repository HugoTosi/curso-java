/*Fazer um programa para ler dois números inteiros M e N, e depois ler
uma matriz de M linhas por N colunas contendo números inteiros,
podendo haver repetições. Em seguida, ler um número inteiro X que
pertence à matriz. Para cada ocorrência de X, mostrar os valores à
esquerda, acima, à direita e abaixo de X, quando houver, conforme exemplo.*/

package Program;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int m, n, x;

        m = sc.nextInt();
        n = sc.nextInt();

        int[][] mat = new int[m][n];

        for (int i = 0; i< mat.length; i++){
            for (int j = 0; j< mat[i].length; j++){
                mat[i][j] = sc.nextInt();
            }
        }
        x = sc.nextInt();

        for (int i = 0; i< mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                if (x == mat[i][j]) {
                    System.out.println("Position " + i + "," + j);

                    if (i > 0){
                        System.out.println("Up:" + mat[i - 1][j]);
                    }
                    if (i < mat.length-1){
                        System.out.println("Down:" + mat[i + 1][j]);
                    }
                    if (j > 0){
                        System.out.println("Left:" + mat[i][j - 1]);
                    }
                    if (j < mat[i].length-1){
                        System.out.println("Right:" + mat[i][j + 1]);
                    }

                }
            }
        }




    }
}
