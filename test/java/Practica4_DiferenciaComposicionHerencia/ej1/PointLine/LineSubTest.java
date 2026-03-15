package Practica4_DiferenciaComposicionHerencia.ej1.PointLine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LineSubTest {

    @Test
    void TestConstructorsAndSettersGetters() {

        LineSub l1 = new LineSub(2,2,4,5);
        MyPoint p1 = new MyPoint(1,1);
        MyPoint p2 = new MyPoint(6,3);
        LineSub l2 = new LineSub(p1,p2);
        assertEquals("LineSub[begin=(1,1), end=(6,3)]",l2.toString());
        l1.setBeginX(3);
        l1.setBeginY(3);
        l1.setEndX(1);
        l1.setEndY(2);
        assertEquals(3,l1.getBeginX());
        assertEquals(3,l1.getBeginY());
        assertEquals(1,l1.getEndX());
        assertEquals(2,l1.getEndY());
        l2.setBeginXY(7,7);
        l2.setEndXY(8,8);
        assertEquals("LineSub[begin=(7,7), end=(8,8)]",l2.toString());
        l1.setBegin(p1);
        l1.setEnd(p2);
        assertEquals("LineSub[begin=(1,1), end=(8,8)]",l1.toString());
        assertArrayEquals(new int[]{1,1}, l1.getBegin().getXY());
        assertArrayEquals(new int[]{8,8}, l1.getEnd().getXY());

    }

    @Test
    void TestOtherMethods() {

        LineSub l1 = new LineSub(2,2,4,5);
        assertEquals(3.60555,l1.getLength(),0.0001);
        assertEquals(0.98279,l1.getGradient(),0.0001);

    }

}