/*Clase para el objeto casos.
 */
package lab2_denisgallegos;

import java.util.ArrayList;


public class Casos {
    
    //ATRIBUTOS: 
    private String lugar; 
    private String descripcion; 
    private String tipo;
    private String detectives; 
    private String estado;
    
    //CONSTRUCTORES: 
    public Casos(){
        
    }//Fin del CONSTRUCTOR.
    
    public Casos(String lugar, String descripcion, String tipo, String detectives, String estado){
        this.lugar = lugar; 
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.detectives = detectives;
        this.estado = estado;
    }//Fin del CONSTRUCTOR.
    
    //MUTADORES: 
    public void setLugar(String lugar){
        this.lugar = lugar;
    }//Fin del metodo SET LUGAR.
    
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }//Fin del metodo SET DESCRIPCION.
    
    public void setTipo(int n){
        if (n == 1){
            tipo = "Homicidio";
        }else if (n == 2){
            tipo = "Robo";
        }else if (n == 3){
            tipo = "Secuestro";
        }//Fin del if que valida el tipo de estado.
    }//Fin del metodo SET TIPO.
    
    public void setDetective(String detective){
        detectives = detective;
    }//Fin del metodo SET LABORALES.
    
    public void setEstado(int n){
        if (n == 1){
            estado = "En proceso";
        }else if (n == 2){
            estado = "Resuelto";
        }//Fin del if que valida el tipo de estado.
    }//Fin del metodo SET ESTADO.
    
    public String getEstado(){
        return estado;
    }//Fin del metodo SET ESTADO.
    
    public String getTipo(){
        return tipo;
    }//Fin del metodo GET TIPO.
    
    //METODOS DE ADMINISTRACION: 
    public String toString(){
        return "LUGAR: "+lugar+" DESC: "+descripcion+" TIPO: "+tipo+" DETECTIVE: "+detectives+" ESTADO: "+estado;
    }//Fin del metodo TO STRING.
    
    
    
}//Fin de la clase.
