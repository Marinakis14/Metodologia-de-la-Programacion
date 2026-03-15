package Practica2_ComposicionAgregacion.ej4.ClienteyFactura;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @Test
    void getId() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals(88, customer.getId());
    }

    @Test
    void getName() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals("Tan Ah Teck", customer.getName());
    }

    @Test
    void getDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        assertEquals(10, customer.getDiscount());
    }

    @Test
    void setDiscount() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        customer.setDiscount(20);
        assertEquals(20, customer.getDiscount(), "El descuento debería haberse actualizado a 20");
    }

    @Test
    void testToString() {
        Customer customer = new Customer(88, "Tan Ah Teck", 10);
        String expected = "Tan Ah Teck(88)(10%)";
        assertEquals(expected, customer.toString(), "El formato del toString no coincide con el esperado");
    }
}