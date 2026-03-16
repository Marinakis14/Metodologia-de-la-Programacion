package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej2.GeometricObjectYSuImplementacionEnLasClasesCircleYRectagle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void TestConstructorsAndMethods() {

        Rectangle r = new Rectangle(4.0, 6.0);

        // Area
        assertEquals(24.0, r.getArea());

        // Perimeter
        assertEquals(20.0, r.getPerimeter());

        // toString
        assertEquals(
                "Rectangle[width=4.0, length=6.0]",
                r.toString()
        );

        // Polymorphism test
        GeometricObject g = new Rectangle(4.0, 6.0);

        assertEquals(24.0, g.getArea());
        assertEquals(20.0, g.getPerimeter());
    }
}