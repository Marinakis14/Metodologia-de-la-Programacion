package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej5.ResizableYGeometricObject;

public class ResizableCircle extends Circle {
    public resizableCircle(double radius) {
        super(radius);
    }
    public String toString(){
        return "ResizableCircle[radius=" + radius + "]";
    }
    public void resize(double percent){
        radius *= (1 + percent / 100);
    }
}
