/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universe;

/**
 *Clase para estrellas como el sol, se incluye el atributo color index
 * @author diego
 */
public class Star extends CelestialBody {

    public double colorindex; //Las estrellas debido a la luz que emiten, poseen un atributo de color. 

    /**
     * Contructor que recibe como parametro adicional colorindex
     * @param id
     * @param name
     * @param mass
     * @param density
     * @param diameter
     * @param colorindex Valor decimal de color relacionado con las estrellas
     */
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
