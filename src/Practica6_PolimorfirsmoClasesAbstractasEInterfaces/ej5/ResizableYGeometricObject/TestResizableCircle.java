package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej5.ResizableYGeometricObject;

public class TestResizableCircle {
    public static void main(String[] args) {

        // Creamos el objeto directamente como un ResizableCircle
        // Usamos el constructor con radio 100.0
        ResizableCircle circulo = new ResizableCircle(100.0);

        System.out.println("ESTADO INICIAL");
        System.out.println(circulo.toString());
        System.out.println("Área: " + circulo.getArea());

        // Redimensionamos directamente
        System.out.println("BAJAMOS EL TAMAÑO EN UN 50%");
        circulo.resize(50);

        System.out.println("Después del resize: " + circulo.toString());
        System.out.println("Nueva Área: " + circulo.getArea());

        // Demostración de Polimorfismo
        // Tratamos al círculo como un GeometricObject para ver el perímetro
        System.out.println("PERIMETRO FINAL");
        System.out.println("Perimetro: " + circulo.getPerimeter());
    }
}
