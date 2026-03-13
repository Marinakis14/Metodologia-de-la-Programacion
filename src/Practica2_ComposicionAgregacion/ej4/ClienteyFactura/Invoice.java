package Practica2_ComposicionAgregacion.ej4.ClienteyFactura;

public class Invoice {

    // private instance variables
    private int id;
    private Customer customer;
    private double amount;

    //Constructors

    /**
     * Constructs an Invoice instance with the given id, customer and amount
     */
    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    //Getter for instance variable id
    public int getId() {
        return id;
    }

    //Getter for instance variable customer
    public Customer getCustomer() {
        return customer;
    }

    //Getter for instance variable amount
    public double getAmount() {
        return amount;
    }

    //Setter for instance variable customer
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    //Setter for instance variable amount
    public void setAmount(double amount) {
        this.amount = amount;
    }

    //Getter for Customer instance variable id
    public int getCustomerId() {
        return customer.getId();
    }

    //Getter for Customer instance variable Name
    public String getCustomerName() {
        return customer.getName();
    }

    //Getter for Customer instance variable discount
    public int getCustomerDiscount() {
        return customer.getDiscount();
    }

    //returns the amount left after adding the customers discount
    public double getAmountAfterDiscount() {
        return (amount * (100 - customer.getDiscount())) / 100;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Invoice[id=?,customer=name(id)(discount%),amount=?]
     */
    public String toString() {
        return "Invoice[id=" + id + ",customer=" + customer.toString() + ",amount=" + amount + "]";
    }
}
