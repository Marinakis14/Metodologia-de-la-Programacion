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

    // Text description
    public String toString() {
        return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
    }
}