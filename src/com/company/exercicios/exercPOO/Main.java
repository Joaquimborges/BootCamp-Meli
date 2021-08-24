package com.company.exercicios.exercPOO;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setId("1233");
        pessoa1.setNome("Pedro");
        pessoa1.setAltura(1.60);
        pessoa1.setPeso(57);

        pessoa1.mostrarInfo();


        Pessoa pessoa2 = new Pessoa("Joao", 23, "1234");

        Pessoa pessoa3 = new Pessoa("Alex", 22, "234", 45, 1.60);

        pessoa3.calcularIMC(58);
    }
}
