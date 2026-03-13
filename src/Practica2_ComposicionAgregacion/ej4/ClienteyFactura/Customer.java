package Practica2_ComposicionAgregacion.ej4.ClienteyFactura;

public class Customer {

    //private instance variables
    private int id;
    private String name;
    private int discount;

    //Constructors
    /** Constructs a Customer instance with the given id, name and discount */
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    //Getter for instance variable id
    public int getId() {
        return id;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable discount
    public int getDiscount() {
        return discount;
    }

    //Setter for instance variable discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    /** Return a self-descriptive string of this instance in the form of name(id)(discount%) */
    public String toString() {
        return name + "(" + id + ")(" + discount + "%)";
    }
}
