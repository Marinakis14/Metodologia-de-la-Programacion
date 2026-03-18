package Practica3_HerenciaDeClases.ej6.AnimalAndSubclases;

public class Animal {

    //private instance variables
    private String name;

    //Constructors

    /**
     * Constructs a Animal instance with the given name
     */
    public Animal(String name) {
        this.name = name;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Animal[name="?"]
     */
    public String toString() {
        return "Animal[name=" + name + "]";
    }

}
