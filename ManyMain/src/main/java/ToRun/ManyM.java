/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ToRun;

/**
 *
 * @author diego
 */
public class ManyM {
    
    /* 
    Usando el concepto de sobrecarga de metodos, es posible tener varios metodos main,
    sin embargo el JVM va a identificar el metodo que viene por defecto como el principal
    */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { //Sin embargo, cuando tenemos metodos main en diferentes clases, solo basta con seleccionar el metodo por el cual queremos
        System.out.println("Method 1");// ejecutar la app. Para realizar esto lo podemos hacer en propiedades del proyecto, en el apartado de ejecutar, main class.
        main(2.0);
        main("");
    }
    
    public static void main(Double args) {  //En conclusion es posbible tener muchos metodos main en una misma clase o en diferentes clases de un mismo proyecto.
        System.out.println("Method 2");
    }
    
    public static void main(String args) {
        System.out.println("Method 3");
    }
    
}
