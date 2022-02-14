/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestingVector;

import java.util.Scanner;
import java.util.Vector;

/**
 *
 * @author diego
 */
public class ToRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vector ve = new Vector(); //Se instancia la clase vector para pruebas y ver funcionamiento.
        Scanner leer = new Scanner(System.in);
        int num, temp = 0, temp2 = 0, cont = 0;
        
        do {
            System.out.println("If you enter the same number twice in a row, the app stops. \nType a number to save: ");
            num = leer.nextInt();

            if (cont <= 0) {//Se implementa el algorimo de logica para pedir numeros y finalizar cuando se repitan estos.
                temp = num;
                ve.add(num); //El objeto vector se comporta como un array dinamico y permite que su tamanio sea variable.
                if (temp == temp2) {
                    temp2 = temp + 1;
                }
            } else {
                temp2 = temp;
                temp = num;
                if (temp2 != temp) {
                    ve.add(num);
                }
            }
            cont++;
        } while (temp != temp2);

        for (int i = 0; i < ve.size(); i++) {
            System.out.print(ve.elementAt(i) + "\t"); //Se imprime el objeto vector y nos arroja los numeros almacenados.
        }
    }

}
