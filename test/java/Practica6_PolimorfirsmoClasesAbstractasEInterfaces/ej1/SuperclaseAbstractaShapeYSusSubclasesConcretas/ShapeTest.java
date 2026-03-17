package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for Shape class to ensure 100% code coverage
 */
public class ShapeTest {

    // Clase interna para poder instanciar y probar la lógica de Shape
    class TestShape extends Shape {
        public TestShape() { super(); }
        public TestShape(String c, boolean f) { super(c, f); }
        @Override public double getArea() { return 0; }
        @Override public double getPerimeter() { return 0; }
    }

    @Test
    void testDefaultConstructor() {
        Shape s = new TestShape();
        assertEquals("red", s.getColor());
        assertTrue(s.isFilled());
    }

    @Test
    void testParameterizedConstructor() {
        Shape s = new TestShape("blue", false);
        assertEquals("blue", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void testSettersAndGetters() {
        Shape s = new TestShape();
        s.setColor("green");
        s.setFilled(false);

        assertEquals("green", s.getColor());
        assertFalse(s.isFilled());
    }

    @Test
    void testToString() {
        Shape s = new TestShape("yellow", true);
        String expected = "Shape[color=yellow,filled=true]";
        assertEquals(expected, s.toString());
    }
}