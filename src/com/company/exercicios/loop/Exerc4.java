package com.company.exercicios.loop;

import java.util.Objects;
import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String[] jornal = new String[50];

        for (int i =0; i < jornal.length; i++){
            System.out.println("entre com o jornal na posicao " + i);
            jornal[i] = scan.nextLine();
        }

        int diarioA = 0;
        int diarioB = 0;
        int diarioC = 0;
        for (String s : jornal) {
            if (Objects.equals(s, "a")) {
                diarioA++;
            }
            if (Objects.equals(s, "b")){
                diarioB++;
            }
            if (Objects.equals(s, "c")){
                diarioC++;
            }
        }

        System.out.println("sao " + diarioA + " assinantes do jornal A");
        System.out.println("sao " + diarioB + " assinantes do jornal B");
        System.out.println("sao " + diarioC + " assinantes do jornal C");
    }
}
