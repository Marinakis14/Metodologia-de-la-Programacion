package Practica1_Clases.ej3.ClaseRectangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void getLength() {
        Rectangle r1 = new Rectangle(); // constructor por defecto
        assertEquals(1.0f, r1.getLength());

        Rectangle r2 = new Rectangle(5.0f, 3.0f); // constructor con parámetros
        assertEquals(5.0f, r2.getLength());
    }

    @Test
    void setLength() {
        Rectangle r = new Rectangle();
        r.setLength(10.0f);
        assertEquals(10.0f, r.getLength());
    }

    @Test
    void getWidth() {
        Rectangle r1 = new Rectangle();
        assertEquals(1.0f, r1.getWidth());

        Rectangle r2 = new Rectangle(5.0f, 3.0f);
        assertEquals(3.0f, r2.getWidth());
    }

    @Test
    void setWidth() {
        Rectangle r = new Rectangle();
        r.setWidth(7.0f);
        assertEquals(7.0f, r.getWidth());
    }

    @Test
    void getArea() {
        Rectangle r = new Rectangle(4.0f, 3.0f);
        assertEquals(12.0, r.getArea(), 0.0001);
    }

    @Test
    void getPerimeter() {
        Rectangle r = new Rectangle(4.0f, 3.0f);
        assertEquals(14.0, r.getPerimeter(), 0.0001);
    }

    @Test
    void testToString() {
        Rectangle r = new Rectangle(2.0f, 5.0f);
        assertEquals("Rectangle[length=2.0,width=5.0]", r.toString());
    }
}