package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for Rectangle class to ensure 100% code coverage
 */
public class RectangleTest {

    @Test
    void testConstructorsAndGetters() {
        // 1. Test constructor por defecto (1.0 x 1.0)
        Rectangle r1 = new Rectangle();
        assertEquals(1.0, r1.getWidth());
        assertEquals(1.0, r1.getLength());
        assertEquals("red", r1.getColor()); // Valor por defecto de Shape
        assertTrue(r1.isFilled());

        // 2. Test constructor con dimensiones
        Rectangle r2 = new Rectangle(2.5, 4.0);
        assertEquals(2.5, r2.getWidth());
        assertEquals(4.0, r2.getLength());

        // 3. Test constructor completo (dimensiones + atributos de Shape)
        Rectangle r3 = new Rectangle(3.0, 5.0, "green", false);
        assertEquals(3.0, r3.getWidth());
        assertEquals(5.0, r3.getLength());
        assertEquals("green", r3.getColor());
        assertFalse(r3.isFilled());
    }

    @Test
    void testSetters() {
        Rectangle r = new Rectangle();
        r.setWidth(10.5);
        r.setLength(20.5);
        assertEquals(10.5, r.getWidth());
        assertEquals(20.5, r.getLength());
    }

    @Test
    void testAreaAndPerimeter() {
        Rectangle r = new Rectangle(2.0, 3.0);

        // Área: width * length = 2 * 3 = 6
        assertEquals(6.0, r.getArea(), 0.001);

        // Perímetro: 2 * (width + length) = 2 * (2 + 3) = 10
        assertEquals(10.0, r.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(1.0, 2.0, "yellow", true);
        String result = r.toString();

        // Verificamos que el formato sea el correcto y contenga los datos
        assertTrue(result.startsWith("Rectangle["));
        assertTrue(result.contains("width=1.0"));
        assertTrue(result.contains("length=2.0"));
        assertTrue(result.contains("yellow"));
    }
}