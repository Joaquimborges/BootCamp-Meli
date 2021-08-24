package com.company.exercicios.corridaDeLaSelva;

import java.util.HashMap;
import java.util.Map;

public class Corrida {

    HashMap<Integer,Pessoa> pequenoCircuito = new HashMap<>();
    HashMap<Integer,Pessoa> circuitoMedio = new HashMap<>();
    HashMap<Integer,Pessoa> grandeCircuito = new HashMap<>();
    int inscricao = 1;


    public void inscreveMaratonista(String categoria, Pessoa pessoa){
        switch (categoria) {
            case "pequeno" -> {
                pequenoCircuito.put(inscricao++, pessoa);
                if (pessoa.getIdade() <= 18) {
                    pessoa.setValorInscricao(1300.0);
                } else {
                    pessoa.setValorInscricao(1500.0);
                }
            }
            case "medio" -> {
                circuitoMedio.put(inscricao++, pessoa);
                if (pessoa.getIdade() <= 18) {
                    pessoa.setValorInscricao(2000.0);
                } else {
                    pessoa.setValorInscricao(2300.0);
                }
            }
            case "avancado" -> {
                grandeCircuito.put(inscricao++, pessoa);
                if (pessoa.getIdade() >= 18) {
                    pessoa.setValorInscricao(2800.0);
                } else {
                    System.out.println("Voce precisa ter idade acima de 18 para se escrever nesta categoria");
                }
            }
        }

    }

    public void mostraListaPorCategoria(String categoria){
        switch (categoria) {
            case "pequeno" -> {
                System.out.println("***********CATEGORIA PEQUENO CIRCUÍTO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry : pequenoCircuito.entrySet()) {
                    System.out.println(pessoaEntry.getKey() + " - " + pessoaEntry.getValue().toString());
                }
            }
            case "medio" -> {
                System.out.println("***********CATEGORIA CIRCUÍTO MÉDIO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry : circuitoMedio.entrySet()) {
                    System.out.println(pessoaEntry.getKey() + " - " + pessoaEntry.getValue().toString());
                }
            }
            case "avancado" -> {
                System.out.println("***********CATEGORIA CIRCUÍTO AVANÇADO**************");
                for (Map.Entry<Integer, Pessoa> pessoaEntry : grandeCircuito.entrySet()) {
                    System.out.println(pessoaEntry.getKey() + " _ " + pessoaEntry.getValue().toString());
                }
            }
        }
    }


    public void cancelaInscricao(String categoria, int numeroInscricao){
        if ("pequeno".equals(categoria)) {
            pequenoCircuito.remove(numeroInscricao);
        }
        if ("medio".equals(categoria)) {
            circuitoMedio.remove(numeroInscricao);
        }
        if ("avancado".equals(categoria)) {
            grandeCircuito.remove(numeroInscricao);
        }
    }







}
