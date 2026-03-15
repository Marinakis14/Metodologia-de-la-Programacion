package Practica2_ComposicionAgregacion.ej8.MyCircle;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

import java.util.Arrays;

public class TestMyCircle {

    public static void main(String[] args) {

        //Test constructors and toString()
        MyCircle c1 = new MyCircle();
        MyCircle c2 = new MyCircle(2, 3, 1);
        MyPoint p1 = new MyPoint(1, 1);
        MyCircle c3 = new MyCircle(p1, 5);
        System.out.println("Circulo 1: " + c1);
        System.out.println("Circulo 2: " + c2);
        System.out.println("Circulo 3: " + c3);

        //Test getters and setters
        c1.setRadius(2);
        System.out.println("radio del circulo 1 modificado: " + c1.getRadius());
        MyPoint p2 = new MyPoint(4, 4);
        c2.setCenter(p2);
        System.out.println("centro del circulo 2 modificado: " + c2.getCenter());
        c3.setCenterX(10);
        System.out.println("coordenada x del centro del circulo 3 modificado: " + c3.getCenterX());
        c3.setCenterY(10);
        System.out.println("coordenada y del centro del circulo 3 modificado: " + c3.getCenterY());
        c3.setCenterXY(5, 5);
        System.out.println("coordenadas x e y del centro del circulo 3 modificado: " + Arrays.toString(c3.getCenterXY()));

        //Test aditional methods
        System.out.printf("area del circulo 1: %.2f%n", c1.getArea());
        System.out.printf("circumferencia del circulo 2: %.2f%n", c2.getCircumference());
        System.out.printf("distancia de los centros del circulo 1 al circulo 3: %.2f%n", c3.distance(c1));

    }

}
