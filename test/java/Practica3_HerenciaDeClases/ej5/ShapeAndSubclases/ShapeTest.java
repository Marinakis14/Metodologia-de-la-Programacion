package Practica3_HerenciaDeClases.ej5.ShapeAndSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Shape s1 = new Shape("blue", false);
        Shape s2 = new Shape();

        assertEquals("blue", s1.getColor());
        assertFalse(s1.isFilled());

        assertEquals("red", s2.getColor());
        assertTrue(s2.isFilled());

        s2.setColor("green");
        s2.setFilled(false);

        assertEquals("green", s2.getColor());
        assertFalse(s2.isFilled());

        assertEquals("Shape[ color: blue filled: false]", s1.toString());
    }
}