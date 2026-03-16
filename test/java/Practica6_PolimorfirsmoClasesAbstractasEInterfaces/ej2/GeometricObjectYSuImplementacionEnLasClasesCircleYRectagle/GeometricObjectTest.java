package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej2.GeometricObjectYSuImplementacionEnLasClasesCircleYRectagle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeometricObjectTest {

    @Test
    void TestPolymorphism() {

        GeometricObject g = new Circle(5.0);

        assertEquals(Math.PI * 25, g.getArea());
        assertEquals(2 * Math.PI * 5, g.getPerimeter());
    }
}