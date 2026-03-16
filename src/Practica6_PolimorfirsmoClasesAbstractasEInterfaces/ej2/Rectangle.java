package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej2;

// Rectangle class that implements the GeometricObject interface
public class Rectangle implements GeometricObject {

    // Width and length of the rectangle
    private double width;
    private double length;

    // Constructor that initializes width and length
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    // Calculates the area of the rectangle
    @Override
    public double getArea() {
        return width * length;
    }

    // Calculates the perimeter of the rectangle
    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    // Returns a text description of the rectangle
    public String toString() {
        return "Rectangle[width=" + width + ", length=" + length + "]";
    }
}