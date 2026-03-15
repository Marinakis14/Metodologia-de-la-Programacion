package java.Practica3_HerenciaDeClases.ej2;

import Practica3_HerenciaDeClases.ej2.PersonYsubclases.Staff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void TestConstructorsAndGettersSetters() {

        Staff staff = new Staff("Pepito","unacalle","UAH",10.0);
        assertEquals("Staff[Person[name=Pepito,address=unacalle],school=UAH,pay=10.0]",staff.toString());
        staff.setSchool("Complutense");
        staff.setPay(20.0);
        assertEquals("Complutense",staff.getSchool());
        assertEquals(20.0,staff.getPay());

    }
}