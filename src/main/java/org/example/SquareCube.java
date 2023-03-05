package org.example;

import java.util.Scanner;

public class SquareCube {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);

        System.out.println("Ingrese el número:");
        double number = scan.nextDouble();

        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);

        System.out.println("El cuadrado de "+ number +" es: " + square + "\n" +
                "y el cubo es " + cube );

    }

}
