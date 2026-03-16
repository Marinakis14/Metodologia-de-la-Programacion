package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6;

// Abstract superclass representing a generic animal
public abstract class Animal {

    // Name of the animal
    protected String name;

    // Constructor that initializes the name
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method that must be implemented by subclasses
    // Each animal will greet in its own way
    public abstract void greets();
}