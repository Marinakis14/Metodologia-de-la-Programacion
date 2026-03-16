package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej4.MovablePointYMovableCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {

    @Test
    void TestConstructorsAndMovement() {

        MovablePoint p = new MovablePoint(5, 5, 1, 1);

        // toString inicial
        assertEquals("(5,5),speed=(1,1)", p.toString());

        // moveUp
        p.moveUp();
        assertEquals("(5,4),speed=(1,1)", p.toString());

        // moveDown
        p.moveDown();
        assertEquals("(5,5),speed=(1,1)", p.toString());

        // moveRight
        p.moveRight();
        assertEquals("(6,5),speed=(1,1)", p.toString());

        // moveLeft
        p.moveLeft();
        assertEquals("(5,5),speed=(1,1)", p.toString());
    }
}