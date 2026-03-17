package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for Circle class to ensure 100% code coverage
 */
public class CircleTest {

    @Test
    void testConstructorsAndGetters() {
        // Test constructor por defecto
        Circle c1 = new Circle();
        assertEquals(1.0, c1.getRadius(), 0.001);
        assertEquals("red", c1.getColor()); // Heredado de Shape
        assertTrue(c1.isFilled());

        // Test constructor con radio
        Circle c2 = new Circle(5.5);
        assertEquals(5.5, c2.getRadius());

        // Test constructor completo
        Circle c3 = new Circle(2.0, "blue", false);
        assertEquals(2.0, c3.getRadius());
        assertEquals("blue", c3.getColor());
        assertFalse(c3.isFilled());
    }

    @Test
    void testSetters() {
        Circle c = new Circle();
        c.setRadius(10.0);
        assertEquals(10.0, c.getRadius());
    }

    @Test
    void testAreaAndPerimeter() {
        double radius = 2.0;
        Circle c = new Circle(radius);

        // Área: PI * r^2
        double expectedArea = Math.PI * radius * radius;
        assertEquals(expectedArea, c.getArea(), 0.0001);

        // Perímetro: 2 * PI * r
        double expectedPerimeter = 2 * Math.PI * radius;
        assertEquals(expectedPerimeter, c.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(1.0, "red", true);
        String result = c.toString();

        // Verificamos que contenga la info de la clase padre y la propia
        assertTrue(result.contains("Circle"));
        assertTrue(result.contains("radius=1.0"));
        assertTrue(result.contains("red"));
    }
}