package Practica2_ComposicionAgregacion.ej9.MyTriangle;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyTriangleTest {

    @Test
    void TestConstructorsAndAllOtherClassMethods() {

        //Test constructor con coordenadas int
        MyTriangle t1 = new MyTriangle(1, 1, 2, 2, 2, 1);
        MyPoint p1 = new MyPoint(3, 2);
        MyPoint p2 = new MyPoint(1, 4);
        MyPoint p3 = new MyPoint(5, 5);
        MyTriangle t2 = new MyTriangle(p1, p2, p3);
        assertEquals(3.414213, t1.getPerimeter(), 0.0001);
        assertEquals("The triangle is Scalene", t2.getType());
        assertEquals("MyTriangle[v1=(1,1),v2=(2,2),v3=(2,1)]",t1.toString());
        assertEquals("The triangle is Isosceles", t1.getType());
        //El último caso de que el triangulo sea Equilatero no lo hemos podido probar ya que como hemos mencionado en la clase TestMyTriangle
        //Es imposible generar un triangulo equilatero con coordenadas enteras(int) y es por esto que la cobertura es de un 95% en vez de un 100%

    }
}