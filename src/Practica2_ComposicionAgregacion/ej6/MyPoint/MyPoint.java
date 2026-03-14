package Practica2_ComposicionAgregacion.ej6.MyPoint;

public class MyPoint {

    //private instance variables
    private int x = 0;
    private int y = 0;

    //Constructors

    /**
     * Constructs a MyPoint instance
     */
    public MyPoint() {
    }

    /**
     * Constructs a MyPoint instance with the given x and y
     */
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Getter for instance variable x
    public int getX() {
        return x;
    }

    //Getter for instance variable y
    public int getY() {
        return y;
    }

    //Setter for instance variable x
    public void setX(int x) {
        this.x = x;
    }

    //Setter for instance variable y
    public void setY(int y) {
        this.y = y;
    }

    //returns a 2-element int[] of {x,y}
    public int[] getXY() {
        return new int[]{this.x, this.y};
    }

    //Setter for instance variables x and y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * Return a self-descriptive string of this instance in the form of (x,y)
     */
    public String toString() {
        return "(" + x + "," + y + ")";
    }

    //returns the distance from this point to the given point
    public double distance(int x, int y) {
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    //returns the distance from this point to the given instance of MyPoint
    public double distance(MyPoint another) {
        int x = another.getX();
        int y = another.getY();
        return Math.sqrt((this.x - x) * (this.x - x) + (this.y - y) * (this.y - y));
    }

    //returns the distance from this point to (0,0)
    public double distance() {
        return Math.sqrt((this.x) * (this.x) + (this.y) * (this.y));
    }

}
