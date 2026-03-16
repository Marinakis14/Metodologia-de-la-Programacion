package Practica3_HerenciaDeClases.ej5;

public class TestShape {
    public static void main(String[] args) {
        Shape s1 = new Shape();
        System.out.println(s1);

        Circle c1 = new Circle(5.0, "blue", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimeter: " + c1.getPerimeter());

        Rectangle r1 = new Rectangle(4.0, 6.0, "green", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        Square sq1 = new Square(3.0, "yellow", true);
        System.out.println(sq1);
        System.out.println("Side: " + sq1.getSide());
        System.out.println("Area: " + sq1.getArea());
        System.out.println("Perimeter: " + sq1.getPerimeter());
    }
}