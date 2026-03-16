package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @Test
    void TestGreets() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        Cat c = new Cat("Mimi");

        c.greets();

        assertEquals("Meow", output.toString().trim());
    }
}