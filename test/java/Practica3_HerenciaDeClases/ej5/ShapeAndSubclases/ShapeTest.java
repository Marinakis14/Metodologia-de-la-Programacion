package Practica3_HerenciaDeClases.ej5.ShapeAndSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        // Constructor con parámetros
        Shape s1 = new Shape("blue", false);
        assertEquals("blue", s1.getColor());
        assertFalse(s1.isFilled());

        // Constructor por defecto
        Shape s2 = new Shape();
        assertEquals("red", s2.getColor());
        assertTrue(s2.isFilled());

        // Setters
        s2.setColor("green");
        s2.setFilled(false);

        assertEquals("green", s2.getColor());
        assertFalse(s2.isFilled());

        // toString
        assertEquals(
                "Shape[ color: blue filled: false]",
                s1.toString()
        );
    }
}