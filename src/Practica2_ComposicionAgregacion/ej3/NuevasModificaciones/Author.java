package Practica2_ComposicionAgregacion.ej3.NuevasModificaciones;

public class Author {
    //private instance variables
    private String name;
    private String email;

    //Constructors
    /** Constructs an Author instance with the given name and email */
    Author(String name, String email) {
        this.name = name;
        this.email = email;
    }

    //Getter for instance variable name
    public String getName() {
        return name;
    }

    //Getter for instance variable email
    public String getEmail() {
        return email;
    }

    //Setter for instance variable email
    public void setEmail(String email) {
        this.email = email;
    }

    /** Return a self-descriptive string of this instance in the form of Author[name=?,email=?] */
    public String toString() {
        return "Author[name=" + name + ",email=" + email + "]";
    }
}
