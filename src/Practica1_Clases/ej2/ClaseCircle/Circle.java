package Practica1_Clases.ej2.ClaseCircle;

public class Circle {
    // private instance variable, not accessible from outside this class
    private double radius;

    /** Constructs a Circle instance with default value for radius*/
    Circle() {  //1st default constructor
        this.radius = 1.0;
    }

    /** Constructs a Circle instance with the given radius */
    Circle(double radius) {  //2nd constructor with
        this.radius = radius;
    }

    //Getter for instance variable radius
    public double getRadius() {
        return radius;
    }


    //Setter for instance variable radius
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Returns the area of this Circle instance */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Returns the circumference of this Circle instance */
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    /** Return a self-descriptive string of this instance in the form of Circle[radius=?] */
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }

}
