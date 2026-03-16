package Practica3_HerenciaDeClases.ej5;

// Rectangle class that extends Shape
// It inherits attributes such as color and filled from Shape
public class Rectangle extends Shape {

    // Width and length of the rectangle (default values)
    private double width = 1.0;
    private double length = 1.0;

    // Default constructor
    // Calls the constructor of the superclass Shape
    public Rectangle() {
        super();
    }

    // Constructor that initializes width and length
    // Color and filled remain with default values from Shape
    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    // Constructor that initializes width, length, color and filled
    // Calls the superclass constructor to set color and filled
    public Rectangle(double width, double length, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    // Getter method for width
    public double getWidth() {
        return width;
    }

    // Setter method for width
    public void setWidth(double width) {
        this.width = width;
    }

    // Getter method for length
    public double getLength() {
        return length;
    }

    // Setter method for length
    public void setLength(double length) {
        this.length = length;
    }

    // Calculates the area of the rectangle
    // Formula: width * length
    public double getArea() {
        return width * length;
    }

    // Calculates the perimeter of the rectangle
    // Formula: 2 * (width + length)
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Returns a text description of the rectangle
    // super.toString() calls the toString() method of Shape
    @Override
    public String toString() {
        return "Rectangle[" + super.toString() + ",width=" + width + ",length=" + length + "]";
    }
}
