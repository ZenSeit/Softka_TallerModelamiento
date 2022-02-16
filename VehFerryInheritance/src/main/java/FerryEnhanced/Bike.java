/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerryEnhanced;

/**
 *Clase cicla que incluye atributo fuente de energia
 * @author diego
 */
public class Bike extends Vehicle {
    
    private String SrcEnergy; //Se incluye un atributo diferente para diferenciar la clase de la super.

    /**
     * 
     * @param SrcEnergy Fuente de energia (Bateria o tradicional)
     * @param PasNum
     * @param CrewIn
     * @param TiresNum
     * @param RegYear
     * @param colour 
     */
    public Bike(String SrcEnergy, int PasNum, boolean CrewIn, int TiresNum, String RegYear, String colour) {
        super(PasNum, CrewIn, TiresNum, RegYear, colour);
        this.SrcEnergy = SrcEnergy;
    }

    public String getSrcEnergy() {
        return SrcEnergy;
    }

    public void setSrcEnergy(String SrcEnergy) {
        this.SrcEnergy = SrcEnergy;
    }
    
    @Override
    public String toString() {
    return "BIKE"+"\nSource Energy: "+this.SrcEnergy +"\nNumber of sits: "+this.PasNum+"\nNumber of tires: "+this.TiresNum+"\nAre crew in vehicle: "+this.CrewIn+"\nDate Register: "+this.RegYear+"\nColour: "+this.colour;
  }
    
}
