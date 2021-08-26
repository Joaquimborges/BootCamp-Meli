package com.company.exercicios.dakar;

public class Carros extends Veiculo{

    private String marca;
    private String cor;
    private String modelo;
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

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Carros() {
    }

    public Carros(double velocidade, double aceleracao, double anguloDeVirada, String placa) {
        super(velocidade, aceleracao, anguloDeVirada);
        this.placa = placa;
    }
}
