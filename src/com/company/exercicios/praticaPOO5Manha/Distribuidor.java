package com.company.exercicios.praticaPOO5Manha;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {
    public static void main(String[] args) {

        List<Product> listaprodutos = new ArrayList<>();

        listaprodutos.add(new Product("danone", 3 ));
        listaprodutos.add(new Product("azeite", 16 ));
        listaprodutos.add(new Product("bolacha", 4 ));


        Product produtos = new Product();

        System.out.println(listaprodutos.toString());

    }




}
