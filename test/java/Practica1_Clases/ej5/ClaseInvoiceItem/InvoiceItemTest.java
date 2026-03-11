package Practica1_Clases.ej5.ClaseInvoiceItem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceItemTest {

    @Test
    void getId() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        assertEquals("001", item.getId());
    }

    @Test
    void getDesc() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        assertEquals("Producto A", item.getDesc());
    }

    @Test
    void getQty() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        assertEquals(5, item.getQty());
    }

    @Test
    void setQty() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        item.setQty(8);
        assertEquals(8, item.getQty());
    }

    @Test
    void getUnitPrice() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        assertEquals(10.0, item.getUnitPrice());
    }

    @Test
    void setUnitPrice() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        item.setUnitPrice(15.5);
        assertEquals(15.5, item.getUnitPrice());
    }

    @Test
    void getTotal() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        assertEquals(50.0, item.getTotal()); // 5 * 10.0

        item.setQty(3);
        item.setUnitPrice(7.5);
        assertEquals(22.5, item.getTotal()); // 3 * 7.5
    }

    @Test
    void testToString() {
        InvoiceItem item = new InvoiceItem("001", "Producto A", 5, 10.0);
        String expected = "InvoiceItem[id=001,desc='Producto A,qty=5,unitPrice=10.0]";
        assertEquals(expected, item.toString());
    }
}