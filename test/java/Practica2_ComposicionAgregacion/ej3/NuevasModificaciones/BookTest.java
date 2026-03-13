package Practica2_ComposicionAgregacion.ej3.NuevasModificaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    // Autor de prueba para usar en los constructores
    private Author dummyAuthor = new Author("Robert C. Martin", "unclebob@cleancode.com");

    @Test
    void getIsbn() {
        Book book = new Book("978-0132350884", "Clean Code", dummyAuthor, 35.50);
        assertEquals("978-0132350884", book.getIsbn());
    }

    @Test
    void getName() {
        Book book = new Book("12345", "Java Programming", dummyAuthor, 20.0);
        assertEquals("Java Programming", book.getName());
    }

    @Test
    void getAuthor() {
        Book book = new Book("12345", "Java Programming", dummyAuthor, 20.0);
        assertEquals(dummyAuthor, book.getAuthor());
        assertEquals("Robert C. Martin", book.getAuthor().getName());
    }

    @Test
    void getPrice() {
        Book book = new Book("12345", "Java Programming", dummyAuthor, 25.0);
        assertEquals(25.0, book.getPrice());
    }

    @Test
    void getQty() {
        // Testeamos constructor 1 (qty por defecto = 0)
        Book book1 = new Book("123", "Libro A", dummyAuthor, 10.0);
        assertEquals(0, book1.getQty());

        // Testeamos constructor 2 (qty asignada)
        Book book2 = new Book("456", "Libro B", dummyAuthor, 10.0, 50);
        assertEquals(50, book2.getQty());
    }

    @Test
    void setPrice() {
        Book book = new Book("123", "Libro", dummyAuthor, 10.0);
        book.setPrice(15.0);
        assertEquals(15.0, book.getPrice());
    }

    @Test
    void setQty() {
        Book book = new Book("123", "Libro", dummyAuthor, 10.0);
        book.setQty(100);
        assertEquals(100, book.getQty());
    }

    @Test
    void getAuthorName() {
        Book book = new Book("123", "Libro", dummyAuthor, 10.0);
        assertEquals("Robert C. Martin", book.getAuthorName());
    }

    @Test
    void testToString() {
        Book book = new Book("978-0132350884", "Clean Code", dummyAuthor, 35.50, 10);
        String expected = "Book[isbn=978-0132350884,name=Clean Code,Author[name=Robert C. Martin,email=unclebob@cleancode.com],price=35.5,qty=10]";
        assertEquals(expected, book.toString());
    }
}