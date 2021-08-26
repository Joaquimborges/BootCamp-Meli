package com.company.exercicios.dakar;

import java.util.List;
import java.util.Objects;


public class Corrida {

    private double distancia, premioEmDolar;
    private String nome;
    private int quantidadeDeVeiculosPermitidos;

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    private List<Veiculo> listaDeVeiculos;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolar() {
        return premioEmDolar;
    }

    public void setPremioEmDolar(double premioEmDolar) {
        this.premioEmDolar = premioEmDolar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeVeiculosPermitidos() {
        return quantidadeDeVeiculosPermitidos;
    }

    public void setQuantidadeDeVeiculosPermitidos(int quantidadeDeVeiculosPermitidos) {
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }


    public Corrida() {
    }

    public Corrida(double distancia, double premioEmDolar, String nome, int quantidadeDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolar = premioEmDolar;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }


    public void adicionarCarro(double velocidade, double aceleracao, double anguloDeVirada, String placa){
        Veiculo carro = new Carros(velocidade, aceleracao, anguloDeVirada, placa); //instanciar o objeto a partir da classe super
        if (listaDeVeiculos.size() < 6){
            listaDeVeiculos.add(carro);
        } else {
            System.out.println("Não existe mais espaço para novos carros");
        }

    }

    public void adicionarMoto(double velocidade, double aceleracao, double anguloDeVirada, String placa){
        Veiculo moto = new Motos(velocidade, aceleracao, anguloDeVirada, placa);
        if (listaDeVeiculos.size() < 6) {
            listaDeVeiculos.add(moto);
        } else {
            System.out.println("Não existe mais espaço para novos carros");
        }
    }

    public void removerVeiculo(Veiculo veiculo){
        for (int v = 0; v < listaDeVeiculos.size(); v++) { //percorrer a lista para identificar o veiculo
            listaDeVeiculos.remove(veiculo);
        }

    }

    public void removerVeiculoComPlaca(String placa){
        for (int p = 0; p < listaDeVeiculos.size(); p++) { //percorrer para identificar o veiculo
            if (Objects.equals(listaDeVeiculos.get(p).getPatente(), placa)) { // verificar se existe a placa
                listaDeVeiculos.remove(listaDeVeiculos.get(p)); // remover a placa encontrada
            }
        }
    }






}
