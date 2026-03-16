package Practica4_DiferenciaComposicionHerencia.ej2.CircleCylinder;

public class Cylinder {

    //private instance variables
    private Circle base;
    private double height;

    //Contructors

    /**
     * Constructs a Cylinder instance with default values
     */
    public Cylinder() {
        base = new Circle();
        height = 1.0;
    }

    /**
     * Constructs a Cylinder instance with the given height
     */
    public Cylinder(double height) {
        base = new Circle();
        this.height = height;
    }

    /**
     * Constructs a Cylinder instance with the given radius and height
     */
    public Cylinder(double radius, double height) {
        base = new Circle(radius);
        this.height = height;
    }

    /**
     * Constructs a Cylinder instance with the given radius, height and color
     */
    public Cylinder(double radius, double height, String color) {
        base = new Circle(radius, color);
        this.height = height;
    }

    //Getter for Circle instance variable base
    public Circle getBase() {
        return base;
    }

    //Setter for Circle instance variable base
    public void setBase(Circle base) {
        this.base = base;
    }

    //Getter for Circle instance variable height
    public double getHeight() {
        return height;
    }

    //Setter for Circle instance variable height
    public void setHeight(double height) {
        this.height = height;
    }

    //Returns the volume of this Cylinder
    public double getVolume() {
        return base.getArea() * height;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Cylinder[base=Circle[radius=?,color=?],height=?]
     */
    @Override
    public String toString() {
        return "Cylinder[base=" + base + ",height=" + height + "]";
    }
}