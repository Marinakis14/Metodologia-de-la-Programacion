package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

/**
 * Circle class that extends the abstract class Shape
 */
public class Circle extends Shape {

    //protected instance variable
    protected double radius = 1.0;

    /**
     * Default constructor for Circle with default radius
     */
    public Circle() {
        super(); //Calls Shape() constructor
    }

    /**
     * Constructs a Circle instance with a specific radius
     */
    public Circle(double radius) {
        super(); //Calls Shape() constructor
        this.radius = radius;
    }

    /**
     * Constructs a Circle instance with radius, color and filled status
     */
    public Circle(double radius, String color, boolean filled) {
        super(color, filled); //Calls Shape(color, filled) constructor
        this.radius = radius;
    }

    //Getter for instance variable radius
    public double getRadius() {
        return radius;
    }

    //Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Implementation of getArea for a Circle: PI * radius^2
     */
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Implementation of getPerimeter for a Circle: 2 * PI * radius
     */
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    /**
     * Returns a self-descriptive string in the form of Circle[Shape[color=?,filled=?],radius=?]
     */
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}