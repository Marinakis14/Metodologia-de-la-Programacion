package Practica3_HerenciaDeClases.ej2.PersonAndSubclases;

public class Person {

    //private instance variables
    private String name;
    private String address;

    //Constructors

    /**
     * Constructs a Person instance with the given name and address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable address
    public String getAddress() {
        return address;
    }

    //Setter for instance variable address
    public void setAddress(String adress) {
        this.address = adress;
    }

    /**
     * Returns a self-descriptive string of this instance in the form of Person[name=?,address=?]
     */
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }

}
