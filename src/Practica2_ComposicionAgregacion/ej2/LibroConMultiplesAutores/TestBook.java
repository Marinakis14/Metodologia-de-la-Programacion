package Practica2_ComposicionAgregacion.ej2.LibroConMultiplesAutores;

public class TestBook {
    public static void main(String[] args) {

        /** Código modificado del otro TestBook con un solo autor */

        // 1. Construir instancias de autores
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
        Author pablito = new Author("Pablito", "pablito@nowhere.com", 'm');
        Author juanita = new Author("Juanita", "juanita@nowhere.com", 'f');

        // 2. Declarar e inicializar el array de autores correctamente
        Author[] authors = {ahTeck, pablito, juanita};

        // 3. Test del constructor de Book
        Book dummyBook = new Book("Java for dummy", authors, 19.95, 99);
        System.out.println(dummyBook); // Llama al toString() que modificamos con el bucle

        // 4. Test Getters y Setters
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());

        // 5. getAuthors() ahora devuelve un array, no un Author individual
        System.out.println("Authors are: " + dummyBook.getAuthorNames());

        // Para imprimir un dato de un autor específico, necesitamos un índice:
        System.out.println("First Author's name is: " + dummyBook.getAuthors()[0].getName());
        System.out.println("First Author's email is: " + dummyBook.getAuthors()[0].getEmail());

        // 6. Test con instancia anónima de array y autor
        Book anotherBook = new Book("more Java",
                new Author[]{new Author("Paul Tan", "paul@somewhere.com", 'm')},
                29.95);
        System.out.println(anotherBook);

        /** Parte añadida que pide la practica */

        // Declare and allocate an array of Authors
        Author[] moreAuthors = new Author[2];
        moreAuthors[0] = new Author("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        moreAuthors[1] = new Author("Paul Tan", "Paul@nowhere.com", 'm');

        // Declare and allocate a Book instance
        Book javaDummy = new Book("Java for Dummy", authors, 19.99, 99);
        System.out.println(javaDummy); // toString()

    }
}