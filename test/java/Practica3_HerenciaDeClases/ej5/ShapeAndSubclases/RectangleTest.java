package Practica3_HerenciaDeClases.ej5;

import Practica3_HerenciaDeClases.ej5.ShapeAndSubclases.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(2.0, 3.0);
        Rectangle r3 = new Rectangle(4.0, 6.0, "green", false);

        assertEquals(1.0, r1.getWidth());
        assertEquals(1.0, r1.getLength());

        assertEquals(2.0, r2.getWidth());
        assertEquals(3.0, r2.getLength());

        assertEquals(4.0, r3.getWidth());
        assertEquals(6.0, r3.getLength());

        r1.setWidth(5.0);
        r1.setLength(7.0);

        assertEquals(5.0, r1.getWidth());
        assertEquals(7.0, r1.getLength());

        assertEquals(24.0, r3.getArea());
        assertEquals(20.0, r3.getPerimeter());

        assertEquals(
                "Rectangle[Shape[ color: green filled: false],width=4.0,length=6.0]",
                r3.toString()
        );
    }
}