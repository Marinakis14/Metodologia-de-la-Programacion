package Practica2_ComposicionAgregacion.ej3.NuevasModificaciones;

public class Book {

    //private instance variables
    public String isbn;
    private String name;
    private Author author;
    private double price;
    private int qty = 0;

    //Constructors

    /**
     * Constructs a Book instance with the given name, author, price and isbn
     */
    public Book(String isbn, String name, Author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    /**
     * Constructs a Book instance with the given name, author, price and qty
     */
    public Book(String isbn, String name, Author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //Getter for instance variable isbn
    public String getIsbn() {
        return isbn;
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

    public String getAuthorName() {
        return author.getName();
    }

    /**
     * Return a self-descriptive string of this instance in the form of Book[isbn=?,name=?,Author[name=?,email=?],price=?,qty=?]
     */
    public String toString() {
        return "Book[isbn=" + isbn + ",name=" + name + ",Author[name=" + author.getName() + ",email=" + author.getEmail() + "],price=" + price + ",qty=" + qty + "]";
    }
}
