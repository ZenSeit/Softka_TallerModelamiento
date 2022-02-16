/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerryEnhanced;

/**
 *Clase camion que agregar el atributo presencia de trailer
 * @author diego
 */
public class Truck extends Vehicle{
    private boolean aretrailer;

    /**
     * 
     * @param aretrailer Tiene trailer o no
     * @param PasNum
     * @param CrewIn
     * @param TiresNum
     * @param RegYear
     * @param colour 
     */
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
