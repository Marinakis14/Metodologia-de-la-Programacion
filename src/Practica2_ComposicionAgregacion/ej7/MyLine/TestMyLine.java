package Practica2_ComposicionAgregacion.ej7.MyLine;

import Practica2_ComposicionAgregacion.ej6.MyPoint.MyPoint;

public class TestMyLine {public static void main(String[] args) {
    // 1. Probar el primer constructor (usando coordenadas)
    MyLine linea1 = new MyLine(0, 0, 3, 4);
    System.out.println("Línea 1: " + linea1.toString());
    System.out.println("Longitud de línea 1: " + linea1.getLength()); // Debería dar 5.0
    System.out.println("Gradiente (radianes): " + linea1.getGradient());

    // 2. Probar el segundo constructor (usando objetos MyPoint)
    MyPoint p1 = new MyPoint(5, 5);
    MyPoint p2 = new MyPoint(10, 10);
    MyLine linea2 = new MyLine(p1, p2);
    System.out.println("Línea 2: " + linea2);

    // 3. Probar Setters y Getters de Begin y End
    linea2.setBeginX(2);
    linea2.setBeginY(2);
    System.out.println("Línea 2 modificada (beginX/Y): " + linea2);

    // 4. Probar getBeginXY y setBeginXY (Arrays)
    linea2.setBeginXY(1, 1);
    int[] coords = linea2.getBeginXY();
    System.out.println("Nuevo BeginXY de Línea 2: (" + coords[0] + "," + coords[1] + ")");

    // 5. Probar la distancia usando los puntos internos
    System.out.println("Nueva longitud Línea 2: " + linea2.getLength());
}
}
