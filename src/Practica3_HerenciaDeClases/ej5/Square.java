package Practica3_HerenciaDeClases.ej5;

// Square class that extends Rectangle
// A square is a special type of rectangle where width = length
public class Square extends Rectangle {

    // Default constructor
    // Calls the constructor of the superclass Rectangle
    public Square() {
        super();
    }

    // Constructor that receives the side of the square
    // Calls the Rectangle constructor with width = length = side
    public Square(double side) {
        super(side, side);
    }

    // Constructor that initializes side, color and filled
    // Calls the Rectangle constructor and sets width and length to the same value
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // Getter method that returns the side of the square
    // Since a square has equal sides, we can return the width
    public double getSide() {
        return getWidth();
    }

    // Setter method for the side
    // Updates both width and length to keep the square property
    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // Override setWidth to ensure width and length remain equal
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Override setLength to ensure width and length remain equal
    @Override
    public void setLength(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    // Returns a text description of the square
    // Calls the Rectangle toString() method using super
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

