package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1.SuperclaseAbstractaShapeYSusSubclasesConcretas;

/**
 * Abstract class Shape that serves as a base for different geometric shapes
 */
public abstract class Shape {

    //protected instance variables (accessible by subclasses)
    protected String color;
    protected boolean filled;

    /**
     * Default constructor for Shape with default values
     */
    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    /**
     * Constructs a Shape instance with given color and filled status
     */
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    //Getter for instance variable color
    public String getColor(){
        return color;
    }

    //Setter for instance variable color
    public void setColor(String color){
        this.color = color;
    }

    //Getter for instance variable filled
    public boolean isFilled(){
        return filled;
    }

    //Setter for instance variable filled
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    /**
     * Abstract method to be implemented by subclasses to calculate area
     */
    public abstract double getArea();

    /**
     * Abstract method to be implemented by subclasses to calculate perimeter
     */
    public abstract double getPerimeter();

    /**
     * Returns a self-descriptive string in the form of Shape[color=?,filled=?]
     */
    @Override
    public String toString(){
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}
