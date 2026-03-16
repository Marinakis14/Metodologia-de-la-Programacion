package Practica3_HerenciaDeClases.ej5;

// Test program to verify the behavior of Shape, Circle, Rectangle and Square
public class TestShape {

    public static void main(String[] args) {

        // Create a basic Shape object using the default constructor
        Shape s1 = new Shape();

        // Print the information of the shape using the toString() method
        System.out.println(s1);

        // Create a Circle object with radius 5.0, color blue and filled = true
        Circle c1 = new Circle(5.0, "blue", true);

        // Print the circle description
        System.out.println(c1);

        // Print the area of the circle
        System.out.println("Area: " + c1.getArea());

        // Print the perimeter (circumference) of the circle
        System.out.println("Perimeter: " + c1.getPerimeter());

        // Create a Rectangle with width 4.0, length 6.0, color green and not filled
        Rectangle r1 = new Rectangle(4.0, 6.0, "green", false);

        // Print the rectangle description
        System.out.println(r1);

        // Print the rectangle area
        System.out.println("Area: " + r1.getArea());

        // Print the rectangle perimeter
        System.out.println("Perimeter: " + r1.getPerimeter());

        // Create a Square with side 3.0, color yellow and filled = true
        Square sq1 = new Square(3.0, "yellow", true);

        // Print the square description
        System.out.println(sq1);

        // Print the side of the square
        System.out.println("Side: " + sq1.getSide());

        // Print the square area
        System.out.println("Area: " + sq1.getArea());

        // Print the square perimeter
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }
}