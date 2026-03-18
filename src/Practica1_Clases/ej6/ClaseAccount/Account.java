package Practica1_Clases.ej6.ClaseAccount;

public class Account {
    //private instance variables
    private String id;
    private String name;
    private int balance = 0;

    //Constructors

    /**
     * Constructs an Account instance with the given id and name and default balance
     */
    Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Constructs an Account instance with the given id, name and balance
     */
    Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getter for instance variable id
    public String getId() {
        return id;
    }

    // Getter for instance variable name
    public String getName() {
        return name;
    }

    // Getter for instance variable balance
    public int getBalance() {
        return balance;
    }

    // adds amount to balance and returns balance
    public int credit(int amount) {
        this.balance += amount;
        return balance;
    }

    // subtracts amount from balance or print "amount excceded balance"
    public int debit(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    //transfers amount to the given Account or prints "amount exceeded balance"
    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.balance += amount;
            this.balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Circle[radius=?,color=?]
     */
    public String toString() {
        return "Account[id=" + id + ",name=" + name + ",balance=" + balance + "]";
    }
}
