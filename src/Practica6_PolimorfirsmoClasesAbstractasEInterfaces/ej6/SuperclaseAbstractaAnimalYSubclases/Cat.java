package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

// Cat class that extends Animal
public class Cat extends Animal {

    // Constructor that calls the superclass constructor
    public Cat(String name) {
        super(name);
    }

    // Implementation of the abstract method greets()
    // Cats greet by saying "Meow"
    @Override
    public void greets() {
        System.out.println("Meow");
    }
}