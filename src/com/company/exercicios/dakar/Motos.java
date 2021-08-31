package com.company.exercicios.dakar;

public class Motos extends Veiculo{

    private static final double pesoMoto = 300.0;
    private static final int qtdRodas = 2;



    public Motos(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
    }

    public Motos(double velocidade, double aceleracao, double anguloDeVirada) {
        super(velocidade, aceleracao, anguloDeVirada);
    }

    @Override
    public String toString() {
        return "Motos{} " + super.toString();
    }
}
