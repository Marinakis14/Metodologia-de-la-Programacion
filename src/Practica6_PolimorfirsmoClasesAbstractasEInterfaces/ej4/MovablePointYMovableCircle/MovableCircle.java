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
    public void moveUp() {
        center.moveUp();
    }

    // Move down
    public void moveDown() {
        center.moveDown();
    }

    // Move left
    public void moveLeft() {
        center.moveLeft();
    }

    // Move right
    public void moveRight() {
        center.moveRight();
    }

    // Text description
    public String toString() {
        return center.toString() + ", radius=" + radius;
    }
}