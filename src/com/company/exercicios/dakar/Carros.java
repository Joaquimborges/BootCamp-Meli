package com.company.exercicios.dakar;

public class Carros extends Veiculo{

    private String marca;
    private String cor;
    private String modelo;

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

    public Carros(String marca, String cor, String modelo) {
        this.marca = marca;
        this.cor = cor;
        this.modelo = modelo;
    }










}
