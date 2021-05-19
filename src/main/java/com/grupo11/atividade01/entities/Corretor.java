package com.grupo11.atividade01.entities;

public class Corretor {
    private String nome;
    private int matricula;
    private float metaMensal, totalDeVendas;
    private Endereco endereco;
    
    public Corretor(String nome, int matricula, float metaMensal, float totalDeVendas, Endereco endereco) {
        this.nome = nome;
        this.matricula = matricula;
        this.metaMensal = metaMensal;
        this.totalDeVendas = totalDeVendas;
        this.endereco = endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public float getTotalDeVendas() {
        return totalDeVendas;
    }
}
