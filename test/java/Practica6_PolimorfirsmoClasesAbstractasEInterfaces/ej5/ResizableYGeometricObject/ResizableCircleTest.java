package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej5.ResizableYGeometricObject;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for ResizableCircle to ensure correct resizing logic
 * and inheritance from Circle.
 */
public class ResizableCircleTest {

    @Test
    void testConstructorAndInheritance() {
        // Al crear un ResizableCircle, debe heredar el radio de Circle
        ResizableCircle rc = new ResizableCircle(10.0);
        assertEquals(10.0, rc.radius, 0.001);

        // Debe poder usar métodos de Circle
        assertTrue(rc.getArea() > 0);
    }

    @Test
    void testResizeIncrease() {
        ResizableCircle rc = new ResizableCircle(100.0);

        // Si incrementamos un 10%
        rc.resize(10);
        assertEquals(110.0, rc.radius, 0.001);
    }

    @Test
    void testResizeDecrease() {
        ResizableCircle rc = new ResizableCircle(100.0);

        // Incrementamos un -50% (lo que es una reducción del 50%)
        rc.resize(-50);
        assertEquals(50.0, rc.radius, 0.001);
    }

    @Test
    void testToString() {
        ResizableCircle rc = new ResizableCircle(25.5);
        assertEquals("ResizableCircle[radius=25.5]", rc.toString());
    }
}