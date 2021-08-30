package com.company.exercicios.abstractInterface;

public class ClienteCol extends Conta implements Coletores {

    private String nome;

    public ClienteCol(String nome) {
        this.nome = nome;
    }

    public ClienteCol(String conta, String agencia, String tipoDeConta, String nome) {
        super(conta, agencia, tipoDeConta);
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void realizarSaqueDinheiro() {

    }

    @Override
    public void verificarSaldo() {

    }
}
