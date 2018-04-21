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
public class Cliente {
    private int cedula;
    private String nombre;
    private String apellido;
    private int telefono;
    private int edad;
    private String email;
    private Activo [] activos;

    public Cliente(int cedula, String nombre, String apellido, int telefono, int edad, String email) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.email = email;
        this.activos = new Activo [10];
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public Activo[] getActivos() {
        return activos;
    }
    
    public boolean anadirActivo(Activo activo){
       int posVacio = -1;
       for (int i = 0; i < 10; i++) {
          if(this.activos[i] == null){
            posVacio = i;
            break;
          }     
       }
       if(posVacio != -1){
         this.activos[posVacio] = activo;
         return true;
       }
       else return false;
 
    }
    
    public double valorTotalActivos(){
        double a=0;
        
        for(int i=0; i<10; i++){
            if(this.activos[i] != null){
                a= a+ activos[i].darValorMercado();
            }     
        }
     return a;   
    }
    
    public double beneficioTotal(){
        double a=0;
        for(int i=0; i<10; i++){
            if(this.activos[i] != null){
                a= a+ activos[i].darBeneficio();
            }    
            
    }
        return a;    
}
}
