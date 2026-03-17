package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for Square class to ensure 100% code coverage.
 * Focuses on the synchronization between side, width, and length.
 */
public class SquareTest {

    @Test
    void testConstructors() {
        // 1. Test constructor por defecto
        Square s1 = new Square();
        assertEquals(1.0, s1.getSide());
        assertEquals(1.0, s1.getWidth());
        assertEquals(1.0, s1.getLength());

        // 2. Test constructor con lado
        Square s2 = new Square(5.0);
        assertEquals(5.0, s2.getSide());
        assertEquals(5.0, s2.getWidth());
        assertEquals(5.0, s2.getLength());

        // 3. Test constructor completo (herencia de Shape)
        Square s3 = new Square(2.0, "purple", false);
        assertEquals(2.0, s3.getSide());
        assertEquals("purple", s3.getColor());
        assertFalse(s3.isFilled());
    }

    @Test
    void testSideSynchronization() {
        Square s = new Square();

        // Probar setSide: debe cambiar ambos
        s.setSide(10.0);
        assertEquals(10.0, s.getWidth());
        assertEquals(10.0, s.getLength());

        // Probar setWidth: debe cambiar el largo también
        s.setWidth(15.0);
        assertEquals(15.0, s.getSide());
        assertEquals(15.0, s.getLength());

        // Probar setLength: debe cambiar el ancho también
        s.setLength(20.0);
        assertEquals(20.0, s.getSide());
        assertEquals(20.0, s.getWidth());
    }

    @Test
    void testAreaAndPerimeter() {
        Square s = new Square(4.0);
        // Area: 4 * 4 = 16
        assertEquals(16.0, s.getArea(), 0.001);
        // Perimeter: 4 * 4 = 16
        assertEquals(16.0, s.getPerimeter(), 0.001);
    }

    @Test
    void testToString() {
        Square s = new Square(3.0);
        String result = s.toString();

        // Verificamos la estructura de anidación: Square[Rectangle[Shape[...]]]
        assertTrue(result.startsWith("Square[Rectangle["));
        assertTrue(result.contains("width=3.0"));
        assertTrue(result.contains("length=3.0"));
    }
}