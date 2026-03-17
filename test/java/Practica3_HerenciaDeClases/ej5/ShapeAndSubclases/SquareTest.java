package Practica3_HerenciaDeClases.ej5;

import Practica3_HerenciaDeClases.ej5.ShapeAndSubclases.Square;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Square s1 = new Square();
        Square s2 = new Square(3.0);
        Square s3 = new Square(4.0, "yellow", true);

        assertEquals(1.0, s1.getWidth());
        assertEquals(1.0, s1.getLength());

        assertEquals(3.0, s2.getSide());
        assertEquals(3.0, s2.getWidth());
        assertEquals(3.0, s2.getLength());

        assertEquals(4.0, s3.getSide());
        assertEquals(4.0, s3.getWidth());
        assertEquals(4.0, s3.getLength());

        s1.setSide(5.0);
        assertEquals(5.0, s1.getSide());
        assertEquals(5.0, s1.getWidth());
        assertEquals(5.0, s1.getLength());

        s1.setWidth(6.0);
        assertEquals(6.0, s1.getWidth());
        assertEquals(6.0, s1.getLength());

        s1.setLength(7.0);
        assertEquals(7.0, s1.getWidth());
        assertEquals(7.0, s1.getLength());

        assertEquals(
                "Square[Rectangle[Shape[ color: yellow filled: true],width=4.0,length=4.0]]",
                s3.toString()
        );
    }
}