package Practica3_HerenciaDeClases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        // Constructor con todos los parámetros
        Rectangle r1 = new Rectangle(4.0, 6.0, "green", false);
        assertEquals(4.0, r1.getWidth());
        assertEquals(6.0, r1.getLength());
        assertEquals("green", r1.getColor());
        assertFalse(r1.isFilled());

        // Constructor con width y length
        Rectangle r2 = new Rectangle(2.0, 3.0);
        assertEquals(2.0, r2.getWidth());
        assertEquals(3.0, r2.getLength());

        // Constructor por defecto
        Rectangle r3 = new Rectangle();
        assertEquals(1.0, r3.getWidth());
        assertEquals(1.0, r3.getLength());

        // Setters
        r3.setWidth(5.0);
        r3.setLength(7.0);

        assertEquals(5.0, r3.getWidth());
        assertEquals(7.0, r3.getLength());

        // Área
        assertEquals(24.0, r1.getArea());

        // Perímetro
        assertEquals(20.0, r1.getPerimeter());

        // toString (adaptado al formato de Shape)
        assertEquals(
                "Rectangle[Shape[ color: green filled: false],width=4.0,length=6.0]",
                r1.toString()
        );
    }
}