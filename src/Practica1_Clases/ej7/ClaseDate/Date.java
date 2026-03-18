package Practica1_Clases.ej7.ClaseDate;

public class Date {
    //private instance variables
    private int day;
    private int month;
    private int year;

    /**
     * Constructs a Date instance with the given day, month, and year
     */
    Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Getter for instance variable day
    public int getDay() {
        return day;
    }

    // Getter for instance variable month
    public int getMonth() {
        return month;
    }

    // Getter for instance variable year
    public int getYear() {
        return year;
    }

    // Setter for instance variable day
    public void setDay(int day) {
        this.day = day;
    }

    // Setter for instance variable month
    public void setMonth(int month) {
        this.month = month;
    }

    // Setter for instance variable year
    public void setYear(int year) {
        this.year = year;
    }

    // Setter for instance Date
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    /**
     * Return a self-descriptive string of this instance in the form of dd/mm/yyyy
     */
    public String toString() {
        return String.format("%02d/%02d/%d", day, month, year);

    }
}
