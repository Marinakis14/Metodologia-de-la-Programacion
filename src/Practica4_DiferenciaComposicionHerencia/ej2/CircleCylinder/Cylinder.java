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

    //Returns the area of this Cylinder
    public double getArea() {
        return base.getArea() * 2 + 2 * Math.PI * base.getRadius();
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Cylinder[base=Circle[radius=?,color=?],height=?]
     */
    @Override
    public String toString() {
        return "Cylinder[base=" + base + ",height=" + height + "]";
    }

    /**
     * En este caso tanto la composicion como la herencia son buenas opciones pero hemos considerado que la composicion
     * es la mejor opcion ya que no hay que modificar metodos usados en circle como el metodo getArea() que puede dar
     * problemas si no se tiene cuidado como hemos visto en la practica, sin embargo es verdad que utilizando herencia
     * hay que escribir menos codigo porque se reutilizan los metodos de circle
     */

}