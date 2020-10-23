/*Clase para objeto detective.
 */
package lab2_denisgallegos;

import java.util.ArrayList;


public class Detectives {
    
    //ATRIBUTOS: 
    private String nombre; 
    private int edad; 
    private String nacionalidad; 
    private int laborales;
    private int nivel;
    private ArrayList casos;
    
    //CONSTRUCTORES: 
    public Detectives(){
        
    }//Fin del CONSTRUCTOR.
    
    public Detectives(String nombre, int edad, String nacionalidad, int laborales, int nivel){
        this.nombre = nombre; 
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.laborales = laborales;
        this.nivel = nivel;
    }//Fin del CONSTRUCTOR.
    
    //MUTADORES:
    public void setNombre(String nombre){
        this.nombre = nombre;
    }//Fin del metodo SET NOMBRE.
    
    public void seEdad(int edad){
        this.edad = edad;
    }//Fin del metodo SET EDAD.
    
    public void setMedida(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }//Fin del metodo SET NACIONALIDAD.
    
    public void setLaborales(int laborales){
        this.laborales = laborales;
    }//Fin del metodo SET LABORALES.
    
    public void setNivel(int nivel){
        this.nivel = nivel;
    }//Fin del metodo SET NIVEL.
    
    public void setCaso(Object caso){
        casos.add(caso);
    }//Fin del metodo SET CASO.
    
    public int getNivel(){
        return nivel;
    }//Fin del metodo SET NIVEL.
    
    public ArrayList getCasos(){
        return casos;
    }//Fin del metodo SET CASO.
    
    //METODOS DE ADMINISTRACION: 
    public String toString(){
        return " NOMBRE: "+nombre+" EDAD: "+edad+" ORIGEN: "+nacionalidad+" ANIOS LABORALES:"+laborales+" NIVEL: "+nivel;
    }//Fin del metodo TO STRING.
    
    
    
}//Fin de la clase.
