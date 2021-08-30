package com.company.exercicios.abstractInterface.banco.animals;

public class Vaca extends Animal implements Herbivoro{

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Muu");
    }

    @Override
    public void comerErva() {

    }
}
