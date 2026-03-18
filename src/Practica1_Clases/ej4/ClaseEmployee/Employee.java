package Practica1_Clases.ej4.ClaseEmployee;

public class Employee {
    //private instance variable, not accessible from outside this class
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    /**
     * Constructs an Employee instance with the given id, firstName, lastName and salary
     */
    Employee(int id, String fistName, String lastName, int salary) {
        this.id = id;
        this.firstName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for instance variable id
    public int getId() {
        return id;
    }

    // Getter for instance variable fistName
    public String getFirstName() {
        return firstName;
    }

    // Getter for instance variable lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for instance variable fistName and lastName
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter for instance variable salary
    public int getSalary() {
        return salary;
    }

    // Setter for instance variable salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    //Getter for instance variable salary over one year
    public int getAnnualSalary() {
        return salary * 12;
    }

    //Increase the salary by the percent and return the new salary
    public int raiseSalary(int percent) {
        this.salary = salary * (percent + 100) / 100;
        return salary;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?]
     */
    public String toString() {
        return "Employee[id=" + id + ",name='" + firstName + " " + lastName + ",salary=" + salary + ']';
    }
}
