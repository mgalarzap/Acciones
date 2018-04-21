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
public class FondoInversion extends ActivosCompartidos {
    
    private double totalesCompartidos;

    public FondoInversion(String simbolo, double costoTotal, double precioActual, double totalesCompartidos) {
        super(simbolo, costoTotal, precioActual);
        this.totalesCompartidos=totalesCompartidos;
    }

    @Override
    public double darValorMercado() {
        double a= 0;
        a= this.totalesCompartidos*this.precioActual;
        return a;
    }

    @Override
    public double darBeneficio() {
       double a=0;
       a=(this.totalesCompartidos*this.precioActual)-this.costoTotal;
       return a;
    }
    
    
}
