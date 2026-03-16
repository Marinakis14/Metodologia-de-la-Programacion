package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej4.MovablePointYMovableCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

    @Test
    void TestConstructorsAndMovement() {

        MovableCircle c = new MovableCircle(5, 5, 1, 1, 10);

        // toString inicial
        assertEquals("(5,5),speed=(1,1), radius=10", c.toString());

        // moveUp
        c.moveUp();
        assertEquals("(5,6),speed=(1,1), radius=10", c.toString());

        // moveDown
        c.moveDown();
        assertEquals("(5,5),speed=(1,1), radius=10", c.toString());

        // moveRight
        c.moveRight();
        assertEquals("(6,5),speed=(1,1), radius=10", c.toString());

        // moveLeft
        c.moveLeft();
        assertEquals("(5,5),speed=(1,1), radius=10", c.toString());
    }
}