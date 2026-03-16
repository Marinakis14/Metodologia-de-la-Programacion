package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1;

/**
 * Rectangle class that extends the abstract class Shape
 */
public class Rectangle extends Shape { // Added "extends"

    //protected instance variables
    protected double width;
    protected double length;

    /**
     * Default constructor for Rectangle with default dimensions
     */
    public Rectangle() {
        super(); //Calls Shape() constructor
        this.width = 1.0;
        this.length = 1.0;
    }

    /**
     * Constructs a Rectangle instance with specific width and length
     */
    public Rectangle(double width, double length) {
        super(); //Calls Shape() constructor
        this.width = width;
        this.length = length;
    }

    /**
     * Constructs a Rectangle instance with dimensions, color and filled status
     */
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled); //Calls Shape(color, filled) constructor
        this.width = width;
        this.length = length;
    }

    //Getter for instance variable width
    public double getWidth() {
        return width;
    }

    //Setter for instance variable width
    public void setWidth(double width) {
        this.width = width;
    }

    //Getter for instance variable length
    public double getLength() {
        return length;
    }

    //Setter for instance variable length
    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Implementation of getArea for a Rectangle: width * length
     */
    @Override
    public double getArea() {
        return width * length;
    }

    /**
     * Implementation of getPerimeter for a Rectangle: 2 * (width + length)
     */
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    /**
     * Returns a self-descriptive string in the form of Rectangle[Shape[],width,length]
     */
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}