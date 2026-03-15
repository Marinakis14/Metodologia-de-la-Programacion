package Practica2_ComposicionAgregacion.ej8.MyCircle;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

public class MyCircle {

    //private instance variables
    private MyPoint center = new MyPoint();
    private int radius = 1;

    //Constructors

    /**
     * Constructs a MyCircle instance
     */
    public MyCircle() {
    }

    /**
     * Constructs a MyCircle instance with the given x, y and radius
     */
    public MyCircle(int x, int y, int radius) {
        this.center = new MyPoint(x, y);
        this.radius = radius;
    }

    /**
     * Constructs a MyCircle instance with the given MyPoint and radius
     */
    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    //Getter for instance variable radius
    public int getRadius() {
        return radius;
    }

    //Setter for instance variable radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    //Getter for MyPoint instance centre
    public MyPoint getCenter() {
        return center;
    }

    //Setter for MyPoint instance center
    public void setCenter(MyPoint center) {
        this.center = center;
    }

    //Getter for instance MyPoint centre variable x
    public int getCenterX() {
        return center.getX();
    }

    //Setter for instance MyPoint centre variable x
    public void setCenterX(int x) {
        center.setX(x);
    }

    //Getter for instance MyPoint begin variable y
    public int getCenterY() {
        return center.getY();
    }

    //Setter for instance MyPoint center variable y
    public void setCenterY(int y) {
        center.setY(y);
    }

    //Getter for instance MyPoint center variables x and y
    public int[] getCenterXY() {
        return new int[]{center.getX(), center.getY()};
    }

    //Setter for instance MyPoint center variables x and y
    public void setCenterXY(int x, int y) {
        center.setX(x);
        center.setY(y);
    }

    /**
     * Returns a self-descriptive string of this instance in the form of MyCircle[radius=r,center=(x,y)]
     */
    public String toString() {
        return "MyCircle[radius=" + radius + ",center=" + center.toString() + "]";
    }

    //Returns the area of this MyCircle
    public double getArea() {
        return Math.PI * radius * radius;
    }

    //Returns the circumference of this MyCircle
    public double getCircumference() {
        return Math.PI * radius * 2;
    }

    //Returns the distance between the centers of this MyCircle and the given MyCircle
    public double distance(MyCircle another) {
        return center.distance(another.center);
    }

}
