package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class BigDogTest {

    @Test
    void TestGreets() {

        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        BigDog b1 = new BigDog("Thor");
        BigDog b2 = new BigDog("Odin");
        Dog d = new Dog("Rex");

        b1.greets();
        assertEquals("Wooow", output.toString().trim());
        output.reset();

        b1.greets(d);
        assertEquals("Wooooooow", output.toString().trim());
        output.reset();

        b1.greets(b2);
        assertEquals("Wooooooooow", output.toString().trim());
    }
}