package br.com.alura.domain;

public class Pet {

    String tipo;
    String nome;
    String raca;
    int idade;
    String cor;
    Float peso;

    public Pet(String tipo, String nome, String raca, int idade, String cor, Float peso) {
        this.tipo = tipo;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }
}
