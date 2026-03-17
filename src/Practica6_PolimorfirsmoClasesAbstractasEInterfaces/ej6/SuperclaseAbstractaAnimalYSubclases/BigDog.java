package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej6.SuperclaseAbstractaAnimalYSubclases;

// BigDog class that extends Dog
public class BigDog extends Dog {

    // Constructor
    public BigDog(String name) {
        super(name);
    }

    // Override the greets() method
    @Override
    public void greets() {
        System.out.println("Wooow");
    }

    // Override the method that greets another Dog
    @Override
    public void greets(Dog another) {
        System.out.println("Wooooooow");
    }

    // Overloaded method for greeting another BigDog
    // More specific version of the method
    public void greets(BigDog another) {
        System.out.println("Wooooooooow");
    }
}