package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej3.MovableYSuImplementaciónEnLaClaseMovablePoint;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit Test for MovablePoint to ensure all movements and state
 * transitions are correctly implemented.
 */
public class MovablePointTest {

    @Test
    void testConstructorAndToString() {
        // Crear punto en (0,0) con velocidad (5,10)
        MovablePoint p = new MovablePoint(0, 0, 5, 10);

        // Verificar que el toString tiene el formato solicitado
        String expected = "(0,0), speed=(5,10)";
        assertEquals(expected, p.toString());
    }

    @Test
    void testMoveUp() {
        MovablePoint p = new MovablePoint(0, 0, 5, 10);
        p.moveUp();

        assertEquals(10, p.y);
        assertEquals(0, p.x); // X no debe cambiar
    }

    @Test
    void testMoveDown() {
        MovablePoint p = new MovablePoint(0, 0, 5, 10);
        p.moveDown();

        assertEquals(-10, p.y);
    }

    @Test
    void testMoveLeft() {
        MovablePoint p = new MovablePoint(0, 0, 5, 10);
        p.moveLeft();

        assertEquals(-5, p.x);
    }

    @Test
    void testMoveRight() {
        MovablePoint p = new MovablePoint(0, 0, 5, 10);
        p.moveRight();

        assertEquals(5, p.x);
    }

    @Test
    void testCombinedMovement() {
        // Test de movimiento diagonal o múltiple
        MovablePoint p = new MovablePoint(10, 10, 2, 2);
        p.moveUp();    // y = 12
        p.moveRight(); // x = 12

        assertEquals(12, p.x);
        assertEquals(12, p.y);
    }
}