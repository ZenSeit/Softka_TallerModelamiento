/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universe;

/**
 *Se crea una clase abstracta en donde se define como van a ser los cuerpos celestes. Se incluye el metodo abstracto attractionbtw2 para calcular la
 * atracion gravitatoria entre dos cuerpos.
 * @author diego
 */
public abstract class CelestialBody {
    
    static final double G=6.67*Math.pow(10,-11); //Se define la constante gravitacional
    private int id;
    private String name;
    private double mass;
    private double density;
    private double diameter;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    /**
     * Constructor para instaciar un objeto de cuerpo celeste
     * @param id numero de identificacion
     * @param name nombre del cuerpo celeste
     * @param mass masa en kilogramos
     * @param density densidad
     * @param diameter diametro
     */
    public CelestialBody(int id, String name, double mass, double density, double diameter) {
        this.id = id;
        this.name = name;
        this.mass = mass;
        this.density = density;
        this.diameter = diameter;
    }




    /**
     * Metodo abstracto para el calculo de fuerza de atraccion
     * @param mass1 Masa del objeto 1
     * @param mass2 Masa del objeto 2
     * @param disbtw Distancia entre objetos
     * @return 
     */
    public abstract double attractionbtw2(double mass1,double mass2,double disbtw);

}
