package Practica2_ComposicionAgregacion.ej5.ClienteyPrueba;

public class TestCustomerAndAccount {

    public static void main(String[] args) {
        // 1. Probar la clase Customer
        Customer c1 = new Customer(101, "Adrian", 'm');
        System.out.println("--- Test Customer ---");
        System.out.println(c1); // name(id)
        System.out.println("customer id: " + c1.getId());
        System.out.println("customer name: " + c1.getName());
        System.out.println("customer gender: " + c1.getGender());

        // 2. Probar la clase Account con constructor de 3 parámetros
        Account a1 = new Account(88, c1, 999.9);
        System.out.println("\n--- Test Account ---");
        System.out.println(a1); // toString() -> name(id) balance=$999.90

        a1.setBalance(500.0);
        System.out.println(a1);
        System.out.println("account id: " + a1.getId());
        System.out.println("customer: " + a1.getCustomer()); // Customer toString
        System.out.println("balance: " + a1.getBalance());
        System.out.println("customer's name: " + a1.getCustomerName());

        // 3. Probar métodos deposit() y withdraw()
        System.out.println("\n--- Test Transactions ---");

        // El metodo deposit devuelve 'this', así que podemos encadenar o llamar directo
        a1.deposit(100.1);
        System.out.println("After deposit 100.1: " + a1.getBalance());

        a1.withdraw(200.0);
        System.out.println("After withdraw 200.0: " + a1.getBalance());

        // Probar retiro que excede el saldo
        System.out.print("Trying to withdraw 1000.0: ");
        a1.withdraw(1000.0); // Debería imprimir el mensaje de error
        System.out.println("Balance remains: " + a1.getBalance());

        // 4. Probar constructor de 2 parámetros (balance por defecto 0.0)
        Customer c2 = new Customer(102, "Marta", 'f');
        Account a2 = new Account(99, c2);
        System.out.println("\nAccount 2 (initial): " + a2);
        a2.deposit(50.0).withdraw(10.0); // Ejemplo de encadenamiento (method chaining)
        System.out.println("Account 2 after chain: " + a2);
    }

}
