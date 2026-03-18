package Practica3_HerenciaDeClases.ej6.AnimalAndSubclases;

public class Dog extends Mammal {

    //Constructors

    /**
     * Constructs a Dog instance with the given name
     */
    public Dog(String name) {
        super(name);
    }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Dog[Mammal[Animal[name="?"]]]
     */
    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }

}
