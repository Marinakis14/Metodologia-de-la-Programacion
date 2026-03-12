package Practica2_ComposicionAgregacion.ej1.Introduccion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    // Instancia de apoyo para los tests
    private Author dummyAuthor = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');

    @Test
    void getName() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        assertEquals("Java for Dummies", book.getName());
    }

    @Test
    void getAuthor() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        assertEquals(dummyAuthor, book.getAuthor());
        assertEquals("Tan Ah Teck", book.getAuthor().getName());
    }

    @Test
    void getPrice() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        assertEquals(19.99, book.getPrice());
    }

    @Test
    void getQty() {
        // Testeamos ambos constructores para asegurar cobertura total
        Book book1 = new Book("Java 1", dummyAuthor, 10.0);
        assertEquals(0, book1.getQty()); // Valor por defecto

        Book book2 = new Book("Java 2", dummyAuthor, 10.0, 50);
        assertEquals(50, book2.getQty()); // Valor asignado
    }

    @Test
    void setPrice() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        book.setPrice(29.95);
        assertEquals(29.95, book.getPrice());
    }

    @Test
    void setQty() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        book.setQty(100);
        assertEquals(100, book.getQty());
    }

    @Test
    void getAuthorName() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        assertEquals("Tan Ah Teck", book.getAuthorName());
    }

    @Test
    void getAuthorEmail() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        assertEquals("ahteck@nowhere.com", book.getAuthorEmail());
    }

    @Test
    void getAuthorGender() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99);
        assertEquals('m', book.getAuthorGender());
    }

    @Test
    void testToString() {
        Book book = new Book("Java for Dummies", dummyAuthor, 19.99, 8);
        String expected = "Book[name=Java for Dummies,Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m],price=19.99,qty=8]";
        assertEquals(expected, book.toString());
    }
}