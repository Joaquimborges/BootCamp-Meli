package com.company.exercicios.saveTheRopa;

import java.util.ArrayList;
import java.util.List;

public class TesteSTR {
    public static void main(String[] args) {

        List<Roupa> roupasEuro = new ArrayList<>();
        List<Roupa> roupasAsi = new ArrayList<>();

        roupasEuro.add(new Roupa("lacost", "t-shert"));
        roupasEuro.add(new Roupa("polo", "camiseta"));

        roupasAsi.add(new Roupa("Umbro", "calça"));
        roupasAsi.add(new Roupa("nike", "calça"));




        GuardaRoupa guardaRoupa = new GuardaRoupa();

        guardaRoupa.guardarRoupas(roupasAsi);
        guardaRoupa.mostrarRoupas();












    }
}
