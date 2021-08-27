package com.company.exercicios.praticaPOO5Tarde;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Veiculo{

    private String modelo;
    private String marca;
    private double custo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCusto() {
        return custo;
    }

    public void setCusto(double custo) {
        this.custo = custo;
    }

    public Veiculo() {
    }

    public Veiculo(String modelo, String marca, double custo) {
        this.modelo = modelo;
        this.marca = marca;
        this.custo = custo;
    }


}