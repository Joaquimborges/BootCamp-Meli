package com.company.exercicios.dakar;

public class Corrida {

    private double distancia;
    private double premioEmDolar;
    private String nome;
    private int quantidadeDeVeiculosPermitidos;
    private String[] listaDeVeiculos;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolar() {
        return premioEmDolar;
    }

    public void setPremioEmDolar(double premioEmDolar) {
        this.premioEmDolar = premioEmDolar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeVeiculosPermitidos() {
        return quantidadeDeVeiculosPermitidos;
    }

    public void setQuantidadeDeVeiculosPermitidos(int quantidadeDeVeiculosPermitidos) {
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }

    public String[] getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(String[] listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public Corrida() {
    }

    public Corrida(double distancia, double premioEmDolar, String nome, int quantidadeDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolar = premioEmDolar;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }
}
