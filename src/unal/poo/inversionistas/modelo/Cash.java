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
public class Cash implements Activo {
    
    private double cantidad;

    public Cash(double cantidad) {
        this.cantidad = cantidad;
    }

    
    
    @Override
    public double darValorMercado() {
        return this.cantidad;
    }

    @Override
    public double darBeneficio() {
        return 0;
    }
    
}
