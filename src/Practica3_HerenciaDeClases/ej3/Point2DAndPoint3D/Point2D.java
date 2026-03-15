package Practica3_HerenciaDeClases.ej3.Point2DAndPoint3D;

public class Point2D {

    //private instance variables
    private float x = 0.0f;
    private float y = 0.0f;


    /**
     * Constructs a Point2D instance with the given x and y coordinates
     */
    public Point2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    /**
     * Constructs a Point2D instance with default values
     */
    public Point2D(){
    }

    //Getter for instance variable x
    public float getX(){
        return x;
    }

    //Setter for instance variable x
    public void setX(float x){
        this.x = x;
    }

    //Getter for instance variable y
    public float getY(){
        return y;
    }

    //Setter for instance variable y
    public void setY(float y){
        this.y = y;
    }

    /**
     * Sets x and y coordinates
     */
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }

    /**
     * Returns a float array of {x, y}
     */
    public float[] getXY(){
        return new float[]{getX(),getY()};
    }

    /**
     * Returns a self-descriptive string in the form of (x,y)
     */
    public String toString(){
        return "("+ x + ","+ y +")";
    }
}

