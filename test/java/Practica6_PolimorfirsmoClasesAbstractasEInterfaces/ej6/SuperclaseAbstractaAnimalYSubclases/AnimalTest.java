package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void TestConstructor() {

        Animal a1 = new Dog("Rex");
        Animal a2 = new Cat("Mimi");
        Animal a3 = new BigDog("Thor");

        assertEquals("Rex", a1.name);
        assertEquals("Mimi", a2.name);
        assertEquals("Thor", a3.name);
    }
}