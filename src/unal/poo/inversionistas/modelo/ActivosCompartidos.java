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
public abstract class ActivosCompartidos implements Activo  {
    protected String simbolo;
    protected double costoTotal;
    protected double precioActual;
    
    public ActivosCompartidos(String simbolo, double costoTotal, double precioActual) {
        this.simbolo = simbolo;
        this.costoTotal = costoTotal;
        this.precioActual = precioActual;
    }

   
}