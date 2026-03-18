package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej3.MovableYSuImplementacionEnLaClaseMovablePoint;

public class MovablePoint implements Movable {

    int x, y, xSpeed, ySpeed;

    // Constructor
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Returns a string like (x,y) speed=(xSpeed,ySpeed)
    @Override
    public String toString() {
        return "(" + x + "," + y + "), speed=(" + xSpeed + "," + ySpeed + ")";
    }

    // Implementing the abstract methods from Movable interface
    @Override
    public void moveUp() {
        y += ySpeed;
    }

    @Override
    public void moveDown() {
        y -= ySpeed;
    }

    @Override
    public void moveLeft() {
        x -= xSpeed;
    }

    @Override
    public void moveRight() {
        x += xSpeed;
    }
}
