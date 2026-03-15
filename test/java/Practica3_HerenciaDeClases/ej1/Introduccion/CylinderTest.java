package Practica3_HerenciaDeClases.ej1.Introduccion;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void testConstructorsAndGettersSetters() {
        // Test constructor por defecto (radio=1.0, color="red", height=1.0)
        Cylinder c1 = new Cylinder();
        assertEquals(1.0, c1.getRadius(), 0.01);
        assertEquals("red", c1.getColor());
        assertEquals(1.0, c1.getHeight(), 0.01);

        // Este prueba la llamada a super(radius)
        double radioTest = 5.5;
        Cylinder c2 = new Cylinder(radioTest);
        assertEquals(radioTest, c2.getRadius(), 0.01); // Comprueba que super(radius) funcionó
        assertEquals(1.0, c2.getHeight(), 0.01); // La altura debe ser la de defecto
    }

    @Test
    void testFullConstructor() {
        // Test constructor con todos los parámetros (radio, altura, color)
        Cylinder c3 = new Cylinder(2.0, 10.0, "blue");
        assertEquals(2.0, c3.getRadius(), 0.01);
        assertEquals(10.0, c3.getHeight(), 0.01);
        assertEquals("blue", c3.getColor());
    }

    @Test
    void testSetters() {
        Cylinder c = new Cylinder();
        c.setHeight(20.5);
        assertEquals(20.5, c.getHeight(), 0.01);
    }

    @Test
    void testVolume() {
        // Comprobamos el cálculo del volumen: AreaBase * Altura
        double r = 2.0;
        double h = 5.0;
        Cylinder c = new Cylinder(r, h);

        // El volumen esperado usando la fórmula de la clase padre getArea()
        double expectedVolume = (Math.PI * r * r) * h;
        assertEquals(expectedVolume, c.getVolume(), 0.01);
    }

    @Test
    void testToString() {
        Cylinder c = new Cylinder(1.0, 2.0, "yellow");
        assertEquals("Cylinder: subclass of Circle[radius=1.0 color=yellow] height=2.0",c.toString());
    }

    @Test
    void testGetArea() {
        Cylinder c = new Cylinder(1,1,"blue");
        assertEquals(12.56637,c.getArea(),0.0001);
    }
}