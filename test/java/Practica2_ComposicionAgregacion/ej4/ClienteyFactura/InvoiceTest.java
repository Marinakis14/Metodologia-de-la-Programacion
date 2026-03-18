package Practica2_ComposicionAgregacion.ej4.ClienteyFactura;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

    private Customer dummyCustomer = new Customer(1, "Juan", 20);

    @Test
    void getId() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals(101, inv.getId());
    }

    @Test
    void getCustomer() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals(dummyCustomer, inv.getCustomer());
    }

    @Test
    void getAmount() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals(500.0, inv.getAmount());
    }

    @Test
    void setCustomer() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        Customer newCustomer = new Customer(2, "Maria", 10);
        inv.setCustomer(newCustomer);
        assertEquals(newCustomer, inv.getCustomer());
    }

    @Test
    void setAmount() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        inv.setAmount(1000.0);
        assertEquals(1000.0, inv.getAmount());
    }

    @Test
    void getCustomerId() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals(1, inv.getCustomerId());
    }

    @Test
    void getCustomerName() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals("Juan", inv.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals(20, inv.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        assertEquals(400.0, inv.getAmountAfterDiscount(), 0.001);

        Customer noDiscount = new Customer(3, "Pedro", 0);
        inv.setCustomer(noDiscount);
        assertEquals(500.0, inv.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        Invoice inv = new Invoice(101, dummyCustomer, 500.0);
        String customerString = dummyCustomer.toString();
        String expected = "Invoice[id=101,customer=" + customerString + ",amount=500.0]";
        assertEquals(expected, inv.toString());
    }
}