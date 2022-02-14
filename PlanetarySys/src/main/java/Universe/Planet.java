/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universe;

/**
 *
 * @author diego
 */
public class Planet extends CelestialBody{
    
    private double EscapeVel; /* Se incluyen dos caracteristicas para los planetas como son velocidad de escape y distancia al sol */
    private double distosun;

    public Planet(int id, String name, double mass, double density, double diameter,double EscapeVel, double distosun) {
        super(id, name, mass, density, diameter);
        this.EscapeVel = EscapeVel;
        this.distosun = distosun;
    }



    public double getEscapeVel() {
        return EscapeVel;
    }

    public void setEscapeVel(double EscapeVel) {
        this.EscapeVel = EscapeVel;
    }

    public double getDistosun() {
        return distosun;
    }

    public void setDistosun(double distosun) {
        this.distosun = distosun;
    }

    @Override
    public double attractionbtw2(double mass1, double mass2,double dist) {
        return G*(mass1*mass2)/Math.pow((dist*1000), 2);
    }
    
  
}
