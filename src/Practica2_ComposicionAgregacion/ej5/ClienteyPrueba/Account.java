package Practica2_ComposicionAgregacion.ej5.ClienteyPrueba;

public class Account {

    //private instance variables
    private int id;
    private Customer customer;
    private double balance = 0.0;

    //Constructors

    /**
     * Constructs an Account instance with the given id, customer and balance
     */
    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    /**
     * Constructs an Account instance with the given id and customer
     */
    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    //Getter for instance variable id
    public int getId() {
        return id;
    }

    //Getter for instance variable customer
    public Customer getCustomer() {
        return customer;
    }

    //Getter for instance variable balance
    public double getBalance() {
        return balance;
    }

    //Setter for instance variable balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Return a self-descriptive string of this instance in the form of name(id) balance=$xxx.xx
     */
    public String toString() {
        return customer.toString() + " balance=$" + String.format("%.2f", balance);
    }

    //Getter for Customer instance variable name
    public String getCustomerName() {
        return customer.getName();
    }

    //Adds amount to balance
    public Account deposit(double amount) {
        this.balance += amount;
        return this;
    }

    //subtracts amount to balance or shows a message that the withdrawn amount exceeds the current balance
    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("amount withdrawn exceeds the current balance!");
        }
        return this;
    }

}
