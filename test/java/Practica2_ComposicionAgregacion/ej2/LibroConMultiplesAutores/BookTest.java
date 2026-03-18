package Practica2_ComposicionAgregacion.ej2.LibroConMultiplesAutores;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    private Author auth1 = new Author("Author 1", "a1@mail.com", 'm');
    private Author auth2 = new Author("Author 2", "a2@mail.com", 'f');
    private Author[] authors = {auth1, auth2};

    @Test
    void getName() {
        Book book = new Book("Java Pro", authors, 29.99);
        assertEquals("Java Pro", book.getName());
    }

    @Test
    void getAuthors() {
        Book book = new Book("Java Pro", authors, 29.99);
        assertArrayEquals(authors, book.getAuthors());
        assertEquals(2, book.getAuthors().length);
    }

    @Test
    void getPrice() {
        Book book = new Book("Java Pro", authors, 29.99);
        assertEquals(29.99, book.getPrice());
    }

    @Test
    void getQty() {
        Book book = new Book("Java Pro", authors, 29.99, 99);
        assertEquals(99, book.getQty());
    }

    @Test
    void setPrice() {
        Book book = new Book("Java Pro", authors, 29.99);
        book.setPrice(35.50);
        assertEquals(35.50, book.getPrice());
    }

    @Test
    void setQty() {
        Book book = new Book("Java Pro", authors, 29.99);
        book.setQty(10);
        assertEquals(10, book.getQty());
    }

    @Test
    void getAuthorNames() {
        Book book = new Book("Java Pro", authors, 29.99);
        // Verifica que la coma y el espacio se pongan correctamente
        assertEquals("Author 1, Author 2", book.getAuthorNames());

        // Para cubrir la rama donde no hay coma porque solo hay un author
        Book singleBook = new Book("Solo", new Author[]{auth1}, 10.0);
        assertEquals("Author 1", singleBook.getAuthorNames());
    }

    @Test
    void testToString() {
        Book book = new Book("Java Pro", authors, 29.99, 5);
        String expected = "Book[name=Java Pro,authors={Author[name=Author 1,email=a1@mail.com,gender=m],Author[name=Author 2,email=a2@mail.com,gender=f]},price=29.99,qty=5]";
        assertEquals(expected, book.toString());
    }
}