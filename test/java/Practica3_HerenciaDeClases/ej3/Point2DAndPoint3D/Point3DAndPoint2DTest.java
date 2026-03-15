package Practica3_HerenciaDeClases.ej3.Point2DAndPoint3D;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Point3DAndPoint2DTest {
    @Test
    void testPoint2D() {
            // Validacion del constructor con parametros y getters de Point2D
            Point2D p2 = new Point2D(1.5f, 2.5f);
            assertEquals(1.5f, p2.getX(), 0.001f);
            assertEquals(2.5f, p2.getY(), 0.001f);

            // Forzamos el uso del constructor por defecto para cobertura total
            Point2D p2Default = new Point2D();
            assertEquals(0.0f, p2Default.getX(), 0.001f);
            assertEquals(0.0f, p2Default.getY(), 0.001f);

            // Comprobamos los setters individuales
            p2.setX(4.0f);
            p2.setY(5.0f);
            assertEquals(4.0f, p2.getX(), 0.001f);
            assertEquals(5.0f, p2.getY(), 0.001f);

            // Verificamos el metodo setXY y la devolucion del array
            p2.setXY(10.0f, 20.0f);
            assertArrayEquals(new float[]{10.0f, 20.0f}, p2.getXY(), 0.001f);

            // Validacion del formato de salida del metodo toString()
            assertEquals("(10.0,20.0)", p2.toString());
        }

        @Test
        void testPoint3D() {
            // Verificacion de la herencia y el constructor de tres parametros
            Point3D p3 = new Point3D(1.0f, 2.0f, 3.0f);
            assertEquals(1.0f, p3.getX(), 0.001f);
            assertEquals(2.0f, p3.getY(), 0.001f);
            assertEquals(3.0f, p3.getZ(), 0.001f);

            // Forzamos el constructor por defecto de Point3D
            Point3D p3Default = new Point3D();
            assertEquals(0.0f, p3Default.getZ(), 0.001f);

            // Comprobamos el setter de la nueva coordenada Z
            p3.setZ(9.9f);
            assertEquals(9.9f, p3.getZ(), 0.001f);

            // Validacion de la actualizacion con setXYZ
            p3.setXYZ(4.0f, 5.0f, 6.0f);
            assertEquals(6.0f, p3.getZ(), 0.001f);

            // Comprobamos que getXYZ devuelve un array de tamaño 3 correcto
            float[] esperado = {4.0f, 5.0f, 6.0f};
            assertArrayEquals(esperado, p3.getXYZ(), 0.001f);

            // Aseguramos que el toString incluya la coordenada Z
            assertEquals("(4.0,5.0,6.0)", p3.toString());

    }
}

