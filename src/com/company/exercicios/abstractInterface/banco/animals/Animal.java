package com.company.exercicios.abstractInterface.banco.animals;

public abstract class Animal {

    public void emitirSom(){

    }

    public void comerAnimal( Animal animal){
        this.emitirSom();
    }

}
