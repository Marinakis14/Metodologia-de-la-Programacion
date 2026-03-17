package Practica3_HerenciaDeClases.ej5;

import Practica3_HerenciaDeClases.ej5.ShapeAndSubclases.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Circle c1 = new Circle();
        Circle c2 = new Circle(3.0);
        Circle c3 = new Circle(5.0, "blue", true);

        assertEquals(1.0, c1.getRadius());
        assertEquals(3.0, c2.getRadius());
        assertEquals(5.0, c3.getRadius());

        c1.setRadius(4.0);
        assertEquals(4.0, c1.getRadius());

        assertEquals(Math.PI * 25, c3.getArea());
        assertEquals(2 * Math.PI * 5, c3.getPerimeter());

        assertEquals("Circle[Shape[ color: blue filled: true],radius=5.0]", c3.toString());
    }
}
