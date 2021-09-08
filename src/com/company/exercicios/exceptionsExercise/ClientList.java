package com.company.exercicios.exceptionsExercise;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ClientList {

    public static void main(String[] args) {
        String nome;
        int idade = 0;

        Scanner scan = new Scanner(System.in);
        ArrayList<Cliente> clientes = new ArrayList<>();

        System.out.println("Entre com o seu nome: ");
        nome = scan.next();
        try {
            System.out.println("Entre com a idade: ");
            idade = scan.nextInt();
            if (idade < 18) {
                throw new Exception("adicionando cliente menor de idade");
            }
        } catch (InputMismatchException e) {
            System.out.println("precisa ser numero.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

             {
                 clientes.add(new Cliente(nome, idade));
            }

        }












    }
}
