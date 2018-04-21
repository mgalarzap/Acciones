/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.inversionistas.modelo;

import java.util.ArrayList;

/**
 *
 * @author laura
 */
public class Compania {
    private ArrayList <Cliente> clientes= new ArrayList();
    
    
    public Compania(){
        clientes = new ArrayList<>();
    }
    
    public boolean addCliente(Cliente cliente){
        return this.clientes.add(cliente);
    }
    
    public double totalValorMercado(){
        double b=0;
        for(int i=0; i<clientes.size(); i++){
            
        b= b+ clientes.get(i).valorTotalActivos();        
            
        }
         return b;    
    }
    
        public double totalValorBeneficio(){
        double a=0;
        for(int i=0; i<clientes.size(); i++){
            
        a= a+ clientes.get(i).beneficioTotal();        
            
        }
         return a;    
    }
    
   

        
    }
     
    