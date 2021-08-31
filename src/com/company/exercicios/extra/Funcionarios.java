package com.company.exercicios.extra;

public abstract class Funcionarios {

    private String nome;
    private int antiguidade;
    private double salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAntiguidade() {
        return antiguidade;
    }

    public void setAntiguidade(int antiguidade) {
        this.antiguidade = antiguidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionarios() {
    }

    public Funcionarios(String nome, int antiguidade, double salario) {
        this.nome = nome;
        this.antiguidade = antiguidade;
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "nome='" + nome + '\'' +
                ", antiguidade=" + antiguidade +
                ", salario=" + salario +
                '}';
    }

    public abstract void calculePlus();
}
