package Practica2_ComposicionAgregacion.ej9.MyTriangle;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

public class MyTriangle {

    //private instance variables
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    //Constructors

    /**
     * Constructs a private MyTriangle instance with the given x1, y1, x2, y2, x3 and y3
     */
    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        this.v1 = new MyPoint(x1, y1);
        this.v2 = new MyPoint(x2, y2);
        this.v3 = new MyPoint(x3, y3);
    }

    /**
     * Constructs a private MyTriangle instance with the given v1, v2 and v3
     */
    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of MyTriangle[v1=(x1,y1),v2=(x2,y2),v3=(x3,y3)]
     */
    public String toString() {
        return "MyTriangle[v1=" + v1.toString() + ",v2=" + v2.toString() + ",v3=" + v3.toString() + "]";
    }

    //Returns the perimeter of this MyTriangle
    public double getPerimeter() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        return side1 + side2 + side3;
    }

    //Returns the tipe of triangle: Equilateral, Isosceles or Scalene
    public String getType() {
        double side1 = v1.distance(v2);
        double side2 = v2.distance(v3);
        double side3 = v3.distance(v1);
        if (side1 == side2 && side2 == side3) {
            return "The triangle is Equilateral";
        } else {
            if (side1 != side2 && side2 != side3) {
                return "The triangle is Scalene";
            } else {
                return "The triangle is Isosceles";
            }
        }
    }

}
