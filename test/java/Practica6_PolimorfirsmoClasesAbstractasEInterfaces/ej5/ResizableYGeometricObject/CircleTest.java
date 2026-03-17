package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej5.ResizableYGeometricObject;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for Circle class within the GeometricObject context.
 */
public class CircleTest {

    @Test
    void testConstructorAndGetter() {
        double radius = 5.5;
        Circle c = new Circle(radius);

        // Verificamos que el radio se asigno correctamente
        assertEquals(5.5, c.radius, 0.001);
    }

    @Test
    void testGetArea() {
        double radius = 2.0;
        Circle c = new Circle(radius);

        // Area
        double expectedArea = Math.PI * 2.0 * 2.0;
        assertEquals(expectedArea, c.getArea(), 0.0001);
    }

    @Test
    void testGetPerimeter() {
        double radius = 3.0;
        Circle c = new Circle(radius);

        // Perimetro
        double expectedPerimeter = 2 * Math.PI * 3.0;
        assertEquals(expectedPerimeter, c.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(10.0);
        String result = c.toString();

        // Verificamos el formato exacto que pide el diagrama
        assertEquals("Circle[radius=10.0]", result);
    }
}