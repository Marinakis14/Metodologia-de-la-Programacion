package Practica3_HerenciaDeClases.ej4.PointAndMovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PointTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Point p = new Point(3.0f,5.0f);
        Point q = new Point();
        assertEquals("(3.0,5.0)",p.toString());
        p.setX(2.0f);
        p.setY(4.0f);
        assertEquals(2.0,p.getX());
        assertEquals(4.0,p.getY());
        p.setXY(9.0f,8.0f);
        assertArrayEquals(new float[]{9.0f, 8.0f},p.getXY());

    }
}