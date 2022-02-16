/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFerry;

/**
 *Clase vehiculo que define como seran los vehiculos que se esperan recibir en el Ferry
 * @author diego
 */
public class Vehicle {
    
    private int PasNum; 
    private boolean CrewIn;
    private int TiresNum;
    private String RegYear;
    private String colour;

    /**
     * 
     * @param PasNum Numero de pasajeros que puede recibir
     * @param CrewIn Presenta tripulacion
     * @param TiresNum Numero de ruedas
     * @param RegYear Anio de resgistro o matricula
     * @param colour Color
     */
    public Vehicle(int PasNum, boolean CrewIn, int TiresNum, String RegYear, String colour) {
        this.PasNum = PasNum;
        this.CrewIn = CrewIn;
        this.TiresNum = TiresNum;
        this.RegYear = RegYear;
        this.colour = colour;
    }

    public int getPasNum() {
        return PasNum;
    }

    public void setPasNum(int PasNum) {
        this.PasNum = PasNum;
    }

    public boolean isCrewIn() {
        return CrewIn;
    }

    public void setCrewIn(boolean CrewIn) {
        this.CrewIn = CrewIn;
    }

    public int getTiresNum() {
        return TiresNum;
    }

    public void setTiresNum(int TiresNum) {
        this.TiresNum = TiresNum;
    }

    public String getRegYear() {
        return RegYear;
    }

    public void setRegYear(String RegYear) {
        this.RegYear = RegYear;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    
    /**
     * Metodo para encender el vehiculo
     * @return 
     */
    public String StarVehicle(){
        return "Your vehicle is on";
    }
    
    /**
     * Metodo para encender luces
     * @return 
     */
    public String Starlights(){
        return "Your lights are on";
    }
    
    /**
     * Metodo para acelerar
     * @return 
     */
    public String SpeedUp(){
        return "Your vehicle is spedding up";
    }
    
    /**
     * Metodo para frenar
     * @return 
     */
    public String Brake(){
        return "Your vehicle is braking";
    }
    
    @Override
  public String toString() {
    return "Number of sits: "+this.PasNum+"\nNumber of tires: "+this.TiresNum+"\nAre crew in vehicle: "+this.CrewIn+"\nDate Register: "+this.RegYear+"\nColour: "+this.colour;
  }
    
    
}
