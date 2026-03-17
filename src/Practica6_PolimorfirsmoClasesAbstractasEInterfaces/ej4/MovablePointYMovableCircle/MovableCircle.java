package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej4.MovablePointYMovableCircle;

// Class that represents a movable circle
public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    // Constructor
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    // Move up (the center moves)
    @Override
    public void moveUp() {
        center.moveUp();
    }

    // Move down
    @Override
    public void moveDown() {
        center.moveDown();
    }

    // Move left
    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    // Move right
    @Override
    public void moveRight() {
        center.moveRight();
    }

    /**
     * Returns a self-descriptive string of this instance in the form of (x,y),speed=(x,y),radius=?]
     */
    @Override
    public String toString() {
        return center.toString() + ",radius=" + radius;
    }
}