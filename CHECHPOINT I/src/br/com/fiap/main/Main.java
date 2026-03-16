//FRANCISCO NOGUEIRA DE QUEIROZ, RM:566309;
//RHARIEL MARCELO, RM: 566310;
//DENNIS NIETO GENEROSO, RM: 563671.

package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DespesaFamiliar despesaFamiliar = new DespesaFamiliar();
        double gastoTotalFamiliar, rendaFamiliar, gastoComInternet, gastoComLuz, gastoComAgua, valorAcademia;
        int numeroDeMoradores;
        Scanner scan;
        try {
            //Leituras de informaçôes.
            scan = new Scanner(System.in);
            System.out.println("Diga o valor total da renda familiar: ");
            rendaFamiliar = scan.nextDouble();
            System.out.println("Diga o numero de moradores: ");
            numeroDeMoradores = scan.nextInt();
            System.out.println("Diga o valor total do gasto com luz: ");
            gastoComLuz = scan.nextDouble();
            System.out.println("Diga o valor total do gasto com agua: ");
            gastoComAgua = scan.nextDouble();
            System.out.println("Diga o valor da internet: ");
            gastoComInternet = scan.nextDouble();
            System.out.println("Diga o valor do plano de academia: ");
            valorAcademia = scan.nextDouble();
            //Armazenando os valores nos atributos do objeto.
            despesaFamiliar.gastoComLuz = gastoComLuz;
            despesaFamiliar.gastoComInternet = gastoComInternet;
            despesaFamiliar.gastoComAgua = gastoComAgua;
            despesaFamiliar.valorMensalidadeDaAcademia = valorAcademia;
            despesaFamiliar.numeroDeMoradores = numeroDeMoradores;
            despesaFamiliar.rendaFamiliar = rendaFamiliar;
            //Exibindo as informações.
            gastoTotalFamiliar = despesaFamiliar.calcularTotalDeDespesas();
            System.out.printf(
                    "O valor da renda familiar é: %.3f\nO gasto total familiar é: %.3f\nO valor da renda familiar líquida é: %.3f",
                    rendaFamiliar, gastoTotalFamiliar, despesaFamiliar.calcularRendaFamiliarLiquida()
            );
            scan.close();
        } catch (Exception e) {
            System.out.println("Formato de dados não reconhecido!");;
        }
    }
}
