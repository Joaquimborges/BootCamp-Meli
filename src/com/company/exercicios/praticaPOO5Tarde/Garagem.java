package com.company.exercicios.praticaPOO5Tarde;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Garagem {

    private int identificador;
    private List<Veiculo> listaDeVeiculos;

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public Garagem() {
    }

    public Garagem(int identificador, List<Veiculo> listaDeVeiculos) {
        this.identificador = identificador;
        this.listaDeVeiculos = listaDeVeiculos;
    }

    public Garagem(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }



}
