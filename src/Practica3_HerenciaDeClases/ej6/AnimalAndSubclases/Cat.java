package Practica3_HerenciaDeClases.ej6.AnimalAndSubclases;

public class Cat extends Mammal {

    //Constructors

    /**
     * Constructs a Cat instance with the given name
     */
    public Cat(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Meow");
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Cat[Mammal[Animal[name="?"]]]
     */
    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }

}
