package com.grupo11.atividade01.utils;

import com.grupo11.atividade01.entities.Corretor;
import com.grupo11.atividade01.entities.Endereco;

public class Cadastro {
    private static String NOMEJANELA = "Atividade 01";

    public Corretor cadastrarCorretor() {
        String nome = InOut.leString("Nome:", NOMEJANELA);
        int matricula = InOut.leInt("Matrícula:", NOMEJANELA);
        float metaMensal = InOut.leFloat("Meta mensal:", NOMEJANELA);
        float totalVendido = InOut.leFloat("Total vendido no mês:", NOMEJANELA);
        
        Endereco endereco = cadastrarEndereco();
        
        return new Corretor(nome, matricula, metaMensal, totalVendido, endereco);
    }
    
    private Endereco cadastrarEndereco() {
        String estado = InOut.leString("Estado:", NOMEJANELA);
        String cidade = InOut.leString("Cidade:", NOMEJANELA);
        String bairro = InOut.leString("Bairro:", NOMEJANELA);
        String logradouro = InOut.leString("Logradouro:", NOMEJANELA);
        int numero = InOut.leInt("Número:", NOMEJANELA);
        int cep = InOut.leInt("Cep:", NOMEJANELA);
        
        return new Endereco(logradouro, bairro, cidade, estado, numero, cep);
    }
}
