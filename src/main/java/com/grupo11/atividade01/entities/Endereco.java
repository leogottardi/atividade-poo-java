
package com.grupo11.atividade01.entities;

public class Endereco {
    private String logradouro, bairro, cidade, estado;
    private int numero, cep;

    public Endereco(String logradouro, String bairro, String cidade, String estado, int numero, int cep) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.numero = numero;
        this.cep = cep;
    }
}
