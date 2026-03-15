package Practica2_ComposicionAgregacion.ej7.MyLine;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {

    @Test
    void testConstructorsAndGettersSetters() {
        // Test constructor con coordenadas int
        MyLine l1 = new MyLine(0, 0, 3, 4);
        assertEquals(0, l1.getBeginX());
        assertEquals(4, l1.getEndY());

        // Test constructor con objetos MyPoint
        MyPoint p1 = new MyPoint(1, 1);
        MyPoint p2 = new MyPoint(2, 2);
        MyLine l2 = new MyLine(p1, p2);
        assertEquals(p1, l2.getBegin());
        assertEquals(p2, l2.getEnd());

        // Test Setters de objetos
        MyPoint p3 = new MyPoint(10, 10);
        MyPoint p4 = new MyPoint(12,14);
        l2.setBegin(p3);
        l2.setEnd(p4);
        assertEquals(10, l2.getBeginX());
        assertEquals(12,l2.getEndX());
    }

    @Test
    void testCoordinateGettersAndSetters() {
        MyLine l = new MyLine(0, 0, 1, 1);

        l.setBeginX(10);
        l.setBeginY(20);
        l.setEndX(30);
        l.setEndY(40);

        assertEquals(10, l.getBeginX());
        assertEquals(20, l.getBeginY());
        assertEquals(30, l.getEndX());
        assertEquals(40, l.getEndY());
    }

    @Test
    void testXYArrays() {
        MyLine l = new MyLine(5, 5, 10, 10);

        // Test getXY
        assertArrayEquals(new int[]{5, 5}, l.getBeginXY());
        assertArrayEquals(new int[]{10, 10}, l.getEndXY());

        // Test setXY
        l.setBeginXY(0, 0);
        l.setEndXY(3, 4);
        assertArrayEquals(new int[]{0, 0}, l.getBeginXY());
        assertEquals(3, l.getEndX());
    }

    @Test
    void testGetLength() {
        // Línea de (0,0) a (3,4) debe medir 5.0
        MyLine l = new MyLine(0, 0, 3, 4);
        assertEquals(5.0, l.getLength(), 0.001);
    }

    @Test
    void testGetGradient() {
        // Línea a 45 grados (1,1) -> (2,2)
        MyLine l = new MyLine(1, 1, 2, 2);
        // atan2(1, 1) es PI/4
        assertEquals(Math.PI / 4, l.getGradient(), 0.001);
    }

    @Test
    void testToString() {
        MyLine l = new MyLine(1, 2, 3, 4);
        // Ajustado al formato exacto de tu metodo toString
        assertEquals("MyLine[begin= (1,2) , end= (3, 4)]", l.toString());
    }
}