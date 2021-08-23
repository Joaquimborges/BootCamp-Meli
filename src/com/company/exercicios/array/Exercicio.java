package com.company.exercicios.array;

public class Exercicio {
    public static void main(String[] args) {

        int tempMin = 0;
        int tempMax = 0;

        String cidadeMax = "";
        String cidadeMin = "";

        String[] cidades = new String[10];
        cidades[0] = "Londres";
        cidades[1] = "Madrid";
        cidades[2] = "Nova York";
        cidades[3] = "Buenos Aires";
        cidades[4] = "Assuncion";
        cidades[5] = "Sao Paulo";
        cidades[6] = "Lima";
        cidades[7] = "Santiago de chile";
        cidades[8] = "Lisboa";
        cidades[9] = "Tokio";


        int[][] temperatura = new int[10][2];
        temperatura[0][0] = -2;
        temperatura[0][1] = 33;

        temperatura[1][0] = -3;
        temperatura[1][1] = 32;

        temperatura[2][0] = -8;
        temperatura[2][1] = 27;

        temperatura[3][0] = 4;
        temperatura[3][1] = 37;

        temperatura[4][0] = 6;
        temperatura[4][1] = 42;

        temperatura[5][0] = 5;
        temperatura[5][1] = 43;

        temperatura[6][0] = 0;
        temperatura[6][1] = 39;

        temperatura[7][0] = -7;
        temperatura[7][1] = 26;

        temperatura[8][0] = -1;
        temperatura[8][1] = 31;

        temperatura[9][0] = -10;
        temperatura[9][1] = 35;


        for (int l = 0; l < temperatura.length; l++){
            for (int c = 0; c < temperatura[l].length; c++){

                if (tempMin > temperatura[l][c]){
                    tempMin = temperatura[l][c];
                    cidadeMin = cidades[l];
                }

                if (tempMax < temperatura[l][c]) {
                    tempMax = temperatura[l][c];
                    cidadeMax = cidades[l];
                }
            }
        }

        System.out.println("A menor temperatura foi na cidade " + cidadeMin + " com " + tempMin + " C");
        System.out.println("A maior temperatura foi na cidade " + cidadeMax + " com " + tempMax + " C");

    }
}