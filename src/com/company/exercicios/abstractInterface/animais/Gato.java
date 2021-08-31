package com.company.exercicios.abstractInterface.animais;

public class Gato extends Animal implements Carnivoro{


    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miua");
    }

    @Override
    public void comercarne() {
        System.out.println("Comendo");
    }
}
