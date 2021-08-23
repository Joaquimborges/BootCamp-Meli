package com.company.exercicios;

import java.util.Scanner;

public class QuartExercicio {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double valorPremio;
        double valorTotal;
        double imposto1;
        double imposto2;
        double imposto3;

        System.out.println("digita o valor total do seu premio");
        valorPremio = scan.nextDouble();

        imposto1 = (2.45 * valorPremio)/100;
        imposto2 = (15 * valorPremio)/100;
        imposto3 = (3 * valorPremio)/100;
        valorTotal = imposto1 - imposto2 - imposto3;


        System.out.println("O valor total seria: " + valorTotal);
    }
}
