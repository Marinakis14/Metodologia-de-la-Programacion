package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

// Test program to demonstrate the behavior of the classes
public class TestAnimal {

    public static void main(String[] args) {

        // Creating animals
        Animal a1 = new Cat("Kitty");
        Animal a2 = new Dog("Buddy");
        Animal a3 = new BigDog("Max");

        // Calling diferent greets() methods
        a1.greets();  // Cat -> Meow
        a2.greets();  // Dog -> Woof
        a3.greets();  // BigDog -> Wooow

        // Creating Dog objects
        Dog d1 = new Dog("Rocky");
        Dog d2 = new BigDog("Bruno");

        // Calling diferent greet methods again
        d1.greets(d2); // Dog greeting another dog
        d2.greets(d1); // BigDog greeting a dog

        // Creating BigDog objects
        BigDog bd1 = new BigDog("Thor");
        BigDog bd2 = new BigDog("Hulk");

        // Calling the last greet method
        bd1.greets(bd2);
    }
}