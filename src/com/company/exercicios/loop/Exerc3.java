package com.company.exercicios.loop;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int segurancaComCamera = 1500;
        int servicoPatrulha = 700;
        int servico;

        System.out.println("Digite o servico: ");
        servico = scan.nextInt();

        if (servico == 1){
            System.out.println("O valor total dos 7 seria de: " + segurancaComCamera * 7);
        }

        if (servico == 2){
            System.out.println("O valor total dos 7 seria de: " + (servicoPatrulha * 2) * 7);
        }
    }
}
