package Practica3_HerenciaDeClases.ej5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        // Constructor con todos los parámetros
        Square s1 = new Square(4.0, "yellow", true);
        assertEquals(4.0, s1.getSide());
        assertEquals(4.0, s1.getWidth());
        assertEquals(4.0, s1.getLength());
        assertEquals("yellow", s1.getColor());
        assertTrue(s1.isFilled());

        // Constructor con side
        Square s2 = new Square(3.0);
        assertEquals(3.0, s2.getSide());
        assertEquals(3.0, s2.getWidth());
        assertEquals(3.0, s2.getLength());

        // Constructor por defecto
        Square s3 = new Square();
        assertEquals(1.0, s3.getWidth());
        assertEquals(1.0, s3.getLength());

        // setSide
        s3.setSide(5.0);
        assertEquals(5.0, s3.getWidth());
        assertEquals(5.0, s3.getLength());
        assertEquals(5.0, s3.getSide());

        // setWidth (override)
        s3.setWidth(6.0);
        assertEquals(6.0, s3.getWidth());
        assertEquals(6.0, s3.getLength());

        // setLength (override)
        s3.setLength(7.0);
        assertEquals(7.0, s3.getWidth());
        assertEquals(7.0, s3.getLength());

        // toString
        assertEquals(
                "Square[Rectangle[Shape[ color: yellow filled: true],width=4.0,length=4.0]]",
                s1.toString()
        );
    }
}