package Practica1_Clases.ej6.ClaseAccount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AccountTest {

    @Test
    void getId() {
        Account acc = new Account("A001", "Juan");
        assertEquals("A001", acc.getId());
    }

    @Test
    void getName() {
        Account acc = new Account("A001", "Juan");
        assertEquals("Juan", acc.getName());
    }

    @Test
    void getBalance() {
        Account acc1 = new Account("A001", "Juan");
        assertEquals(0, acc1.getBalance());

        Account acc2 = new Account("A002", "Ana", 100);
        assertEquals(100, acc2.getBalance());
    }

    @Test
    void credit() {
        Account acc = new Account("A001", "Juan", 50);
        int newBalance = acc.credit(30);
        assertEquals(80, newBalance);
        assertEquals(80, acc.getBalance());
    }

    @Test
    void debit() {
        Account acc = new Account("A001", "Juan", 50);
        int newBalance = acc.debit(20);
        assertEquals(30, newBalance);
        assertEquals(30, acc.getBalance());

        // intentar debitar más que el balance
        newBalance = acc.debit(50);
        assertEquals(30, newBalance);
        assertEquals(30, acc.getBalance());
    }

    @Test
    void transferTo() {
        Account acc1 = new Account("A001", "Juan", 100);
        Account acc2 = new Account("A002", "Ana", 50);

        int newBalance = acc1.transferTo(acc2, 40);
        assertEquals(60, newBalance);
        assertEquals(60, acc1.getBalance());
        assertEquals(90, acc2.getBalance());

        // intentar transferir más que el balance
        newBalance = acc1.transferTo(acc2, 100);
        assertEquals(60, newBalance);
        assertEquals(60, acc1.getBalance());
        assertEquals(90, acc2.getBalance());
    }

    @Test
    void testToString() {
        Account acc = new Account("A001", "Juan", 50);
        String expected = "Account[id=A001,name=Juan,balance=50]";
        assertEquals(expected, acc.toString());
    }
}