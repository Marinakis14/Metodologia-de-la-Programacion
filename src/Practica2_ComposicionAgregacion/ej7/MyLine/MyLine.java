package Practica2_ComposicionAgregacion.ej7.MyLine;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

public class MyLine {

    //private instance MyPoint instances
    private MyPoint begin;
    private MyPoint end;

    //Constructors

    /**
     * Constructs a MyLine instance with the given x1, y1, x2 and y2
     */
    public MyLine(int x1, int y1, int x2, int y2) {
        this.begin = new MyPoint(x1, y1);
        this.end = new MyPoint(x2, y2);
    }

    /**
     * Constructs a MyLine instance with the two given MyPoint instances
     */
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    //Getter for MyPoint instance begin
    public MyPoint getBegin() {
        return begin;
    }

    //Setter for MyPoint instance begin
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    //Getter for MyPoint instance end
    public MyPoint getEnd() {
        return end;
    }

    //Setter for MyPoint instance end
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    //Getter for instance MyPoint begin variable x
    public int getBeginX() {
        return begin.getX();
    }

    //Setter for instance MyPoint begin variable x
    public void setBeginX(int x) {
        begin.setX(x);
    }

    //Getter for instance MyPoint begin variable y
    public int getBeginY() {
        return begin.getY();
    }

    //Setter for instance MyPoint begin variable y
    public void setBeginY(int y) {
        begin.setY(y);
    }

    //Getter for instance MyPoint end variable x
    public int getEndX() {
        return end.getX();
    }

    //Setter for instance MyPoint end variable x
    public void setEndX(int x) {
        end.setX(x);
    }

    //Getter for instance MyPoint end variable y
    public int getEndY() {
        return end.getY();
    }

    //Setter for instance MyPoint end variable y
    public void setEndY(int y) {
        end.setY(y);
    }

    //Getter for instance MyPoint begin variables x and y
    public int[] getBeginXY() {
        return new int[]{begin.getX(), begin.getY()};
    }

    //Setter for instance MyPoint begin variables x and y
    public void setBeginXY(int x, int y) {
        begin.setX(x);
        begin.setY(y);
    }

    //Getter for instance MyPoint end variables x and y
    public int[] getEndXY() {
        return new int[]{end.getX(), end.getY()};
    }

    //Setter for instance MyPoint end variables x and y
    public void setEndXY(int x, int y) {
        end.setX(x);
        end.setY(y);
    }

    //Returns the distance of this MyLine
    public double getLength() {
        return Math.sqrt((getBeginX() - getEndX()) * (getBeginX() - getEndX()) + (getBeginY() - getEndY()) * (getBeginY() - getEndY()));
    }

    //Returns the gradient in radians of this MyLine
    public double getGradient() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    /**
     * Returns a self-descriptive string of this instance in the form of MyLine[begin=(x1,y1),end=(x2,y2)]
     */
    public String toString() {
        return "MyLine[begin= (" + getBeginX() + "," + getBeginY() + ") , end= (" + getEndX() + ", " + getEndY() + ")]";
    }

}
