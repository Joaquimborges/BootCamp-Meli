package com.company.exercicios.corridaDeLaSelva;

import java.util.ArrayList;
import java.util.List;

public class Maratona {
    public static void main(String[] args) {

        List<Pessoa> candidatos = new ArrayList<>();

        candidatos.add(new Pessoa("635282", "Pedro","Sousa","119883073", 22));
        candidatos.add(new Pessoa("746384", "Paulo","Sousa","119883073", 17));
        candidatos.add(new Pessoa("7937874", "Andre","Sousa","119883073", 32));

        Corrida maratona = new Corrida();

        maratona.inscreveMaratonista("pequeno", candidatos.get(0));
        maratona.inscreveMaratonista("medio", candidatos.get(1));
        maratona.inscreveMaratonista("avancado", candidatos.get(2));


        maratona.mostraListaPorCategoria("pequeno");
        maratona.mostraListaPorCategoria("medio");
        maratona.mostraListaPorCategoria("avancado");
    }
}
