package java.Practica3_HerenciaDeClases.ej2;

import Practica3_HerenciaDeClases.ej2.PersonYsubclases.Person;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Person person = new Person("Pepito","callenosecuantosnumeronosesabe");
        assertEquals("Person[name=Pepito,address=callenosecuantosnumeronosesabe]",person.toString());
        person.setAddress("otracalledistinta");
        assertEquals("Pepito",person.getName());
        assertEquals("otracalledistinta",person.getAddress());

    }

}