package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej2.GeometricObjectYSuImplementacionEnLasClasesCircleYRectagle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @Test
    void TestConstructorsAndMethods() {

        Circle c = new Circle(5.0);

        assertEquals(Math.PI * 25, c.getArea());
        assertEquals(2 * Math.PI * 5, c.getPerimeter());
        assertEquals("Circle[radius=5.0]", c.toString());
    }
}