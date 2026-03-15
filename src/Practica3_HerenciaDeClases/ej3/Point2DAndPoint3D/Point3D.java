package Practica3_HerenciaDeClases.ej3.Point2DAndPoint3D;

public class Point3D extends Point2D {

    //private instance variable
    private float z = 0.0f;

    /**
     * Constructs a Point3D instance with the given x, y and z coordinates
     */
    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    /**
     * Constructs a Point3D instance with default values
     */
    public Point3D(){
        super();
    }

    //Getter for instance variable z
    public float getZ(){
        return z;
    }

    //Setter for instance variable z
    public void setZ(float z){
        this.z = z;
    }

    /**
     * Sets x, y and z coordinates
     */
    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z = z;
    }

    /**
     * Returns a float array of {x, y, z}
     */
    public float[] getXYZ(){
        return new float[]{getX(),getY(),getZ()};
    }

    /**
     * Returns a self-descriptive string in the form of (x,y,z)
     */
    @Override
    public String toString(){
        return "(" + getX() + "," + getY() +"," + z + ")";
    }
}
