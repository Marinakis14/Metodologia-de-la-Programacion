package Practica2_ComposicionAgregacion.ej6.MyPoint;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {

    @Test
    void testConstructorsAndGetters() {
        // Test constructor por defecto (0,0)
        MyPoint p1 = new MyPoint();
        assertEquals(0, p1.getX());
        assertEquals(0, p1.getY());

        // Test constructor con parámetros
        MyPoint p2 = new MyPoint(5, 10);
        assertEquals(5, p2.getX());
        assertEquals(10, p2.getY());
    }

    @Test
    void testSetters() {
        MyPoint p = new MyPoint();
        p.setX(8);
        p.setY(15);
        assertEquals(8, p.getX());
        assertEquals(15, p.getY());

        p.setXY(20, 30);
        assertEquals(20, p.getX());
        assertEquals(30, p.getY());
    }

    @Test
    void testGetXY() {
        MyPoint p = new MyPoint(3, 7);
        int[] expected = {3, 7};
        // Importante: usar assertArrayEquals para comparar el contenido del array
        assertArrayEquals(expected, p.getXY());
    }

    @Test
    void testToString() {
        MyPoint p = new MyPoint(1, 2);
        assertEquals("(1,2)", p.toString());
    }

    @Test
    void testDistanceXY() {
        // Distancia entre (0,0) y (3,4) debe ser 5.0 (triángulo pitagórico)
        MyPoint p = new MyPoint(0, 0);
        assertEquals(5.0, p.distance(3, 4), 0.001);
    }

    @Test
    void testDistanceAnotherPoint() {
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(4, 5);
        // Distancia: sqrt((4-1)^2 + (5-1)^2) = sqrt(3^2 + 4^2) = 5.0
        assertEquals(5.0, p1.distance(p2), 0.001);
    }

    @Test
    void testDistanceOrigin() {
        MyPoint p = new MyPoint(3, 4);
        // Distancia al origen (0,0)
        assertEquals(5.0, p.distance(), 0.001);
    }
}