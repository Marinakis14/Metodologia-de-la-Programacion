package Practica3_HerenciaDeClases.ej1.Introduccion;
import Practica1_Clases.ej1.Introduccion.Circle;

public class Cylinder extends Circle {

        // private instance variable
        private double height = 1.0;

        // Constructors

        /**
         * Constructs a Cylinder instance with default radius, color and height
         */
        public Cylinder() {
            super();
        }

        /**
         * Constructs a Cylinder instance with the given radius and default height
         */
        public Cylinder(double radius) {
            super(radius);
        }

        /**
         * Constructs a Cylinder instance with the given radius and height
         */
        public Cylinder(double radius, double height) {
            super(radius);
            this.height = height;
        }

        /**
         * Constructs a Cylinder instance with the given radius, height and color
         */
        public Cylinder(double radius, double height, String color) {
            super(radius, color);
            this.height = height;
        }

        // Getter for variable height
        public double getHeight() {
            return height;
        }

        // Setter for variable height
        public void setHeight(double height) {
            this.height = height;
        }

        /**
         * Returns the volume of this Cylinder instance
         */
        public double getVolume() {
            return getArea() * height;
        }
}

