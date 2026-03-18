package Practica2_ComposicionAgregacion.ej8.MyCircle;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircleTest {

    @Test
    void testConstructorsAndGettersSetters() {
        // Test constructor vacio
        MyCircle c0 = new MyCircle();
        assertEquals(1, c0.getRadius());

        // Test constructor con coordenadas int y radio int
        MyCircle c1 = new MyCircle(6, 6, 3);
        assertEquals(6, c1.getCenterX());
        assertEquals(6, c1.getCenterY());

        // Test constructor con centro MyPoint y radio int
        MyPoint p1 = new MyPoint(1, 1);
        MyCircle c2 = new MyCircle(p1, 4);
        assertEquals(p1, c2.getCenter());

        // Test setters y getters que faltan
        MyPoint p3 = new MyPoint(10, 10);
        c2.setCenter(p3);
        assertEquals(10, c2.getCenterX());
        c2.setCenterXY(12, 14);
        assertArrayEquals(new int[]{12, 14}, c2.getCenterXY());
        c2.setRadius(4);
        assertEquals(4, c2.getRadius());
        c2.setCenterX(13);
        c2.setCenterY(9);
        assertArrayEquals(new int[]{13, 9}, c2.getCenterXY());

    }

    @Test
    void testGetArea() {
        MyCircle c = new MyCircle();
        assertEquals(Math.PI, c.getArea(), 0.001);
    }

    @Test
    void testGetCircumference() {
        MyCircle c = new MyCircle();
        assertEquals(Math.PI * 2, c.getCircumference(), 0.001);
    }

    @Test
    void testDistance() {
        MyCircle c1 = new MyCircle(5, 5, 1);
        MyCircle c2 = new MyCircle(7, 7, 1);
        assertEquals(Math.sqrt(8), c1.distance(c2), 0.001);
    }

    @Test
    void testToString() {
        MyCircle c = new MyCircle(3, 5, 8);
        assertEquals("MyCircle[radius=8,center=(3,5)]", c.toString());
    }
}