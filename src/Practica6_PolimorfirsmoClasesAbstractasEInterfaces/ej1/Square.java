package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1;

/**
 * Square class that extends Rectangle (special case of a rectangle)
 */
public class Square extends Rectangle {

    /**
     * Default constructor for Square
     */
    public Square() {
        super(); // Calls Rectangle()
    }

    /**
     * Constructs a Square instance with a specific side
     */
    public Square(double side) {
        super(side, side);
    }

    /**
     * Constructs a Square instance with side, color and filled status
     */
    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled); // Calls Rectangle(width, length, color, filled)
    }

    //Getter for the side of the square (returns width or length, as they are equal)
    public double getSide() {
        return super.getWidth();
    }

    //Setter for the side, ensures both width and length are updated to keep it a square
    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    /**
     * Overrides setWidth to maintain square properties
     */
    @Override
    public void setWidth(double side) {
        setSide(side);
    }

    /**
     * Overrides setLength to maintain square properties
     */
    @Override
    public void setLength(double side) {
        setSide(side);
    }

    /**
     * Returns a self-descriptive string in the form of Square[Rectangle[Shape[],width,length]]
     */
    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}