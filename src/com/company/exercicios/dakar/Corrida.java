package com.company.exercicios.dakar;

import java.util.List;
import java.util.Objects;


public class Corrida {

    private double distancia, premioEmDolar;
    private String nome;
    private int quantidadeDeVeiculosPermitidos;

    private SocorristaCarro socorristaCarro;

    public List<Veiculo> getListaDeVeiculos() {
        return listaDeVeiculos;
    }

    public void setListaDeVeiculos(List<Veiculo> listaDeVeiculos) {
        this.listaDeVeiculos = listaDeVeiculos;
    }

    private List<Veiculo> listaDeVeiculos;

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPremioEmDolar() {
        return premioEmDolar;
    }

    public void setPremioEmDolar(double premioEmDolar) {
        this.premioEmDolar = premioEmDolar;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeDeVeiculosPermitidos() {
        return quantidadeDeVeiculosPermitidos;
    }

    public void setQuantidadeDeVeiculosPermitidos(int quantidadeDeVeiculosPermitidos) {
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }


    public Corrida() {
    }

    public Corrida(double distancia, double premioEmDolar, String nome, int quantidadeDeVeiculosPermitidos) {
        this.distancia = distancia;
        this.premioEmDolar = premioEmDolar;
        this.nome = nome;
        this.quantidadeDeVeiculosPermitidos = quantidadeDeVeiculosPermitidos;
    }


    public void adicionarCarro(double velocidade, double aceleracao, double anguloDeVirada, String placa){
        Veiculo carro = new Carros(velocidade, aceleracao, anguloDeVirada, placa); //instanciar o objeto a partir da classe super
        if (listaDeVeiculos.size() < 6){
            listaDeVeiculos.add(carro);
        } else {
            System.out.println("Não existe mais espaço para novos carros");
        }

    }

    public void adicionarMoto(double velocidade, double aceleracao, double anguloDeVirada, String placa){
        Veiculo moto = new Motos(velocidade, aceleracao, anguloDeVirada, placa);
        if (listaDeVeiculos.size() < 6) {
            listaDeVeiculos.add(moto);
        } else {
            System.out.println("Não existe mais espaço para novos carros");
        }
    }

    public void removerVeiculo(Veiculo veiculo){
        for (int v = 0; v < listaDeVeiculos.size(); v++) { //percorrer a lista para identificar o veiculo
            listaDeVeiculos.remove(veiculo);
        }

    }

    public void removerVeiculoComPlaca(String placa){
        for (int p = 0; p < listaDeVeiculos.size(); p++) { //percorrer para identificar o veiculo
            if (Objects.equals(listaDeVeiculos.get(p).getPatente(), placa)) { // verificar se existe a placa
                listaDeVeiculos.remove(listaDeVeiculos.get(p)); // remover a placa encontrada
            }
        }
    }

    public Veiculo vencedorCorrida(){
        Veiculo vencedor = null;
        if(!listaDeVeiculos.isEmpty()) {
            double melhorDesempenho=0;
            for (Veiculo veiculo : listaDeVeiculos) {
                if(melhorDesempenho< desempenhoCorrida(veiculo)){
                    melhorDesempenho= desempenhoCorrida(veiculo);
                    vencedor=veiculo;
                }
            }
        }
        return vencedor;
    }


    public double desempenhoCorrida(Veiculo veiculo){
        return veiculo.getVelocidade() * 1 / 2 * veiculo.getAceleracao() /(veiculo.getAnguloDeVirada() * (veiculo.getPeso() - veiculo.getQtdRodas() * 100));
    }


    public void socorrerCarro(String placa){
        for(Veiculo veiculo: listaDeVeiculos){
            if(veiculo.getPatente().equals(placa)&&(veiculo instanceof Carros)){
                socorristaCarro.socorrer((Carros) veiculo);
                return;
            }
        }
        System.out.println("NENHUM CARRO COM ESTA PLACA NA CORRIDA!!!!");
    }

    public void mostrarVeiculosDaCorrida(){
        System.out.println("*******VEÍCULOS INSCRITOS***********");
        for(Veiculo v: listaDeVeiculos) {
            System.out.println(v.getPatente());
        }
    }






}
