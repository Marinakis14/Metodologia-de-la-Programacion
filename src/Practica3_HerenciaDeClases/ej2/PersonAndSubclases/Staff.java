package Practica3_HerenciaDeClases.ej2.PersonAndSubclases;

public class Staff extends Person {

    //private instance variables
    private String school;
    private double pay;

    //Constructors

    /**
     * Constructs a Staff instance with the given name, address, school and pay
     */
    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    //Getter for instance variable school
    public String getSchool() {
        return school;
    }

    //Getter for instance variable pay
    public double getPay() {
        return pay;
    }

    //Setter for instance variable school
    public void setSchool(String school) {
        this.school = school;
    }

    //Setter for instance variable pay
    public void setPay(double pay) {
        this.pay = pay;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Staff[Person[name=?,address=?],school=?,pay=?]
     */
    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }

}
