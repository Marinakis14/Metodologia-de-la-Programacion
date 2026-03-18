package Practica4_DiferenciaComposicionHerencia.ej1.PointLine;

public class TestLineSub {

    public static void main(String[] args) {
        // Test de constructores y toString
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println("Línea 1: " + l1);

        // Test de longitud (3-4-5 triángulo)
        System.out.println("Longitud l1: " + l1.getLength()); // Debería ser 5.0

        // Test de setters y getters
        l1.setBeginXY(1, 1);
        l1.setEndXY(4, 5);
        System.out.println("Línea 1 modificada: " + l1);
        System.out.println("Nuevo inicio X: " + l1.getBeginX());

        // Test con objetos MyPoint
        MyPoint p1 = new MyPoint(10, 10);
        MyPoint p2 = new MyPoint(20, 20);
        LineSub l2 = new LineSub(p1, p2);
        System.out.println("Línea 2: " + l2);
        System.out.println("Gradiante l2: " + l2.getGradient() + " radianes");
    }

}
