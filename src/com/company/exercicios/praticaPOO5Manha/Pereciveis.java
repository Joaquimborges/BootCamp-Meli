package com.company.exercicios.praticaPOO5Manha;

public class Pereciveis extends Product {

    private int vencimento;

    public int getVencimento() {
        return vencimento;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public Pereciveis(String nome, double preco, int vencimento) {
        super(nome ,preco);
        this.vencimento = vencimento;
    }

    @Override
    public String toString() {
        return "Pereciveis{" +
                "nome='" + super.getNome() + '\'' +
                ", preco=" + super.getPreco() +
                "vencimento=" + vencimento +
                '}';
    }

    public double calcular(int qtdOfProducts){
        double valorAtual = calcule(qtdOfProducts);

        if (vencimento == 1) {
            valorAtual /= 4;
        }
        if (vencimento == 2) {
            valorAtual /= 3;
        }
        if (vencimento == 3) {
            valorAtual /= 2;
        }
        return valorAtual;
    }
}
