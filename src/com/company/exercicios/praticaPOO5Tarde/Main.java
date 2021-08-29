package com.company.exercicios.praticaPOO5Tarde;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Veiculo("Fiesta", "Ford", 1000.0));
        veiculos.add(new Veiculo("Focus", "Ford", 1200.0));
        veiculos.add(new Veiculo("Explorer", "Ford", 2500.0));
        veiculos.add(new Veiculo("Uno", "Fiat", 500.0));
        veiculos.add(new Veiculo("Cronos", "Fiat", 1000.0));
        veiculos.add(new Veiculo("Torino", "Fiat", 1250.0));
        veiculos.add(new Veiculo("Aveo", "Chevrolet", 1250.0));
        veiculos.add(new Veiculo("Spin", "Chevrolet", 2500.0));
        veiculos.add(new Veiculo("Corola", "Toyota", 1200.0));
        veiculos.add(new Veiculo("Fortuner", "Toyota", 3000.0));
        veiculos.add(new Veiculo("Logan", "Renault", 950.0));


        Garagem garagem = new Garagem(veiculos);


       veiculos.stream().mapToInt((p) -> (int) p.getCusto()).sorted()
                .forEach(System.out::println);



        List<Veiculo> veiculosPrecoBaixo = veiculos.stream().filter(x -> x.getCusto() <1000.0).collect(Collectors.toList());
        System.out.println(veiculosPrecoBaixo);

        veiculos.stream().sorted(Comparator.comparing(Veiculo ::getMarca).thenComparing(Veiculo ::getCusto)).forEach(System.out::println);



    }
}
