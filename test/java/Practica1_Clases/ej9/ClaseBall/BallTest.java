package Practica1_Clases.ej9.ClaseBall;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BallTest {

    @Test
    void getX() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        assertEquals(1.5f, ball.getX());
    }

    @Test
    void getY() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        assertEquals(2.5f, ball.getY());
    }

    @Test
    void getRadius() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        assertEquals(10, ball.getRadius());
    }

    @Test
    void getXDelta() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        assertEquals(0.5f, ball.getXDelta());
    }

    @Test
    void getYDelta() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        assertEquals(1.0f, ball.getYDelta());
    }

    @Test
    void setX() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        ball.setX(3.0f);
        assertEquals(3.0f, ball.getX());
    }

    @Test
    void setY() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        ball.setY(4.0f);
        assertEquals(4.0f, ball.getY());
    }

    @Test
    void setRadius() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        ball.setRadius(20);
        assertEquals(20, ball.getRadius());
    }

    @Test
    void setXDelta() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        ball.setXDelta(1.5f);
        assertEquals(1.5f, ball.getXDelta());
    }

    @Test
    void setYDelta() {
        Ball ball = new Ball(1.5f, 2.5f, 10, 0.5f, 1.0f);
        ball.setYDelta(2.5f);
        assertEquals(2.5f, ball.getYDelta());
    }

    @Test
    void move() {
        Ball ball = new Ball(1.0f, 2.0f, 10, 0.5f, 1.0f);
        ball.move();
        assertEquals(1.5f, ball.getX());
        assertEquals(3.0f, ball.getY());

        ball.move();
        assertEquals(2.0f, ball.getX());
        assertEquals(4.0f, ball.getY());
    }

    @Test
    void reflectHorizontal() {
        Ball ball = new Ball(1.0f, 2.0f, 10, 0.5f, 1.0f);
        ball.reflectHorizontal();
        assertEquals(-0.5f, ball.getXDelta());
        assertEquals(1.0f, ball.getYDelta());
    }

    @Test
    void reflectVertical() {
        Ball ball = new Ball(1.0f, 2.0f, 10, 0.5f, 1.0f);
        ball.reflectVertical();
        assertEquals(0.5f, ball.getXDelta());
        assertEquals(-1.0f, ball.getYDelta());
    }

    @Test
    void testToString() {
        Ball ball = new Ball(1.0f, 2.0f, 10, 0.5f, 1.0f);
        String expected = "Ball[(1.0,2.0),speed=(0.5,1.0)]";
        assertEquals(expected, ball.toString());
    }
}