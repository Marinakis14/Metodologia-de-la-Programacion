package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void TestConstructor() {

        Animal a1 = new Dog("Rex");
        Animal a2 = new Cat("Mimi");
        Animal a3 = new BigDog("Thor");

        assertEquals("Rex", ((Dog) a1).name);
        assertEquals("Mimi", ((Cat) a2).name);
        assertEquals("Thor", ((BigDog) a3).name);
    }
}