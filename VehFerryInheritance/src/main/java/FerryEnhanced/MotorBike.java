/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerryEnhanced;

/**
 *
 * @author diego
 */
public class MotorBike extends Vehicle {
    
    private int helmetnumber; //Se incluye un atributo diferente para diferenciar la clase de la super.

    public MotorBike(int helmetnumber, int PasNum, boolean CrewIn, int TiresNum, String RegYear, String colour) {
        super(PasNum, CrewIn, TiresNum, RegYear, colour);
        this.helmetnumber = helmetnumber;
    }

    public int getHelmetnumber() {
        return helmetnumber;
    }

    public void setHelmetnumber(int helmetnumber) {
        this.helmetnumber = helmetnumber;
    }
    
     @Override
    public String toString() {
    return "MOTORBIKE"+"\nHelmet number: "+this.helmetnumber +"\nNumber of sits: "+this.PasNum+"\nNumber of tires: "+this.TiresNum+"\nAre crew in vehicle: "+this.CrewIn+"\nDate Register: "+this.RegYear+"\nColour: "+this.colour;
  } 
}
