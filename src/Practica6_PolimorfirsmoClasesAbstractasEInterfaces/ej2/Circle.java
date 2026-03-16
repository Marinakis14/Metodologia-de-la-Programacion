package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej2;

// Circle class that implements the GeometricObject interface
public class Circle implements GeometricObject {

    // Radius of the circle
    private double radius;

    // Constructor that initializes the radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Calculates the area of the circle
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Calculates the perimeter of the circle
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    // Returns a text description of the circle
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}