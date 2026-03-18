package Practica6_PolimorfirsmoClasesAbstractasEInterfaces.ej7.ImplementacionAlternativa;

public class CodigoDado {

    abstract public class Animal {
        abstract public void greeting();
    }

    public class Cat extends Animal {
        @Override
        public void greeting() {
            System.out.println("Meow!");
        }
    }

    public class Dog extends Animal {
        @Override
        public void greeting() {
            System.out.println("Woof!");
        }

        public void greeting(Dog another) {
            System.out.println("Woooooooooof!");
        }
    }

    public class BigDog extends Dog {
        @Override
        public void greeting() {
            System.out.println("Woow!");
        }

        @Override
        public void greeting(Dog another) {
            System.out.println("Woooooowwwww!");
        }
    }

    /**
     * El diagrama de clases UML es igual al que viene dado en el apartado 6.6 cambiando el nombre de todos los
     * metodos greets() a greeting(), eliminando el ultimo metodo greets() de BigDog [greets(another:BigDog):void]
     * y cambiando ligeramente algunos de los mensajes que se muestran por pantalla de los metodos (Ej: Wooow -> Woow)
     */

}
