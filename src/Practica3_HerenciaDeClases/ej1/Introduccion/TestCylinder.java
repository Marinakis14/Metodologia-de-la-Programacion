package Practica3_HerenciaDeClases.ej1.Introduccion;

public class TestCylinder {
        public static void main(String[] args) {
            // 1. Test constructor por defecto
            // Usa super() internamente para poner radio 1.0 y color "red"
            Cylinder c1 = new Cylinder();
            System.out.println("Cilindro 1: Radio=" + c1.getRadius()
                    + ", Altura=" + c1.getHeight()
                    + ", Color=" + c1.getColor()
                    + ", Volumen=" + c1.getVolume());

            // 2. Test constructor con altura
            Cylinder c2 = new Cylinder(10.0);
            System.out.println("Cilindro 2: Radio=" + c2.getRadius()
                    + ", Altura=" + c2.getHeight()
                    + ", Volumen=" + c2.getVolume());

            // 3. Test constructor con radio y altura
            // super(2.0) configura el radio en la clase padre Circle
            Cylinder c3 = new Cylinder(2.0, 5.0);
            System.out.println("Cilindro 3: Radio=" + c3.getRadius()
                    + ", Altura=" + c3.getHeight()
                    + ", Area base=" + c3.getArea() // Método heredado de Circle
                    + ", Volumen=" + c3.getVolume());

            // 4. Test con todos los parámetros
            // super(3.0, "blue") envía los datos directamente al constructor del padre
            Cylinder c4 = new Cylinder(3.0, 4.0, "blue");
            System.out.println("Cilindro 4: " + c4.toString());
        }
}


