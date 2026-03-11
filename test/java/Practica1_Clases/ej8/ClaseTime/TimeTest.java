package Practica1_Clases.ej8.ClaseTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeTest {

    @Test
    void getHour() {
        Time time = new Time(12, 30, 45);
        assertEquals(12, time.getHour());
    }

    @Test
    void getMinute() {
        Time time = new Time(12, 30, 45);
        assertEquals(30, time.getMinute());
    }

    @Test
    void getSecond() {
        Time time = new Time(12, 30, 45);
        assertEquals(45, time.getSecond());
    }

    @Test
    void setHour() {
        Time time = new Time(12, 30, 45);
        time.setHour(15);
        assertEquals(15, time.getHour());
    }

    @Test
    void setMinute() {
        Time time = new Time(12, 30, 45);
        time.setMinute(50);
        assertEquals(50, time.getMinute());
    }

    @Test
    void setSecond() {
        Time time = new Time(12, 30, 45);
        time.setSecond(20);
        assertEquals(20, time.getSecond());
    }

    @Test
    void setTime() {
        Time time = new Time(12, 30, 45);
        time.setTime(1, 2, 3);
        assertEquals(1, time.getHour());
        assertEquals(2, time.getMinute());
        assertEquals(3, time.getSecond());
    }

    @Test
    void testToString() {
        Time time1 = new Time(5, 7, 9);
        assertEquals("05:07:09", time1.toString());

        Time time2 = new Time(12, 30, 45);
        assertEquals("12:30:45", time2.toString());
    }

    @Test
    void nextSecond() {
        Time time = new Time(23, 59, 58);
        time.nextSecond();
        assertEquals("23:59:59", time.toString());

        time.nextSecond(); // pasa a 00:00:00
        assertEquals("00:00:00", time.toString());

        time.nextSecond(); // 00:00:01
        assertEquals("00:00:01", time.toString());
    }

    @Test
    void previousSecond() {
        Time time = new Time(0, 0, 1);
        time.previousSecond();
        assertEquals("00:00:00", time.toString());

        time.previousSecond(); // retrocede a 23:59:59
        assertEquals("23:59:59", time.toString());

        time.previousSecond(); // 23:59:58
        assertEquals("23:59:58", time.toString());
    }
}