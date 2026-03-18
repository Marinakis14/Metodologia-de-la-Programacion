package Practica3_HerenciaDeClases.ej6.AnimalAndSubclases;

public class Mammal extends Animal {

    //Constructors

    /**
     * Constructs a Mammal instance with the given name
     */
    public Mammal(String name) {
        super(name);
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Mammal[Animal[name="?"]]
     */
    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }

}
