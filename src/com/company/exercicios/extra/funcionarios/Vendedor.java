package com.company.exercicios.extra.funcionarios;

public class Vendedor extends Funcionarios implements Constante{

    private double comissao;

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public Vendedor() {
    }

    public Vendedor(String nome, int antiguidade, double salario, double comissao) {
        super(nome, antiguidade, salario);
        this.comissao = comissao;
    }

    @Override
    public String toString() {
        return "Vendedor{" +
                "comissao=" + comissao +
                "} " + super.toString();
    }

    @Override
    public void calculePlus() {
        if (getAntiguidade() > 5 && getComissao() > 5000){
            System.out.println(getNome() + "ganhou uma comissao, salario atual " + (getSalario() + Constante.plus));
        }

    }


}
