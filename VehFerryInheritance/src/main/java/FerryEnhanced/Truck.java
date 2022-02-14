/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerryEnhanced;

/**
 *
 * @author diego
 */
public class Truck extends Vehicle{
    private boolean aretrailer; //Se incluye un atributo diferente para diferenciar la clase de la super.

    public Truck(boolean aretrailer, int PasNum, boolean CrewIn, int TiresNum, String RegYear, String colour) {
        super(PasNum, CrewIn, TiresNum, RegYear, colour);
        this.aretrailer = aretrailer;
    }

    public boolean isAretrailer() {
        return aretrailer;
    }

    public void setAretrailer(boolean aretrailer) {
        this.aretrailer = aretrailer;
    }

    @Override
    public String toString() {
    return "TRUCK"+"\nTrailer: "+this.aretrailer +"\nNumber of sits: "+this.PasNum+"\nNumber of tires: "+this.TiresNum+"\nAre crew in vehicle: "+this.CrewIn+"\nDate Register: "+this.RegYear+"\nColour: "+this.colour;
  }
}
