package com.company.exercicios.praticaPOO5Manha;

import java.util.ArrayList;
import java.util.List;

public class Distribuidor {
    public static void main(String[] args) {

        List<Product> listaprodutos = new ArrayList<>();

        listaprodutos.add(new Pereciveis("danone", 3, 2));
        listaprodutos.add(new Pereciveis("ovos", 12, 2));
        listaprodutos.add(new Pereciveis("bolacha", 4, 1));

        listaprodutos.add(new NonPerishable("arroz"));
        listaprodutos.add(new NonPerishable("feijao"));

        double totalper = 0.0;


        for (Product p : listaprodutos){
            if (p instanceof Pereciveis) {
                totalper += p.calcule(3);
            }
        }

        System.out.println(totalper);



    }




}
