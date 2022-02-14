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
    public static void main(String[] args) {
        System.out.println("Method 1");
        main(2.0);
        main("");
    }
    
    public static void main(Double args) {
        System.out.println("Method 2");
    }
    
    public static void main(String args) {
        System.out.println("Method 3");
    }
    
}
