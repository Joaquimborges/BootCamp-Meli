package com.company.exercicios.dakar;

public class Motos extends Veiculo{

    private String marca;
    private String cor;
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Motos() {
    }

    public Motos(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
        super(velocidade, aceleracao, anguloDeVirada);
        this.placa = placa;
    }
}
