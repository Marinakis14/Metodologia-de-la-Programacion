package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej3.MovableYSuImplementaciónEnLaClaseMovablePoint;

public class TestMovable {
    public static void main(String[] args) {

        // Crear un MovablePoint usando polimorfismo (Interfaz Movable)
        // x=0, y=0, xSpeed=5, ySpeed=10
        Movable m1 = new MovablePoint(0, 0, 5, 10);

        System.out.println("Initial Position ");
        System.out.println(m1); // Hace el toString() de MovablePoint

        //Probar movimiento hacia arriba
        System.out.println("Move up");
        m1.moveUp();
        System.out.println("Current: " + m1);

        //Probar movimiento a la derecha
        System.out.println("Move Right");
        m1.moveRight();
        System.out.println("Current: " + m1);

        //Probar varios movimientos seguidos
        System.out.println("Move Down and Left");
        m1.moveDown();
        m1.moveLeft();
        System.out.println("Final position: " + m1);

        //Crear otro objeto directamente como MovablePoint
        MovablePoint p1 = new MovablePoint(10, 10, 2, 2);
        System.out.println("Testing second point ");
        System.out.println("Point 2: " + p1);
        p1.moveDown();
        System.out.println("Point 2 after moveDown: " + p1);
    }
}
