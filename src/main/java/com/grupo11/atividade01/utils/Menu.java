package com.grupo11.atividade01.utils;

import com.grupo11.atividade01.validates.ValidaCNPJ;
import com.grupo11.atividade01.entities.Construtora;
import com.grupo11.atividade01.entities.Corretor;

public class Menu {
    private int opcao;
    private static Construtora construtora;
    private static String NOMEJANELA = "Atividade 01";

    public void exibir() {
        inserirCnpjConstrutora();
        while(true) {
            selecionarOpcao();
            direcionarEscolha();
        }
    }

    private void inserirCnpjConstrutora() {
        String cnpj = InOut.leString("CNPJ da construtora", NOMEJANELA);

        boolean isValidCnpj = ValidaCNPJ.isCNPJ(cnpj);

        if (!isValidCnpj) {
            InOut.MsgDeErro(NOMEJANELA, "CNPJ é inválido!", NOMEJANELA);
            inserirCnpjConstrutora();
        } else {
            Construtora construtora = new Construtora(cnpj);
            this.construtora = construtora;
        }
    }

    private String textMenu() {
       String text = 
       "------------- OPÇÕES -------------\n" +
       "1 - Adicionar um corretor\n" +
       "2 - Listar total de vendas dos corretores\n" +
       "3 - Ver total vendido pela construtora\n" +
       "0 - Encerrar programa\n" +
       "----------------------------------";
       
       return text;
   }

    private void selecionarOpcao() {
        int opcaoSelecionada = InOut.leInt(textMenu(), NOMEJANELA);
        setOpcao(opcaoSelecionada);
    }

    public void setOpcao(int opcao) {
        this.opcao = opcao;
    }

    private void direcionarEscolha() {

        switch(this.opcao) {
            case 1:
                 Cadastro cadastro = new Cadastro();
                 Corretor corretor = cadastro.cadastrarCorretor();

                 this.construtora.contratarCorretor(corretor);

                 break;
            case 2: 
                String nomeEVendasCorretores = construtora.listaNomeEVendasCorretores();

                InOut.MsgSemIcone(NOMEJANELA, nomeEVendasCorretores, NOMEJANELA);
                break;
            case 3:
                float totalVendido = construtora.getTotalVendido();
                InOut.MsgSemIcone(NOMEJANELA, String.format("O total vendido e de: R$%s reais.", String.format("%.2f", totalVendido)), NOMEJANELA);
                break;
            case 0:
                InOut.MsgDeInformacao("GoodBye!", "Encerramento programa...", NOMEJANELA);
                System.exit(0);
                break;
            default:
                InOut.MsgDeErro(NOMEJANELA, "Opção inválida!", NOMEJANELA);
        }
    }
}
