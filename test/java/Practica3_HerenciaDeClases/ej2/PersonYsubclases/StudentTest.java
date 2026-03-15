package Practica3_HerenciaDeClases.ej2.PersonYsubclases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Student student = new Student("Pepito","unacallecualquiera","unprogramacualquiera",2000,100.0);
        assertEquals("Student[Person[name=Pepito,address=unacallecualquiera],program=unprogramacualquiera,year=2000,fee=100.0]",student.toString());
        student.setProgram("otroprograma");
        student.setYear(2020);
        student.setFee(200.0);
        assertEquals("otroprograma",student.getProgram());
        assertEquals(2020,student.getYear());
        assertEquals(200.0,student.getFee());

    }
}