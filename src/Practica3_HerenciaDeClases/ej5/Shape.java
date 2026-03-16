package Practica3_HerenciaDeClases.ej5;

// Base class that represents a generic geometric shape
public class Shape {

    // Color of the shape (default value is "red")
    private String color = "red";

    // Indicates if the shape is filled or not (default true)
    private boolean filled = true;

    // Default constructor
    // Creates a shape with the default color and filled values
    public Shape(){
    }

    // Constructor that initializes color and filled attributes
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    // Getter method for color
    public String getColor(){
        return color;
    }

    // Setter method for color
    public void setColor(String color){
        this.color = color;
    }

    // Returns whether the shape is filled or not
    public boolean isFilled(){
        return filled;
    }

    // Setter method for the filled attribute
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    // Returns a text description of the shape
    // This method will also be used by subclasses (Circle, Rectangle, etc.)
    @Override
    public String toString(){
        return "Shape[ color: " + color + " filled: " + filled + "]";
    }
}
