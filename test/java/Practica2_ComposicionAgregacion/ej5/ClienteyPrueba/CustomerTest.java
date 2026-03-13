package Practica2_ComposicionAgregacion.ej5.ClienteyPrueba;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void testCustomerAll() {
        Customer c = new Customer(101, "Adrian", 'm');

        assertEquals(101, c.getId());
        assertEquals("Adrian", c.getName());
        assertEquals('m', c.getGender());
        assertEquals("Adrian(101)", c.toString());
    }

}
