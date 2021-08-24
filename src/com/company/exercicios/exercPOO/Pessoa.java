package com.company.exercicios.exercPOO;

public class Pessoa {

    private String nome;
    private int idade;
    private String id;
    private double peso;
    private double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, int idade, String id) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public Pessoa(String nome, int idade, String id, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void mostrarInfo(){
        System.out.println(getNome());
        System.out.println(getIdade());
        System.out.println(getAltura());
        System.out.println(getPeso());
    }

    public void calcularIMC(int peso){
        peso = (int) this.peso;
        double imc = peso / (this.altura * this.altura);

        if (imc < 20) {
            System.out.println("Baixo peso");
        }
        if (imc >= 20 && imc <= 25){
            System.out.println("Peso saudavel");
        }
        if (imc > 25) {
            System.out.println("Sobrepeso");
        }

    }

    public boolean eMaiorDeIdade(int idade){
        idade = this.idade;
        return idade >= 18;
    }

}
