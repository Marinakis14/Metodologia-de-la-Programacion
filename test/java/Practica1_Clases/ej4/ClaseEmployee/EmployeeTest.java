package Practica1_Clases.ej4.ClaseEmployee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class EmployeeTest {

    @Test
    void getId() {
        Employee e = new Employee(1, "John", "Doe", 1000);
        assertEquals(1, e.getId());
    }

    @Test
    void getFirstName() {
        Employee e = new Employee(2, "Jane", "Smith", 2000);
        assertEquals("Jane", e.getFirstName());
    }

    @Test
    void getLastName() {
        Employee e = new Employee(3, "Alice", "Brown", 3000);
        assertEquals("Brown", e.getLastName());
    }

    @Test
    void getName() {
        Employee e = new Employee(4, "Bob", "White", 1500);
        assertEquals("Bob White", e.getName());
    }

    @Test
    void getSalary() {
        Employee e = new Employee(5, "Tom", "Green", 2500);
        assertEquals(2500, e.getSalary());
    }

    @Test
    void setSalary() {
        Employee e = new Employee(6, "Emma", "Black", 1800);
        e.setSalary(2000);
        assertEquals(2000, e.getSalary());
    }

    @Test
    void getAnnualSalary() {
        Employee e = new Employee(7, "Liam", "Gray", 1000);
        assertEquals(12000, e.getAnnualSalary());
    }

    @Test
    void raiseSalary() {
        Employee e = new Employee(8, "Olivia", "Blue", 1000);
        int newSalary = e.raiseSalary(10); // aumento 10%
        assertEquals(1100, newSalary);
        assertEquals(1100, e.getSalary());
    }

    @Test
    void testToString() {
        Employee e = new Employee(9, "Noah", "Red", 3000);
        assertEquals("Employee[id=9,name='Noah Red,salary=3000]", e.toString());
    }
}