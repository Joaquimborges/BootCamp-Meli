package com.company.exercicios.loop;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int fabrica;

        double valorProduto;
        System.out.println("Digite o valor do produto: ");
        valorProduto = scan.nextDouble();

        System.out.println("Digite 1 para escolher a fabrica 1");
        System.out.println("Digite 2 para escolher a fabrica 2");
        System.out.println("Digite 3 para escolher a fabrica 3");
        fabrica = scan.nextInt();

        double frete = (15 * valorProduto)/100;
        double lucro = (25 * valorProduto)/100;

        fabrica = switch (fabrica) {
            case 1 -> (int) ((7 * valorProduto) / 100);
            case 2 -> (int) ((15 * valorProduto) / 100);
            case 3 -> (int) ((22 * valorProduto)/100);
            default -> fabrica;
        };

        double precoFinal = valorProduto + frete + lucro;
        System.out.println("O seu produto vai custar " + precoFinal);
    }
}
