package Practica3_HerenciaDeClases.ej2.PersonYsubclases;

public class Student extends Person {

    //private instance variables
    private String program;
    private int year;
    private double fee;

    /**
     * Constructs a Person instance with the given name, address, program, year and fee
     */
    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    //Getter for instance variable program
    public String getProgram() {
        return program;
    }

    //Getter for instance variable year
    public int getYear() {
        return year;
    }

    //Getter for instance variable fee
    public double getFee() {
        return fee;
    }

    //Setter for instance variable program
    public void setProgram(String program) {
        this.program = program;
    }

    //Setter for instance variable fee
    public void setFee(double fee) {
        this.fee = fee;
    }

    //Setter for instance variable year
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Returns a self-descriptive string of this class in the form of Student[Person[name=?,address=?],program=?,year=?,fee=?]
     */
    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }

}
