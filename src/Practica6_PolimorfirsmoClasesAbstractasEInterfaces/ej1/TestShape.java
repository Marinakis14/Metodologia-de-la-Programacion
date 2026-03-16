package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1;

public class TestShape {
    public static void main(String[] args) {

        // Circle
        Circle c1 = new Circle(5.0, "blue", true);
        System.out.println(c1);
        System.out.println("Area: " + c1.getArea());
        System.out.println("Perimetro: " + c1.getPerimeter());

        System.out.println();

        // Rectangle
        Rectangle r1 = new Rectangle(4.0, 6.0, "green", false);
        System.out.println(r1);
        System.out.println("Area: " + r1.getArea());//No funciona porque el metodo getArea() no esta definido en la clase Circle
        System.out.println("Perimetro: " + r1.getPerimeter());//No funciona porque el metodo getPerimeter() no esta definido en la clase Circle

        System.out.println();

        // Square
        Square s1 = new Square(4.0, "yellow", true);
        System.out.println(s1);
        System.out.println("Area: " + s1.getArea());
        System.out.println("Perimetro: " + s1.getPerimeter());

        System.out.println();

        // Polimorfismo
        Shape s2 = new Circle(3.0, "red", true);
        System.out.println(s2);
        System.out.println("Area: " + s2.getArea());
        System.out.println("Perimetro: " + s2.getPerimeter());

    }
}
