package com.company.exercicios;

import java.util.Scanner;

public class TercExercicio {
    public static void main(String[] args) {

        int valorDia = 2;
        int dias = 0;
        int total;
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digita o numero de dias: ");
        dias = scan.nextInt();

        total = valorDia * dias;

        System.out.println("$" + total);


    }
}
