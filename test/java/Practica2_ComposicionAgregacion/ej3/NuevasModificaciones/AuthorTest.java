package Practica2_ComposicionAgregacion.ej3.NuevasModificaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {

    @Test
    void getName() {
        Author author = new Author("Codigo Limpio", "limpio@java.com");
        assertEquals("Codigo Limpio", author.getName());
    }

    @Test
    void getEmail() {
        Author author = new Author("Codigo Limpio", "limpio@java.com");
        assertEquals("limpio@java.com", author.getEmail());
    }

    @Test
    void setEmail() {
        Author author = new Author("Codigo Limpio", "limpio@java.com");
        author.setEmail("nuevo@java.com");
        assertEquals("nuevo@java.com", author.getEmail(), "El email debería haberse actualizado con el setter");
    }

    @Test
    void testToString() {
        Author author = new Author("Codigo Limpio", "limpio@java.com");
        String expected = "Author[name=Codigo Limpio,email=limpio@java.com]";
        assertEquals(expected, author.toString(), "El formato del String toString debe coincidir exactamente");
    }
}