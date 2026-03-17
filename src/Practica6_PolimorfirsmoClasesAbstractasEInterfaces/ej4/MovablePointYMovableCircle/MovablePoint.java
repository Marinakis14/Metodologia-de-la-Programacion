package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej4.MovablePointYMovableCircle;

// Class that represents a point that can move
public class MovablePoint implements Movable {

    int x;
    int y;
    int xSpeed;
    int ySpeed;

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Move up
    @Override
    public void moveUp() {
        y += ySpeed;
    }

    // Move down
    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    // Move left
    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    // Move right
    @Override
    public void moveRight() {
        x += xSpeed;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of (x,y),speed=(x,y)]
     */
    public String toString() {
        return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }
}