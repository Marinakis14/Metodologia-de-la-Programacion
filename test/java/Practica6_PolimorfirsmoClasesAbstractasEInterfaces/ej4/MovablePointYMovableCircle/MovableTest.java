package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej4.MovablePointYMovableCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableTest {

    @Test
    void TestMovablePolymorphism() {

        Movable m = new MovablePoint(0, 0, 1, 1);

        m.moveUp();
        m.moveRight();
        m.moveDown();
        m.moveLeft();

        // comprobamos la posición final
        assertEquals("(0.0,0.0),speed=(1.0,1.0)", m.toString());
    }
}