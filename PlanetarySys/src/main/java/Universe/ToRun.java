/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Universe;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 *Clase Main que simula la fuerza gravitatoria existente entre el sol y un planeta(Tierra)
 * @author diego
 */
public class ToRun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Planet Earth=new Planet(3, "Earth", 5.97237*Math.pow(10.0, 24), 5.514, 12.74,11.17, 150000000); /*Se simula el sistema planetario para dos cuerpos como lo son el sol y la tierra*/
        Star Sun=new Star(0, "Sun", 1.9885*Math.pow(10.0, 30), 1.408, 1392000.0, 0.63);
        NumberFormat Resultform=new DecimalFormat("#0.000");
        
        System.out.println("Planet: "+Earth.getName());
        System.out.println("Star: "+Sun.getName());
        System.out.println("Gravitational attraction between "+Sun.getName()+" and "+Earth.getName()+" is "+Earth.attractionbtw2(Sun.getMass(), Earth.getMass(), Earth.getDistosun())+" newtons");
    }
    
}
