package Practica3_HerenciaDeClases.ej4.PointYmovablePoint;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        MovablePoint p = new MovablePoint(3,3,2,2);
        MovablePoint q = new MovablePoint(5,5);
        MovablePoint r = new MovablePoint();
        assertEquals("(3.0,3.0),speed=(2.0,2.0)",p.toString());;
        q.setXSpeed(1);
        q.setYSpeed(1);
        assertEquals(1.0f,q.getXSpeed());
        assertEquals(1.0f,q.getYSpeed());
        r.setSpeed(8,8);
        assertArrayEquals(new float[]{8.0f,8.0f},r.getSpeed());
        assertEquals(new MovablePoint(5.0f,5.0f),p.move());

    }
}