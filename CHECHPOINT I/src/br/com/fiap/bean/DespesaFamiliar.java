//FRANCISCO NOGUEIRA DE QUEIROZ, RM:566309;
//RHARIEL MARCELO, RM: 566310;
//DENNIS NIETO GENEROSO, RM: 563671.

package br.com.fiap.bean;

public class DespesaFamiliar {
    //Atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;

    //Metodos

    public double calcularTotalDeDespesas(){
        double despesatotal, totalacademia;
        totalacademia = valorMensalidadeDaAcademia * numeroDeMoradores;
        despesatotal = (totalacademia + gastoComAgua + gastoComInternet + gastoComLuz);
        return despesatotal;
    }
    public double calcularRendaFamiliarLiquida(){
        double rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();

        return rendaLiquida;
    }
}
