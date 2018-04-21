/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.inversionistas.vista;

import unal.poo.inversionistas.modelo.Activo;
import unal.poo.inversionistas.modelo.Cliente;
import unal.poo.inversionistas.modelo.Compania;
import unal.poo.inversionistas.modelo.Stock;
import unal.poo.inversionistas.modelo.StockDividendos;
import unal.poo.inversionistas.modelo.ActivosCompartidos;

/**
 *
 * @author laura
 */
public class UnalPooInvresionistasModelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Compania compania=new Compania();
        Cliente cliente1= new Cliente(12,"jhf","def",12,12,"ke");
        Cliente cliente2= new Cliente(1,"jhf","def",1,2,"ke");
        compania.addCliente(cliente1);
        compania.addCliente(cliente2);
        

        Activo activo2= new StockDividendos("eff",112,2,3,20);
         Activo activo1= new Stock("eff",12,12,13);
        cliente1.anadirActivo(activo1);
        cliente1.anadirActivo(activo2);
        cliente1.valorTotalActivos();
        compania.totalValorMercado();
        System.out.println(cliente1.valorTotalActivos());
        System.out.println(compania.totalValorMercado());
        
        
        
        
    }
    
}
