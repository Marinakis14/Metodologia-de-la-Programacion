package Practica4_DiferenciaComposicionHerencia.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        // Constructor con radio y color
        Circle c1 = new Circle(5.0, "blue");
        assertEquals(5.0, c1.getRadius());
        assertEquals("blue", c1.getColor());

        // Constructor solo con radio
        Circle c2 = new Circle(3.0);
        assertEquals(3.0, c2.getRadius());
        assertEquals("red", c2.getColor());

        // Constructor por defecto
        Circle c3 = new Circle();
        assertEquals(1.0, c3.getRadius());
        assertEquals("red", c3.getColor());

        // Setters
        c3.setRadius(4.0);
        c3.setColor("green");

        assertEquals(4.0, c3.getRadius());
        assertEquals("green", c3.getColor());

        // Área
        assertEquals(Math.PI * 25, c1.getArea());

        // toString
        assertEquals(
                "Circle[radius=5.0,color=blue]",
                c1.toString()
        );
    }
}