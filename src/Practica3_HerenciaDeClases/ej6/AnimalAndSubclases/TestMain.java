package Practica3_HerenciaDeClases.ej6.AnimalAndSubclases;

public class TestMain {

    static void main(String[] args) {

        Animal animal = new Animal("Pajaro");
        System.out.println(animal);
        Mammal mammal = new Mammal("Mono");
        System.out.println(mammal);
        Cat cat = new Cat("Misifu");
        System.out.println(cat);
        cat.greets();
        Dog dog = new Dog("Rambo");
        System.out.println(dog);
        dog.greets();
        Dog dog2 = new Dog("Botas");
        dog.greets(dog2);

        //No se puede hacer una llamada a greets() de un animal ni de un mammal ya que el metodo greets esta en las
        //subclases de mammal y por tanto la clase mammal no puede acceder a dicho metodo y todavia menos la clase animal

    }

}
