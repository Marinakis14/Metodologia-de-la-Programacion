package Practica4_DiferenciaComposicionHerencia.ej2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        // Constructor con radius, height y color
        Cylinder c1 = new Cylinder(2.0, 5.0, "blue");
        assertEquals(5.0, c1.getHeight());
        assertEquals(2.0, c1.getBase().getRadius());
        assertEquals("blue", c1.getBase().getColor());

        // Constructor con radius y height
        Cylinder c2 = new Cylinder(3.0, 4.0);
        assertEquals(4.0, c2.getHeight());
        assertEquals(3.0, c2.getBase().getRadius());

        // Constructor solo con height
        Cylinder c3 = new Cylinder(6.0);
        assertEquals(6.0, c3.getHeight());
        assertEquals(1.0, c3.getBase().getRadius());

        // Constructor por defecto
        Cylinder c4 = new Cylinder();
        assertEquals(1.0, c4.getHeight());
        assertEquals(1.0, c4.getBase().getRadius());

        // setHeight
        c4.setHeight(10.0);
        assertEquals(10.0, c4.getHeight());

        // setBase
        Circle newBase = new Circle(4.0, "green");
        c4.setBase(newBase);

        assertEquals(4.0, c4.getBase().getRadius());
        assertEquals("green", c4.getBase().getColor());

        // Volume
        assertEquals(Math.PI * 4 * 4 * 5, c1.getVolume());

        // toString
        assertEquals(
                "Cylinder[base=Circle[radius=2.0,color=blue],height=5.0]",
                c1.toString()
        );
    }
}