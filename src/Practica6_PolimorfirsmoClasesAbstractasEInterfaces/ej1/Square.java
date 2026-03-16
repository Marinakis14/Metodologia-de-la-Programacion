package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej1;

public abstract class Square extends Shape {
    protected double side;

    public Square() {
        super();
        this.side = 1.0;
    }

    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(double side, String color, boolean filled) {
        super();
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + ",side=" + side + "]";
    }
}
