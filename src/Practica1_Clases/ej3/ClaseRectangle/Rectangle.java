package Practica1_Clases.ej3.ClaseRectangle;

public class Rectangle {
    // private instance variable, not accessible from outside this class
    private float length;
    private float width;

    /**Constructs a Rectangle instance with default values for length and width */
    Rectangle() {
        this.length = 1.0f;
        this.width = 1.0f;
    }

    /**Constructs a Rectangle instance with the given length and width */
    Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    //Getter for instance variable length
    public float getLength() {
        return length;
    }

    //Setter for instance variable length
    public void setLength(float length) {
        this.length = length;
    }

    //Getter for instance variable width
    public float getWidth() {
        return width;
    }

    //Setter for instance variable width
    public void setWidth(float width) {
        this.width = width;
    }

    /** Returns the area of this Rectangle instance*/
    public double getArea() {
        return length * width;
    }

    /** Returns the perimeter of this Rectangle instance*/
    public double getPerimeter() {
        return 2*length + 2*width;
    }

    /** Return a self-descriptive string of this instance in the form of Rectangle[length=?,width=?] */
    public String toString() {
        return "Rectangle[length=" + length + ",width=" + width + "]";
    }

}
