package Practica4_DiferenciaComposicionHerencia.ej1.PointLine;

public class LineSub extends MyPoint {

    // El punto de inicio (begin) se hereda de MyPoint (super)
    private MyPoint end; // Punto final como atributo interno

    // Constructores
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // Construye el punto de inicio en la superclase
        this.end = new MyPoint(endX, endY);
    }

    public LineSub(MyPoint begin, MyPoint end) {
        super(begin.getX(), begin.getY()); // Extrae coordenadas para la superclase
        this.end = end;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of LineSub[begin=(x1,y1),end=(x2,y2)]
     */
    @Override
    public String toString() {
        return "LineSub[begin=" + super.toString() + ", end=" + end.toString() + "]";
    }

    //Getter for MyPoint instance begin
    public MyPoint getBegin() {
        // Devolvemos un nuevo punto con las coordenadas de la superclase
        return new MyPoint(this.getX(), this.getY());
    }

    //Setter for MyPoint instance begin
    public void setBegin(MyPoint begin) {
        this.setX(begin.getX());
        this.setY(begin.getY());
    }

    //Getter for MyPoint instance end
    public MyPoint getEnd() {
        return end;
    }

    //Setter for MyPoint instance end
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    //Getter for instance MyPoint begin variable x
    public int getBeginX() {
        return this.getX();
    }

    //Getter for instance MyPoint begin variable y
    public int getBeginY() {
        return this.getY();
    }

    //Getter for instance MyPoint end variable x
    public int getEndX() {
        return end.getX();
    }

    //Getter for instance MyPoint end variable y
    public int getEndY() {
        return end.getY();
    }

    //Setter for instance MyPoint begin variable x
    public void setBeginX(int x) {
        this.setX(x);
    }

    //Setter for instance MyPoint begin variable y
    public void setBeginY(int y) {
        this.setY(y);
    }

    //Setter for instance MyPoint begin variables x and y
    public void setBeginXY(int x, int y) {
        this.setXY(x, y);
    }

    //Setter for instance MyPoint end variable x
    public void setEndX(int x) {
        end.setX(x);
    }

    //Setter for instance MyPoint end variable y
    public void setEndY(int y) {
        end.setY(y);
    }

    //Setter for instance MyPoint end variables x and y
    public void setEndXY(int x, int y) {
        end.setXY(x, y);
    }

    //Returns the distance of this LineSub
    public double getLength() {
        int xDiff = this.getX() - end.getX();
        int yDiff = this.getY() - end.getY();
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    //Returns the gradient in radians of this LineSub
    public double getGradient() {
        int xDiff = end.getX() - this.getX();
        int yDiff = end.getY() - this.getY();
        return Math.atan2(yDiff, xDiff);
    }

    /**
     * Como ya hemos visto la clase Line se puede hacer tanto por composicion como por herencia pero en este caso
     * Es mejor hacerlo por composicion ya que tiene una estructura mas sencilla y facil de entender, porque en el
     * metodo de herencia el punto inicial es la linea misma, es mas intuitivo verlo como la union de dos puntos
     * que es el caso de la composicion, además si más adelante quieres hacer algun cambio, como por ejemplo poner
     * los puntos de la linea en 3D, solo habria que hacer algun cambio poniendo los puntos de los que depende la linea
     * en 3D, pero con herencia habria que cambiar la estructura entera
     */

}
