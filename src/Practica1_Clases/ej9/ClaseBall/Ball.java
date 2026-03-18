package Practica1_Clases.ej9.ClaseBall;

public class Ball {
    //private instance variables
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    //Constructors

    /**
     * Constructs a Ball instance with the given x, y, radius, xDelta and yDelta
     */
    Ball(float x, float y, int radius, float xDelta, float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }

    // Getter for instance variable x
    public float getX() {
        return x;
    }

    // Getter for instance variable y
    public float getY() {
        return y;
    }

    // Getter for instance variable radius
    public int getRadius() {
        return radius;
    }

    // Getter for instance variable xDelta
    public float getXDelta() {
        return xDelta;
    }

    // Getter for instance variable yDelta
    public float getYDelta() {
        return yDelta;
    }

    // Setter for instance variable x
    public void setX(float x) {
        this.x = x;
    }

    // Setter for instance variable y
    public void setY(float y) {
        this.y = y;
    }

    // Setter for instance variable radius
    public void setRadius(int radius) {
        this.radius = radius;
    }

    // Setter for instance variable xDelta
    public void setXDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    // Setter for instance variable yDelta
    public void setYDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    // moves one step
    public void move() {
        this.x += xDelta;
        this.y += yDelta;
    }

    // changes the simbol of xDelta
    public void reflectHorizontal() {
        this.xDelta = -xDelta;
    }

    // changes the simbol of yDelta
    public void reflectVertical() {
        this.yDelta = -yDelta;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Ball[(x,y),speed=(xDelta,yDelta)]
     */
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }
}
