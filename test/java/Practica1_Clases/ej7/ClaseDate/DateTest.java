package Practica1_Clases.ej7.ClaseDate;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DateTest {

    @Test
    void getDay() {
        Date date = new Date(15, 8, 2023);
        assertEquals(15, date.getDay());
    }

    @Test
    void getMonth() {
        Date date = new Date(15, 8, 2023);
        assertEquals(8, date.getMonth());
    }

    @Test
    void getYear() {
        Date date = new Date(15, 8, 2023);
        assertEquals(2023, date.getYear());
    }

    @Test
    void setDay() {
        Date date = new Date(15, 8, 2023);
        date.setDay(20);
        assertEquals(20, date.getDay());
    }

    @Test
    void setMonth() {
        Date date = new Date(15, 8, 2023);
        date.setMonth(12);
        assertEquals(12, date.getMonth());
    }

    @Test
    void setYear() {
        Date date = new Date(15, 8, 2023);
        date.setYear(2025);
        assertEquals(2025, date.getYear());
    }

    @Test
    void setDate() {
        Date date = new Date(15, 8, 2023);
        date.setDate(1, 1, 2020);
        assertEquals(1, date.getDay());
        assertEquals(1, date.getMonth());
        assertEquals(2020, date.getYear());
    }

    @Test
    void testToString() {
        Date date = new Date(5, 3, 2023);
        assertEquals("05/03/2023", date.toString());

        Date date2 = new Date(15, 11, 2023);
        assertEquals("15/11/2023", date2.toString());
    }
}