package Practica2_ComposicionAgregacion.ej5.ClienteyPrueba;

public class Customer {

    //private instance variables
    private int id;
    private String name;
    private char gender;

    //Constructors

    /**
     * Constructs a Customer instance with the given id, name and discount
     */
    public Customer(int id, String name, char gender) { //Hemos deducido que hay un error en la practica ya que pone que el constructor tenga la variable discount en vez de la variable gender y lo hemos cambiado a gender
        this.id = id;
        this.name = name;
        this.gender = gender;
    }

    //Getter for instance variable id
    public int getId() {
        return id;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable gender
    public char getGender() {
        return gender;
    }

    /**
     * Return a self-descriptive string of this instance in the form of name(id)
     */
    public String toString() {
        return name + "(" + id + ")";
    }

}
