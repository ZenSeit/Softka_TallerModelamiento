/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package FerryEnhanced;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Clase Main que solicita datos de vehiculos para crearlos; pero solicita al usuario que especifique el tipo de vehiculo entre Carro,Camion,Moto y Bici
 * Una vez se ingresan 10 vehiculos, se listan cada uno de ellos con sus caracteristicas.
 * @author diego
 */
public class ToRun {

    /** 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        Scanner str2 = new Scanner(System.in);
        Scanner str3 = new Scanner(System.in);
        Scanner str4 = new Scanner(System.in);
        Scanner str5 = new Scanner(System.in);
        Scanner str6 = new Scanner(System.in);
        ArrayList<Vehicle> LisV = new ArrayList<>();
        int pass, tires, cr, i = 1,hel;
        String reg, col;
        boolean cre = false, tra = false;
        
        System.out.println("-----Welcome to FeRRy-----");
        System.out.println("Type the information to register the vehicle in our system.");
        
        do {
            System.out.println("Vehicle #" + i);
            System.out.println("Enter number of passangers' sits: ");
            pass = str.nextInt();
            System.out.println("Enter number of tires: ");
            tires = str.nextInt();
            System.out.println("Enter year of register: "); //Se realiza el proceso de pedir los datos del vehiculo
            reg = str2.nextLine();
            System.out.println("Enter vechicle's colour: ");
            col = str2.nextLine();
            System.out.println("Are there crew in the vechicle?");
            System.out.println("1.Yes" + "\n2.No");
            cr = str3.nextInt();
            switch (cr) {
                case 1:
                    cre = true;
                    break;
                case 2:
                    cre = false;
                    break;
            }
            System.out.println("Select the type of vehicle: "); // Se pregunta al usuario que tipo de vehiculo es el que se va a guardar y se usas un switch para cambiar procesos.
            System.out.println("1.Car" + "\n2.Truck" + "\n3.MotorBike" + "\n4.Bike");
            cr = str3.nextInt();
            
            switch (cr) {
                case 1:
                    System.out.println("Car's version: \nCould be: \nSedan or SUV and others.");
                    String vercar = str4.nextLine();
                    Vehicle car = new Car(vercar, pass, cre, tires, reg, col); //Se almacena el vehiculo como carro
                    LisV.add(car);
                    break;
                case 2:
                    System.out.println("is there a trailer?: \n1.True \n2.False");
                    cr = str3.nextInt();
                    switch (cr) {
                        case 1:
                            tra = true;
                            break;
                        case 2:
                            tra = false;
                            break;
                    }
                    Vehicle truck = new Truck(tra, pass, cre, tires, reg, col); //Se almacena el vehiculo como camion
                    LisV.add(truck);
                    break;
                case 3:
                    System.out.println("Number of helmets: ");
                    hel = str6.nextInt();
                    Vehicle mbike = new MotorBike(hel, pass, cre, tires, reg, col); //Se almacena el vehiculo como moto
                    LisV.add(mbike);
                    break;
                case 4:
                    System.out.println("Source Energy: Could be - traditional or electric ");
                    String src = str5.nextLine();
                    Vehicle bike = new Bike(src, pass, cre, tires, reg, col); //Se almacena el vehiculo como bici
                    LisV.add(bike);
                    break;
            }

            i++;
        } while (i < 11);

        System.out.println("===============================");
        int m = 1;
        for (Vehicle v : LisV) {
            System.out.println("Vechicle #" + m + "\n");
            System.out.println(v.toString()); //Se imprimen todos los vehiculos.
            System.out.println("==========================");
            m++;
        }

    }

}
