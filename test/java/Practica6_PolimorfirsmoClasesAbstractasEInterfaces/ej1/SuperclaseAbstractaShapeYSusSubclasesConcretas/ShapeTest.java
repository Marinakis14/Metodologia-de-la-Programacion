package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {

    @Test
    void testShapeMethods() {
        // Creamos una clase anónima de Shape
        Shape s = new Shape("green", false) {
            public double getArea() { return 0; }
            public double getPerimeter() { return 0; }
        };

        // 1. Probar Constructor y Getters
        assertEquals("green", s.getColor());
        assertFalse(s.isFilled());

        // 2. Probar Setters
        s.setColor("black");
        s.setFilled(true);
        assertEquals("black", s.getColor());
        assertTrue(s.isFilled());

        // 3. Probar toString
        assertEquals("Shape[color=black,filled=true]", s.toString());
    }

    @Test
    void testDefaultConstructor() {
        // Probamos también el constructor vacío
        Shape sDefault = new Shape() {
            public double getArea() { return 0; }
            public double getPerimeter() { return 0; }
        };

        assertEquals("red", sDefault.getColor());
        assertTrue(sDefault.isFilled());
    }
}