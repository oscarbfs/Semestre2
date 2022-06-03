package Questao4;

import Questao1.CamaroteInferior;
import Questao1.CamaroteSuperior;
import Questao1.Ingresso;
import Questao1.Normal;
import Questao1.Vip;
import Questao2.Imovel;
import Questao2.Novo;
import Questao2.Usado;
import Questao3.Animal.Cachorro;
import Questao3.Animal.Gato;
import Questao3.Pessoa.Miseravel;
import Questao3.Pessoa.Pobre;
import Questao3.Pessoa.Rica;

public class Teste {
    public static void main(String[] args) {
        try {
            // a.
            Cachorro cachorro = new Cachorro("Thor", "Qualquer");
            cachorro.late();
            Gato gato = new Gato("Shiushiushiu", "Qualquer");
            gato.mia();

            cachorro.caminhar();
            gato.caminhar();
            
            // b.
            Rica rica = new Rica("Elton", 26, 1000000000);
            rica.fazCompras();

            Pobre pobre = new Pobre("Oscar", 19);
            pobre.trabalha();

            Miseravel miseravel = new Miseravel("Cleitin", 35);
            miseravel.mendiga();

            // c.
                Ingresso ingresso = new Ingresso(20);
                int ordem = scanner.scannerInt("O você deseja:\n1 - Ingresso normal\n2 - Ingresso Vip", "nao");
                
                if(ordem == 1) {
                    Normal ingressoNormal = new Normal(ingresso.getValor());
                    ingressoNormal.imprimeValorNormal();
                } else if(ordem == 2) {
                    Vip ingressoVip = new Vip(ingresso.getValor(), 10);
                    int novaOrdem = scanner.scannerInt("O você deseja:\n1 - Camarote Superior\n2 - Camarote Inferior", "nao");
                    if (novaOrdem == 1) {
                        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(ingresso.getValor(), ingressoVip.getValorAdicional(), 10);
                        System.out.println("Ingresso Vip no camarote superior selecionado! Valor R$" + camaroteSuperior.getValorTotalCamaroteSuperior());
                    } else if (novaOrdem == 2) {
                        CamaroteInferior camaroteInferior = new CamaroteInferior(ingresso.getValor(), ingressoVip.getValorAdicional(), "10C");
                        System.out.println("Ingresso Vip no camarote inferior selecionado! Valor R$" + camaroteInferior.getValorTotalVip());
                    } else {
                        System.out.println("Nenhuma opção selecionada");
                    }
                } else {
                    System.out.println("Nenhuma opção selecionada");
                }

            // d.
            Imovel imovel = new Imovel("", 100000);
            int ordemImovel = scanner.scannerInt("O você deseja:\n1 - Imovel Novo\n2 - Imovel Usado", "nao");
                
                if(ordemImovel == 1) {
                    Novo imovelNovo = new Novo(imovel.getEndereco(), imovel.getPreco(), 50000);
                    System.out.println("Imovel Novo escolhido. Valor: R$ " + imovelNovo.getValorTotalImovelNovo());
                } else if(ordemImovel == 2) {
                    Usado imovelUsado = new Usado(imovel.getEndereco(), imovel.getPreco(), 50000);
                    System.out.println("Imovel Usado escolhido. Valor: R$ " + imovelUsado.getValorTotalImovelUsado());
                } else {
                    System.out.println("Nenhuma opção selecionada");
                }

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }
}
