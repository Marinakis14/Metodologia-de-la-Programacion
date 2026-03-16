package Practica3_HerenciaDeClases.ej5.ShapeAndSubclases;

// Circle class that extends Shape
// It inherits the attributes and methods of Shape
public class Circle extends Shape {

    // Radius of the circle (default value 1.0)
    private double radius = 1.0;

    // Default constructor
    // Calls the constructor of the superclass Shape
    public Circle() {
        super();
    }

    // Constructor that initializes the radius
    // The color and filled attributes come from Shape with default values
    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    // Constructor that initializes radius, color and filled
    // Calls the constructor of Shape to set color and filled
    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    // Getter method for radius
    public double getRadius() {
        return radius;
    }

    // Setter method for radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Calculates the area of the circle
    // Formula: π * r²
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculates the perimeter (circumference) of the circle
    // Formula: 2 * π * r
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Returns a text description of the circle
    // super.toString() calls the toString() method from Shape
    @Override
    public String toString() {
        return "Circle[" + super.toString() + ",radius=" + radius + "]";
    }
}
