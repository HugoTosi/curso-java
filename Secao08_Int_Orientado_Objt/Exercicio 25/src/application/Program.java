/* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado. */

package application;
import entities.Rectangle;
import java.util.Locale;

public class Program {
    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Rectangle retangulo = new Rectangle();

        retangulo.newRectangle();

        System.out.println(retangulo);

    }
}