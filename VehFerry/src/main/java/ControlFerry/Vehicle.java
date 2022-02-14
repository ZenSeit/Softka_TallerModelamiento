/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ControlFerry;

/**
 *
 * @author diego
 */
public class Vehicle { //Se definen para la clase vehiculo 5 atributos y 4 metodos diferentes a los getters y setters
    private int PasNum; //Los metodos definidos son StarVehicle,StarLights,SpeedUp,Brake.
    private boolean CrewIn;
    private int TiresNum;
    private String RegYear;
    private String colour;

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
    
    public String StarVehicle(){
        return "Your vehicle is on";
    }
    
    public String Starlights(){
        return "Your lights are on";
    }
    
    public String SpeedUp(){
        return "Your vehicle is spedding up";
    }
    
    public String Brake(){
        return "Your vehicle is braking";
    }
    
    @Override
  public String toString() {
    return "Number of sits: "+this.PasNum+"\nNumber of tires: "+this.TiresNum+"\nAre crew in vehicle: "+this.CrewIn+"\nDate Register: "+this.RegYear+"\nColour: "+this.colour;
  }
    
    
}
