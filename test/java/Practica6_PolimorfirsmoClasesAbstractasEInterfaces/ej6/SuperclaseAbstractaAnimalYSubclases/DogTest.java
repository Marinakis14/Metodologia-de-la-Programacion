package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {

    @Test
    void TestGreets() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Dog d1 = new Dog("Rex");
        Dog d2 = new Dog("Max");

        d1.greets();
        assertEquals("Woof", output.toString().trim());
        output.reset();

        d1.greets(d2);
        assertEquals("Wooof", output.toString().trim());
    }
}