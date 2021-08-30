package com.company.exercicios.abstractInterface.banco;

public class ClienteBas extends Conta implements Basico {

    private String nome;

    public ClienteBas(String nome) {
        this.nome = nome;
    }

    public ClienteBas(String conta, String agencia, String tipoDeConta, String nome) {
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
    public void consultarSaldo() {

    }

    @Override
    public void pagamentoDeServico() {

    }

    @Override
    public void realizarSaqueDinheiro() {

    }
}
