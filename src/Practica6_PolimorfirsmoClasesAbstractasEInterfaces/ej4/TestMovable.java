package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej4;

    // Test program to demonstrate the use of MovableCircle
    public class TestMovable {

        public static void main(String[] args) {

            // Create a MovableCircle object
            // Parameters: x, y, xSpeed, ySpeed, radius
            MovableCircle c1 = new MovableCircle(5, 5, 2, 2, 10);

            // Print the initial position of the circle
            // This calls the toString() method of MovableCircle
            System.out.println("Initial position: " + c1);

            // Move the circle up
            // The center point of the circle changes its y coordinate
            c1.moveUp();
            System.out.println("After moveUp: " + c1);

            // Move the circle to the right
            // The x coordinate of the center increases
            c1.moveRight();
            System.out.println("After moveRight: " + c1);

            // Move the circle down
            // The y coordinate of the center increases
            c1.moveDown();
            System.out.println("After moveDown: " + c1);

            // Move the circle to the left
            // The x coordinate of the center decreases
            c1.moveLeft();
            System.out.println("After moveLeft: " + c1);
        }
    }