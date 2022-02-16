/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FerryEnhanced;

/**
 *Clase carro que incluye el atributo tipo de carro
 * @author diego
 */
public class Car extends Vehicle {
    
    private String TypeCar; //Se incluye un atributo diferente para diferenciar la clase de la super.

    /**
     * 
     * @param TypeCar tipo de carro(sedan,SUV,etc)
     * @param PasNum
     * @param CrewIn
     * @param TiresNum
     * @param RegYear
     * @param colour 
     */
    public Car(String TypeCar, int PasNum, boolean CrewIn, int TiresNum, String RegYear, String colour) {
        super(PasNum, CrewIn, TiresNum, RegYear, colour);
        this.TypeCar = TypeCar;
    }

    public String getTypeCar() {
        return TypeCar;
    }

    public void setTypeCar(String TypeCar) {
        this.TypeCar = TypeCar;
    }
    
    @Override
    public String toString() {
    return "CAR"+"\nCar's type: "+this.TypeCar +"\nNumber of sits: "+this.PasNum+"\nNumber of tires: "+this.TiresNum+"\nAre crew in vehicle: "+this.CrewIn+"\nDate Register: "+this.RegYear+"\nColour: "+this.colour;
  }
    
    
}
