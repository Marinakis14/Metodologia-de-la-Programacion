package Practica2_ComposicionAgregacion.ej9.MyTriangle;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

public class TestMyTriangle {

    public static void main(String[] args) {

        //Test Constructors and toString()
        MyTriangle t1 = new MyTriangle(1,1,2,2,2,1);
        MyPoint p1 = new MyPoint(3,2);
        MyPoint p2 = new MyPoint(1,4);
        MyPoint p3 = new MyPoint(5,5);
        MyTriangle t2 = new MyTriangle(p1,p2,p3);
        System.out.println(t1);
        System.out.println(t2);

        //Test additional methods
        System.out.printf("%.2f%n",t1.getPerimeter());
        System.out.println(t1.getType());
        System.out.println(t2.getType());
        //Hemos intentado hacer un ejemplo de triangulo equilatero pero con coordenadas de numeros enteros(int) es imposible ya que se necesitan coordenadas de numeros irracionales

    }

}
