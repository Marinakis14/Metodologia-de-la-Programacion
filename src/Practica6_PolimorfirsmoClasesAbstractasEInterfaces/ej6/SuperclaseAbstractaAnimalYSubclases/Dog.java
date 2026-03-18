package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

// Dog class that extends Animal
public class Dog extends Animal {

    // Constructor that initializes the dog's name
    public Dog(String name) {
        super(name);
    }

    // Dogs greet by saying "Woof"
    @Override
    public void greets() {
        System.out.println("Woof");
    }

    // Overloaded method: greeting another dog
    // Same method name but with a parameter
    public void greets(Dog another) {
        System.out.println("Wooof");
    }
}


