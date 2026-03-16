package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej2.GeometricObjectYSuImplementacionEnLasClasesCircleYRectagle;

// Test program to verify the implementation of the interface
public class TestGeometricObject {

    public static void main(String[] args) {

        // Creating a Circle object using the GeometricObject type
        GeometricObject g1 = new Circle(5);

        // Creating a Rectangle object using the GeometricObject type
        GeometricObject g2 = new Rectangle(4, 6);

        // Printing information about the circle
        System.out.println(g1);
        System.out.println("Area: " + g1.getArea());
        System.out.println("Perimeter: " + g1.getPerimeter());

        // Printing information about the rectangle
        System.out.println(g2);
        System.out.println("Area: " + g2.getArea());
        System.out.println("Perimeter: " + g2.getPerimeter());
    }
}