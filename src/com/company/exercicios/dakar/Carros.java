package com.company.exercicios.dakar;

public class Carros extends Veiculo{

    private static final double pesoCarro = 1000.0;
    private static final int qtdRodas = 4;



    public Carros(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
    }

    public Carros(double velocidade, double aceleracao, double anguloDeVirada) {
        super(velocidade, aceleracao, anguloDeVirada);
    }
}
