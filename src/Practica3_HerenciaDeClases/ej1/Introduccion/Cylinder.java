package Practica3_HerenciaDeClases.ej1.Introduccion;

import Practica1_Clases.ej1.Introduccion.Circle;

public class Cylinder extends Circle {

    // private instance variable
    private double height = 1.0;

    // Constructors

    /**
     * Constructs a Cylinder instance with default radius, color and height
     */
    public Cylinder() {
        super();
    }

    /**
     * Constructs a Cylinder instance with the given radius and default height
     */
    public Cylinder(double radius) {
        super(radius);
    }

    /**
     * Constructs a Cylinder instance with the given radius and height
     */
    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructs a Cylinder instance with the given radius, height and color
     */
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    // Getter for variable height
    public double getHeight() {
        return height;
    }

    // Setter for variable height
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Returns the volume of this Cylinder instance
     */
    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public double getArea() {
        return 2 * super.getRadius() * height * Math.PI + 2 * super.getArea();
    }
    //Al hacer esta modificacion el metodo getVolume utiliza este nuevo metodo getArea que hemos creado en vez de
    //El metodo getArea de la superclase Circle por lo que tenemos que cambiarlo de getArea() a super.getArea()

    /**
     * Returns a self-descriptive string of this class in the form of Cylinder: subclass of Circle[radius=? color=?] height=?
     */
    @Override
    public String toString() { // in Cylinder class
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }

}