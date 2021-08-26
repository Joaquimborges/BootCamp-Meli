package com.company.exercicios.praticaPOO5Manha;

public class NonPerishable extends Product {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public NonPerishable() {
    }

    public NonPerishable(String type) {
        this.type = type;
    }

    public NonPerishable(String nome, double preco, String type) {
        super(nome, preco);
        this.type = type;
    }

    @Override
    public String toString() {
        return "NonPerishable{" +
                "type='" + type + '\'' +
                '}';
    }

    public double calcule(int qtdOfProduts) {
        return qtdOfProduts *= this.getPreco();

    }
}
