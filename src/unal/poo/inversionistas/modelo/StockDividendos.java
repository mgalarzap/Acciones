/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.inversionistas.modelo;

/**
 *
 * @author laura
 */
public class StockDividendos extends Stock {
    private double dividendos;

    public StockDividendos(String simbolo, double costoTotal, double precioActual, int compartidosTotales, double dividendos) {
        super(simbolo, costoTotal, precioActual, compartidosTotales);
        this.dividendos= dividendos;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double darValorMercado(){
        double a=0;
        a=((this.compartidosTotales*this.precioActual)+this.dividendos);
        return a;
    }
}
