package com.company.exercicios.loop;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String rg;
        double salario;

        System.out.println("Digite o RG: ");
        rg = scan.nextLine();

        System.out.println("Digite o salario: ");
        salario = scan.nextDouble();

        if (salario <= 20000){
            final double v = salario + (20 * salario) / 100;
            System.out.println("Tem direito a 20% de acrescemo " + v);
        }

        if (salario > 20000 && salario <= 45000){
            double v = salario + (10 * salario) / 100;
            System.out.println("Tem direito a 10% de acrescemo " + v);
        }

        if (salario > 45000){
            double c = salario + (5 * salario) / 100;
            System.out.println("Tem direito a 5% de acrescemo " + c);
        }
    }
}
