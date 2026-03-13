package Practica2_ComposicionAgregacion.ej2.LibroConMultiplesAutores;

public class Book {

    //private instance variables
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    //Constructors

    /**
     * Constructs a Book instance with the given name, author and price
     */
    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    /**
     * Constructs a Book instance with the given name, author, price and qty
     */
    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable author
    public Author[] getAuthors() {
        return authors;
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

    public String getAuthorNames() {
        String cadenaAutores = "";
        for (int i = 0; i < authors.length; i++) {
            cadenaAutores += authors[i].getName();
            if (i < authors.length - 1) {  // Para no poner una coma al final tambien, solo entre un autor y otro
                cadenaAutores += ", ";
            }
        }
        return cadenaAutores;
    }

    /**
     * Return a self-descriptive string of this instance in the form of Book[name=?,Author[name=?,email=?,gender=?],price=?,qty=?]
     */
    public String toString() {
        String cadena = "Book[name=" + name + ",authors={";
        for (int i = 0; i < authors.length; i++) {
            cadena += authors[i].toString(); // Reutilizamos el toString de Author
            if (i < authors.length - 1) {  // De nuevo para no añadir una coma al final, solo entre la informacion de un autor y otro
                cadena += ",";
            }
        }
        cadena += "},price=" + price + ",qty=" + qty + "]";
        return cadena;
    }
}
