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
            System.out.println("Ingrese la opcion: ");
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
                            System.out.println("Tiempo laboral no valido.");
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
                    detectives.remove(indice);
                    break;
                    }//Fin del caso 2.
                case 3:
                    {
                    System.out.println(" MODIFICAR DETECTIVES: ");
                     System.out.println("Lista de detectives: ");
                    imprimirlista(detectives);
                    int indice = 0;
                    boolean v2 = false;
                    while (v2 == false){
                        System.out.println("Ingrese el indice del detective a modificar: ");
                        indice = lectura.nextInt();
                        if (indice >= 0 && indice < detectives.size()){
                            v2 = true;
                        }else{
                            System.out.println("Indice no valido.");
                        }//Fin del if que valida la entrada.
                    }//Fin del while que reinicia la entrada.
                    Detectives detectivemodificar = (Detectives) detectives.get(indice);
                    int n2 = 0;
                    while (n2 != 1 && n2 != 2 && n2 != 3 && n2 != 4 && n2 != 5){
                        System.out.println("1) Modificar nombre.");
                        System.out.println("2) Modificar edad.");
                        System.out.println("3) Modificar nacionalidad.");
                        System.out.println("4) Modificar tiempo laboral");
                        System.out.println("5) Modificar nivel.");
                        System.out.println("Ingrese la opcion: ");
                        n2 = lectura.nextInt();
                    }//Fin del while que reinica la entrada.
                    if (n2 == 1){
                        System.out.println("Ingrese el nuevo nombre del detective: ");
                        String nombre = lectura.next();
                        detectivemodificar.setNombre(nombre);
                    }else if (n2 == 2){
                        int edad = 0;
                        boolean validar = false;
                        while (validar == false){
                            System.out.println("Ingrese la nueva edad del detective: (1-100)");
                            edad = lectura.nextInt();
                            if (edad > 0 && edad < 100){
                                validar = true;
                            }else {
                                System.out.println("Edad no valida.");
                            }//Fin del if que valida la entrada.
                        }//Fin del while que reinicia la entrada.
                        detectivemodificar.seEdad(edad);
                    }else if (n2 == 3){
                        System.out.println("Ingrese la nueva nacionalidad del detective: ");
                        String nacionalidad = lectura.next();
                        detectivemodificar.setNacionalidad(nacionalidad);
                    }else if (n2 == 4){
                        int laborales = 0;
                        boolean v = false;
                        while (v == false){
                            System.out.println("Ingrese el nuevo tiempo laboral del detective: ");
                            laborales = lectura.nextInt();
                            if (laborales >= 0){
                                v = true;
                            }else {
                                System.out.println("Tiempo laboral no valido.");
                            }//Fin del if que valida la entrada.
                        }//Fin del while que reinicia la entrada.
                        detectivemodificar.setLaborales(laborales);
                    }else if (n2 == 5){
                        int nivel = 0;
                        boolean v3 = false;
                        while (v3 == false){
                            System.out.println("Ingrese el nuevo nivel del detective: (1-10)");
                            nivel = lectura.nextInt();
                            if (nivel >= 1 && nivel <= 10){
                                v3 = true;
                                detectivemodificar.setNivel(nivel);
                            }else{
                                System.out.println("Nivel no valido.");
                            }//Fin del if que valida la entrada.
                        }//Fin del while que reinicia la entrada.
                    }//Fin del if que valida la opcion.
                    break;
                    }//Fin del caso 3.
                case 4:
                    {
                    System.out.println(" LISTAR DETECTIVE: ");
                    System.out.println("Lista de detectives: ");
                    imprimirlista(detectives);
                    break;
                    }//Fin del caso 4.
                case 5:
                    {
                    System.out.println(" REGISTRAR CASOS: ");
                    System.out.println("Ingrese el lugar del caso: ");
                    String lugar = lectura.next();
                    System.out.println("Ingrese la descripcion del caso: ");
                    String descripcion = lectura.next();
                    int n2 = 0;
                    while (n2 != 1 && n2 != 2 && n2 != 3){
                        System.out.println("1) Homicidio");
                        System.out.println("2) Secuestro");
                        System.out.println("3) Robo");
                        System.out.println("Ingrese el tipo de caso:");
                        n2 = lectura.nextInt();
                    }//Fin del while que reinicia la entrada.
                    String tipo = "";
                    if (n2 == 1){
                        tipo = "Homicidio";
                    }else if (n2 == 2){
                        tipo = "Secuestro";
                    }else if (n2 == 3){
                        tipo = "Robo";
                    }//Fin del if que valida el tipo de caso.
                    System.out.println("Lista de detectives para asignar al caso: ");
                    imprimirlista(detectives);
                    int indice = 0;
                    boolean v2 = false;
                    while (v2 == false){
                        System.out.println("Ingrese el indice del detective a asignar: ");
                        indice = lectura.nextInt();
                        if (indice >= 0 && indice < detectives.size()){
                            v2 = true;
                        }else{
                            System.out.println("Indice no valido.");
                        }//Fin del if que valida la entrada.
                    }//Fin del while que reinicia la entrada.
                    Detectives asignado = (Detectives) detectives.get(indice);
                    String detective = asignado.getNombre();
                    int n3 = 0;
                    while (n3 != 1 && n3 != 2 && n3 != 3){
                        System.out.println("1) En proceso");
                        System.out.println("2) Resuelto");
                        System.out.println("Ingrese el estado de caso:");
                        n3 = lectura.nextInt();
                    }//Fin del while que reinicia la entrada.
                    String estado = "";
                    if (n3 == 1){
                        estado = "En proceso";
                    }else if (n3 == 2){
                        tipo = "Resuelto";
                    }//Fin del if que valida el estado de caso.
                    Casos caso = new Casos(lugar, descripcion, tipo, detective, estado);
                    casos.add(caso);
                    asignado.getCasos().add(caso);
                    break;
                    }//Fin del caso 5.
            }//Fin del switch que valida la opcion.
        }//Fin del while que reinicia el programa.
        
        
    }//Fin del MAIN.
    
    public static void imprimirlista(ArrayList lista){
        for (int c = 0 ;c < lista.size();c++){
            System.out.println("["+c+"] - "+lista.get(c));
        }//Fin del for que recorre la lista.
        System.out.println("");
    }//Fin del metodo IMPRIMIR LISTA.
    
}//Fin de la clase.
