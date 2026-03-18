package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

public class ProgramaDePrueba {

    public static void main(String[] args) {

        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape (Caso de Polimorfismo)
        System.out.println(s1); // which version? = Polimorfismo: Ejecuta toString() de Circle
        System.out.println(s1.getArea()); // which version? = Polimorfismo: Ejecuta getArea() de Circle
        System.out.println(s1.getPerimeter()); // which version? = Polimorfismo: Ejecuta getPerimeter() de Circle
        System.out.println(s1.getColor()); // OK: Metodo definido en Shape
        System.out.println(s1.isFilled()); // OK: Metodo definido en Shape
        //System.out.println(s1.getRadius()); // Error: s1 es tipo Shape y la clase Shape no tiene getRadius()

        Circle c1 = (Circle) s1; // Downcast back to Circle (No es polimorfismo, es recuperación de tipo)
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius()); // OK: La referencia Circle si tiene getRadius()

        //Shape s2 = new Shape(); // Error: Shape es abstracta; no se puede instanciar

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast (Caso de Polimorfismo)
        System.out.println(s3);
        System.out.println(s3.getArea()); // Polimorfismo: Ejecuta getArea() de Rectangle
        System.out.println(s3.getPerimeter()); // Polimorfismo: Ejecuta getPerimeter() de Rectangle
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); // Error: s3 es tipo Shape y la clase Shape no tiene getLength()

        Rectangle r1 = (Rectangle) s3; // Downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast (Caso de Polimorfismo)
        System.out.println(s4);
        System.out.println(s4.getArea()); // Polimorfismo: Ejecuta getArea() (lógica de Square/Rectangle)
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); // Error: s4 es tipo Shape y la clase Shape no tiene getSide()

        Rectangle r2 = (Rectangle) s4; // Upcast de Square a Rectangle (Polimorfismo entre subclases)
        System.out.println(r2);
        System.out.println(r2.getArea()); // Polimorfismo: Ejecuta el área del objeto real (Square)
        System.out.println(r2.getColor());
        //System.out.println(r2.getSide()); // Error: r2 es tipo Rectangle y Rectangle no tiene getSide()
        System.out.println(r2.getLength());

        Square sq1 = (Square) r2; // Downcast
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());

        /**
         * En tus palabras, ¿para qué sirven las clases abstractas y los métodos abstractos?
         * Para nosotros las clases abstractas sirven para representar un concepto y por tanto es importante hacer una
         * clase abstracta para que no se utilicen metodos indebidos como por ejemplo new (...) que al hablar de un
         * concepto abstracto no tine sentido. Ademas permite definir una serie de caracteristicas comunes que deben de
         * tener todas las subclases que se desarrollen a continuacion, ahorrando codigo, tiempo y evitando problemas
         * que podrian causarse si por ejemplo alguna de esas clases no tuviera alguna de esas caracteristicas esenciales
         * Por esto último es para lo que sirven los métodos abstractos que crean una especie de base para todas las
         * subclases
         */
    }
}