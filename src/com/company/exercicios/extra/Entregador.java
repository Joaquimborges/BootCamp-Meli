package com.company.exercicios.extra;

import java.util.Objects;

public class Entregador extends Funcionarios implements Constante{

    private String zona;

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public Entregador() {

    }

    public Entregador(String nome, int antiguidade, double salario, String zona) {
        super(nome, antiguidade, salario);
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "Entregador{" +
                "zona='" + zona + '\'' +
                "} " + super.toString();
    }

    @Override
    public void calculePlus() {
        if (getAntiguidade() > 3 && Objects.equals(getZona(), "zona 3")){
            System.out.println(getNome() + "ganhou uma comissao, salario atual " + (getSalario() + Constante.plus));
        }

    }
}
