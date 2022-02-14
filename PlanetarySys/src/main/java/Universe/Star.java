/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universe;

/**
 *
 * @author diego
 */
public class Star extends CelestialBody {

    public double colorindex; //Las estrellas debido a la luz que emiten, poseen un atributo de color. 

    public Star(int id, String name, double mass, double density, double diameter,double colorindex) {
        super(id, name, mass, density, diameter);
        this.colorindex = colorindex;
    }

    public double getColorindex() {
        return colorindex;
    }

    public void setColorindex(double colorindex) {
        this.colorindex = colorindex;
    }

    @Override
    public double attractionbtw2(double mass1, double mass2, double disbtw) {
        return G*(mass1*mass2)/Math.pow(disbtw*1000, 2);
    }


}
