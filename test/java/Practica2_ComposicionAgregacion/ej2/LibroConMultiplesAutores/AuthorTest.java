package Practica2_ComposicionAgregacion.ej2.LibroConMultiplesAutores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals("Tan Ah Teck", author.getName(), "El nombre debe coincidir con el del constructor");
    }

    @Test
    void getEmail() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals("ahteck@nowhere.com", author.getEmail());
    }

    @Test
    void getGender() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        assertEquals('m', author.getGender());
    }

    @Test
    void setEmail() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        author.setEmail("newemail@somewhere.com");
        assertEquals("newemail@somewhere.com", author.getEmail(), "El email debería haberse actualizado");
    }

    @Test
    void testToString() {
        Author author = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        String expected = "Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m]";
        assertEquals(expected, author.toString(), "El formato del String toString no coincide");
    }
}