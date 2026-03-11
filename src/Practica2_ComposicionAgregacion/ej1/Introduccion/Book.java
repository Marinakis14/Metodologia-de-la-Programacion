package Practica2_ComposicionAgregacion.ej1.Introduccion;

public class Book {

    //private instance variables
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    //Constructors

    /**
     * Constructos a Book instance with the given name, author and price
     */
    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * Constructos a Book instance with the given name, author, price and qty
     */
    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable author
    public Author getAuthor() {
        return author;
    }

    //Getter for instance variable price
    public double getPrice() {
        return price;
    }

    //Getter for instance variable qty
    public int getQty() {
        return qty;
    }

    //Setter for instance variable price
    public void setPrice(double price) {
        this.price = price;
    }

    //Setter for instance variable qty
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?]
     */
    public String toString() {
        return "Book[name=" + name + ",Author[name=" + author.getName() + ",email=" + author.getEmail() + ",gender=" + author.getGender() + "],price=" + price + ",qty=" + qty + "]";
    }
}
