package Practica2_ComposicionAgregacion.ej5.ClienteyPrueba;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    private Customer dummy = new Customer(1, "User", 'm');

    @Test
    void testConstructorsAndGetters() {
        // Test constructor completo
        Account a1 = new Account(88, dummy, 100.0);
        assertEquals(88, a1.getId());
        assertEquals(dummy, a1.getCustomer());
        assertEquals(100.0, a1.getBalance());
        assertEquals("User", a1.getCustomerName());

        // Test constructor simple
        Account a2 = new Account(99, dummy);
        assertEquals(0.0, a2.getBalance());
    }

    @Test
    void setBalance() {
        Account a = new Account(1, dummy);
        a.setBalance(50.5);
        assertEquals(50.5, a.getBalance());
    }

    @Test
    void deposit() {
        Account a = new Account(1, dummy, 10.0);
        a.deposit(5.0);
        assertEquals(15.0, a.getBalance());
    }

    @Test
    void withdrawSuccess() {
        Account a = new Account(1, dummy, 100.0);
        a.withdraw(40.0);
        assertEquals(60.0, a.getBalance());
    }

    @Test
    void withdrawFailure() {
        // Para capturar el System.out.println y asegurar cobertura total
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        Account a = new Account(1, dummy, 10.0);
        a.withdraw(20.0);

        assertEquals(10.0, a.getBalance());
        assertTrue(outContent.toString().contains("amount withdrawn exceeds the current balance!"));

        // Resetear la salida estándar
        System.setOut(System.out);
    }

    @Test
    void testToString() {
        Account a = new Account(1, dummy, 123.456);
        // El toString usa String.format("%.2f", balance), así que redondea a 123.46
        assertEquals("User(1) balance=$123,46", a.toString());
    }
}