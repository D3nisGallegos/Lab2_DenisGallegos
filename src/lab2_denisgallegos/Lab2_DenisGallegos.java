/*Programa de laboratorio de semana 2 de la clase de programacion 2.
 */
package lab2_denisgallegos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner; 


public class Lab2_DenisGallegos {

    static Scanner lectura = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        //VARIABLES NECESARIAS: 
        int opcion = 0;
        ArrayList detectives = new ArrayList();
        ArrayList<Integer> niveles = new ArrayList();
        ArrayList casos = new ArrayList();
        while (opcion != 5){
            System.out.println("      MENU DE LABORATORIO: ");
            System.out.println("1) Agregar detective. ");
            System.out.println("2) Eliminar detective. ");
            System.out.println("3) Modificar detective. ");
            System.out.println("4) Listar detective.");
            System.out.println("5) Registrar caso.");
            System.out.println("6) Modificar caso.");
            System.out.println("7) Listar casos.");
            System.out.println("8) Listar casos resueltos.");
            System.out.println("9) Listar casos  pemdientes. ");
            System.out.println("Ingrese la opcion. ");
            opcion = lectura.nextInt();
            switch (opcion){
                case 1:
                    {
                    System.out.println(" AGREGAR DETECTIVE: ");
                    System.out.println("Ingrese el nombre del detective: ");
                    String nombre = lectura.next();
                    int edad = 0;
                    boolean validar = false;
                    while (validar == false){
                        System.out.println("Ingrese la edad del detective: (1-100)");
                        edad = lectura.nextInt();
                        if (edad > 0 && edad < 100){
                            validar = true;
                        }else {
                            System.out.println("Edad no valida.");
                        }//Fin del if que valida la entrada.
                    }//Fin del while que reinicia la entrada.
                    System.out.println("Ingrese la nacionalidad del detective: ");
                    String nacionalidad = lectura.next();
                    int laborales = 0;
                    boolean v = false;
                    while (v == false){
                        System.out.println("Ingrese el tiempo laboral del detective: ");
                        laborales = lectura.nextInt();
                        if (laborales >= 0){
                            v = true;
                        }else {
                            System.out.println("Timepo laboral no valido.");
                        }//Fin del if que valida la entrada.
                    }//Fin del while que reinicia la entrada.
                    int nivel = 0;
                    boolean v2 = false;
                    while (v2 == false){
                        System.out.println("Ingrese el nivel del detective: (1-10)");
                        nivel = lectura.nextInt();
                        if (nivel >= 1 && nivel <= 10){
                            v2 = true;
                        }else{
                            System.out.println("Nivel no valido.");
                        }//Fin del if que valida la entrada.
                    }//Fin del while que reinicia la entrada.
                    Detectives detective = new Detectives(nombre, edad, nacionalidad, laborales, nivel);
                    detectives.add(detective);
                    niveles.add(nivel);
                    break;
                    }//Fin del caso 1.
                case 2:
                    {
                    System.out.println(" ELIMINAR DETECTIVES: ");
                    System.out.println("Lista de detectives: ");
                    imprimirlista(detectives);
                    int indice = 0;
                    boolean v2 = false;
                    while (v2 == false){
                        System.out.println("Ingrese el indice del detective a eliminar: ");
                        indice = lectura.nextInt();
                        if (indice >= 0 && indice < detectives.size()){
                            v2 = true;
                        }else{
                            System.out.println("Indice no valido.");
                        }//Fin del if que valida la entrada.
                    }//Fin del while que reinicia la entrada.
                    Detectives detectiveborrar = (Detectives) detectives.get(indice);
                    int detectivemayor = Collections.max(niveles);
                    int contar = 0;
                    for (int c = 0; c < detectives.size();c++){
                        Detectives detectivealto = (Detectives) detectives.get(c);
                        int lvl = detectivealto.getNivel();
                        if (detectivemayor == lvl && contar < 1){
                            contar = 1;
                            ArrayList nuevo = detectiveborrar.getCasos();
                            for (int j = 0; j < nuevo.size();j++){
                                Casos objeto2 = (Casos) nuevo.get(j);
                                String n = objeto2.getTipo();
                                if (n.equals("Homicidio") == true){
                                    detectivealto.getCasos().add(objeto2);
                                }//Fin del if que valida el tipo de caso.
                            }//Fin del for que recorre el 
                        }//Fin del if que valida el nivel del detective.
                    }//Fin del for que recorr la lista de deteectives.
                    int detectivemenor = Collections.min(niveles);
                    int contar2 = 0;
                    for (int c = 0; c < detectives.size();c++){
                        Detectives detectivemenos = (Detectives) detectives.get(c);
                        int lvl = detectivemenos.getNivel();
                        if (detectivemenor == lvl && contar2 < 1){
                            contar2 = 1;
                            ArrayList nuevo = detectiveborrar.getCasos();
                            for (int j = 0; j < nuevo.size();j++){
                                Casos caso = (Casos) nuevo.get(j);
                                String n = caso.getTipo();
                                if (n.equals("Robo")){
                                    detectivemenos.getCasos().add(caso);
                                }//Fin del if que valida el tipo de caso.
                            }//Fin del for que recorre los casos del detective a borrar.
                        }//Fin del if que valida el nivel del detective.
                    }//Fin del for que recorre la lista de detectives.
                    
                    break;
                    }//Fin del caso 2.
            }//Fin del switch que valida la opcion.
        }//Fin del while que reinicia el programa.
        
        
    }//Fin del MAIN.
    
    public static void imprimirlista(ArrayList lista){
        for (int c = 0 ;c < lista.size();c++){
            System.out.println("["+c+"] - "+lista.get(c));
        }//Fin del for que recorre la lista.
    }//Fin del metodo IMPRIMIR LISTA.
    
}//Fin de la clase.
