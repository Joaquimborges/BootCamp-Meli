package com.company.exercicios;

import java.util.Scanner;

public class QuartExercicio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorPremio;
        double imposto1;
        double imposto2;
        double imposto3;

        System.out.println("digita o valor total do seu premio");
        valorPremio = scan.nextDouble();

        imposto1 = (2.45 * valorPremio)/100;
        imposto2 = (15 * valorPremio)/100;
        imposto3 = (3 * valorPremio)/100;

        System.out.println("com uma taxa de 2,45% aplicada, o valor total seria: " + imposto1);
        System.out.println("com uma taxa de 15% aplicada, o valor total seria: " + imposto2);
        System.out.println("com uma taxa de 3% aplicada, o valor total seria: " + imposto3);
    }
}
