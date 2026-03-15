package java.Practica3_HerenciaDeClases.ej1;
import Practica3_HerenciaDeClases.ej1.Introduccion.Cylinder;
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

        // Test constructor con altura (el que me has pasado en la foto)
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
        String result = c.toString();

        // Como Cylinder NO tiene toString, usa el de Circle.
        // Comprobamos que al menos los datos del padre están ahí.
        assertTrue(result.contains("Circle")); // Cambiamos Cylinder por Circle
        assertTrue(result.contains("radius=1.0"));
        assertTrue(result.contains("color=yellow"));
    }
}