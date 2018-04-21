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
public class Stock extends ActivosCompartidos {
   protected int compartidosTotales;

    public Stock(String simbolo, double costoTotal, double precioActual, int compartidosTotales) {
        super(simbolo, costoTotal, precioActual);
        this.compartidosTotales = compartidosTotales;
    }

    @Override
    public double darValorMercado() {
        double a = 0;
        a= this.compartidosTotales* this.precioActual;
        return a;         
    }

    @Override
    public double darBeneficio() {
       double a=0;
       a= (this.compartidosTotales*this.precioActual )- this.costoTotal;
       return a;
    }
    


   
}
