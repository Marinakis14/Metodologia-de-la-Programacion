package Practica1_Clases.ej2.ClaseCircle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void getRadius() {
        Circle c1 = new Circle(); // constructor por defecto
        assertEquals(1.0, c1.getRadius());

        Circle c2 = new Circle(5.0); // constructor con radio
        assertEquals(5.0, c2.getRadius());
    }

    @Test
    void setRadius() {
        Circle c = new Circle();
        c.setRadius(10.0);
        assertEquals(10.0, c.getRadius());
    }

    @Test
    void getArea() {
        Circle c = new Circle(2.0);
        assertEquals(Math.PI * 4, c.getArea(), 0.0001);
    }

    @Test
    void getCircumference() {
        Circle c = new Circle(3.0);
        assertEquals(2 * Math.PI * 3.0, c.getCircumference(), 0.0001);
    }

    @Test
    void testToString() {
        Circle c = new Circle(2.0);
        assertEquals("Circle[radius=2.0]", c.toString());
    }
}