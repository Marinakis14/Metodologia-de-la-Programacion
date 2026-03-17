package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej5.ResizableYGeometricObject;

public class ResizableCircle extends Circle implements Resizable {
    // Constructor that initializes the radius of the resizable circle
    public ResizableCircle(double radius) {
        super(radius);
    }

    // Method to give the text description of the resizable circle
    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }

    @Override
    public void resize(int percent) {
        radius = radius * (100 + percent) /100;
    }
}
