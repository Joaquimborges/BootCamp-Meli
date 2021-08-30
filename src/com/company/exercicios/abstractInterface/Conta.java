package com.company.exercicios.abstractInterface;

public abstract class Conta {
    private String conta;
    private String agencia;
    private String tipoDeConta;
    private double saldo;

    public Conta() {
    }

    public Conta(String conta, String agencia, String tipoDeConta) {
        this.conta = conta;
        this.agencia = agencia;
        this.tipoDeConta = tipoDeConta;
    }


    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getTipoDeConta() {
        return tipoDeConta;
    }

    public void setTipoDeConta(String tipoDeConta) {
        this.tipoDeConta = tipoDeConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    




}
