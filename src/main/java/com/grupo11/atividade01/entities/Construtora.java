package com.grupo11.atividade01.entities;

import java.util.List;
import java.util.ArrayList;

public class Construtora {
    private String cnpj;
    private String nome;
    private float totalVendido;
    private List<Corretor> corretores = new ArrayList<Corretor>();

    public Construtora(String cnpj) {
        this.nome = "ConstróiSuperRapido";
        this.cnpj = cnpj;
    }

    public float getTotalVendido() {
        float totalVendido = 0;

        for(int i = 0; i < corretores.size(); i++) {
            totalVendido += corretores.get(i).getTotalDeVendas();
        }
        setTotalVendido(totalVendido);

        return this.totalVendido;
    }

    public void setTotalVendido(float totalVendido) {
        this.totalVendido = totalVendido;
    }
    
    public void contratarCorretor(Corretor corretor) {
        corretores.add(corretor);
    }

    public String listaNomeEVendasCorretores() {
        List nomesEVendas = new ArrayList();
        for(int i = 0; i < corretores.size(); i++) {
            Corretor corretor = corretores.get(i);
            nomesEVendas.add(corretor.getNome() + ": R$" + String.format("%.2f", corretor.getTotalDeVendas()));
        }
        return String.join(",\n",nomesEVendas);
    }
}
