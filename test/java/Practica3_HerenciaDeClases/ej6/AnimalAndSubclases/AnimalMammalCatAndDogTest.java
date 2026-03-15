package Practica3_HerenciaDeClases.ej6.AnimalAndSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalMammalCatAndDogTest {

    @Test
    void TestConstructorsAndToString() {
        Cat cat = new Cat("Misifu");
        assertEquals("Cat[Mammal[Animal[name=Misifu]]]",cat.toString());
        cat.greets();
        Dog dog = new Dog("Rambo");
        assertEquals("Dog[Mammal[Animal[name=Rambo]]]",dog.toString());
        dog.greets();
        Dog dog2 = new Dog("Botas");
        dog.greets(dog2);
    }
}