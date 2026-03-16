package Practica3_HerenciaDeClases.ej5.ShapeAndSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Circle c1 = new Circle(5.0, "blue", true);
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle();

        assertEquals(5.0, c1.getRadius());
        assertEquals("blue", c1.getColor());
        assertTrue(c1.isFilled());

        assertEquals(3.0, c2.getRadius());

        assertEquals(1.0, c3.getRadius());

        c3.setRadius(4.0);
        assertEquals(4.0, c3.getRadius());

        assertEquals(Math.PI * 25, c1.getArea());
        assertEquals(2 * Math.PI * 5, c1.getPerimeter());

        assertEquals("Circle[Shape[ color: blue filled: true],radius=5.0]", c1.toString());
    }
}
