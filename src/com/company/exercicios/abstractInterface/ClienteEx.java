package com.company.exercicios.abstractInterface;


public class ClienteEx extends Conta implements Executivos {
    private String nome;

    public ClienteEx(String nome) {
        this.nome = nome;
    }

    public ClienteEx(String conta, String agencia, String tipoDeConta, String nome) {
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
    public void fazerTransferencia() {

    }

    @Override
    public void fazerDeposito() {

    }
}
