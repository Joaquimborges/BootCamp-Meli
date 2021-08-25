package com.company.exercicios.saveTheRopa;

import java.util.HashMap;
import java.util.List;

public class GuardaRoupa {

    HashMap<Integer, List<Roupa>> dicRoupas = new HashMap<>();
    private int identificador = 1;

    //colocar a lista de roupa no dicionario
    public Integer guardarRoupas(List<Roupa> lista){
        dicRoupas.put(identificador++, lista); //adicionar a lista juntamente com identificador
        return identificador;
    }

    public List<Roupa> devolver(int codigo){
        List<Roupa> listaRoupas = dicRoupas.get(codigo); //pegar a peça e adicionar na variavel
        dicRoupas.remove(codigo); // remover a peça
        return listaRoupas;
    }

    public void mostrarRoupas(){
        for (Integer codigo: dicRoupas.keySet()) { //percorrer o dicionario e pegar as chaves
            List<Roupa> listaRoupas = dicRoupas.get(codigo); // adicionar as chaves na lista
            for (Roupa roupa: listaRoupas) { // percorrer a lista com as chaves
                System.out.println(roupa.toString()); // imprimir organizadamente
            }
        }
    }










}
