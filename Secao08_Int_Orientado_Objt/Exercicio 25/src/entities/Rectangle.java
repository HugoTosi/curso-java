package entities;

import java.util.Scanner;

public class Rectangle {
    public double altura;
    public double largura;

    Scanner scRectangle = new Scanner(System.in);
    public double area() {
        return altura * largura;
    }
    public double perimeter() {
        return altura * 2 + largura * 2;
    }
    public double diagonal() {
        return Math.hypot(altura, largura);

    }
    public String toString() {
        return  "Area: " + area() +
                "\nPerímetro: " + String.format("%.2f", perimeter()) +
                "\nDiagonal: " + String.format("%.2f", diagonal());

    }
    public void newRectangle() {
        System.out.println("Digite a ALTURA do retângulo: ");
        altura = scRectangle.nextDouble();
        System.out.println("Digite a LARGURA do retângulo: ");
        largura = scRectangle.nextDouble();
    }
}