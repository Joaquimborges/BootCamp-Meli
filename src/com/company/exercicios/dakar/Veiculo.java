package com.company.exercicios.dakar;

public class Veiculo {

    private double velocidade;
    private double aceleracao;
    private double anguloDeVirada;
    private String patente;
    private int peso;
    private int rodas;
    private int qtdRodas;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public double getAceleracao() {
        return aceleracao;
    }

    public void setAceleracao(double aceleracao) {
        this.aceleracao = aceleracao;
    }

    public double getAnguloDeVirada() {
        return anguloDeVirada;
    }

    public void setAnguloDeVirada(double anguloDeVirada) {
        this.anguloDeVirada = anguloDeVirada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public Veiculo() {
        super();
    }

    public Veiculo(double velocidade, double aceleracao, double anguloDeVirada) {
        super();
        this.velocidade = velocidade;
        this.aceleracao = aceleracao;
        this.anguloDeVirada = anguloDeVirada;
    }

    public int getQtdRodas(){
        return qtdRodas;
    }
}
