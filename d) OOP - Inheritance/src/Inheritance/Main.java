package Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "Slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");

        // We´re passing a dog object as the method argument, when the type was declared as an Animal.
        // Why is this ok? It works because Dog inherits from Animal, it´s a type of animal, as we´ve said, and where that becomes really
        // important, is in code like this.
        // We can pass a dog instance to any method that takes an animal.

        Dog yorkie = new Dog("Yorkie", 15);    // chamando construtor com 2 parâmetros
        doAnimalStuff(yorkie, "fast");

        Dog retriever =  new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");
        
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
        // this method is static because we wanna call it from the main method.
    }
}
