package Practica3_HerenciaDeClases.ej3.Point2DAndPoint3D;

public class Point2DAndPoint3DTest {
    public static void main(String[] args) {

        // Verificacion de la clase Point2D
        Point2D p2 = new Point2D(1.1f, 2.2f);
        System.out.println("Objeto Point2D: " + p2);

        // Comprobacion de que el array devuelve los valores correctos
        float[] coords2D = p2.getXY();
        System.out.println("Coordenadas extraidas -> X: " + coords2D[0] + ", Y: " + coords2D[1]);

        // Verificacion de la clase Point3D (herencia)
        Point3D p3 = new Point3D(10.0f, 20.0f, 30.0f);
        System.out.println("Objeto Point3D: " + p3);

        // Actualizacion de coordenadas mediante setXYZ
        p3.setXYZ(4.4f, 5.5f, 6.6f);

        // Comprobacion del array de tres dimensiones
        float[] coords3D = p3.getXYZ();
        System.out.println("Nuevas coordenadas -> X: " + coords3D[0] + ", Y: " + coords3D[1] + ", Z: " + coords3D[2]);

        // Test del constructor por defecto
        Point3D puntoVacio = new Point3D();
        System.out.println("Constructor sin parametros: " + puntoVacio);
    }
}