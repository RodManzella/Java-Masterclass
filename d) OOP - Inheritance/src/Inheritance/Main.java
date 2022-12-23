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

        Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");
        
        
    }

    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        // The toString method that was called in the doAnimalStuff method, of the main class, didn´t acutally call the Animal toString method.
        // It called the Dog toString method, when animal is an instance of a Dog.
        // We told this method that we were dealing with an animal class, and we called the toString method, which is declared as method
        // on Animal.
        // At run time, Java figures out the Animal object is even more specific than Animal, it´s really a Dog, and it actually calls the 
        // toString method on Dog(if one exists on Dog).
        // If the toString method doesn´t exist on Dog, that´s no problem, because then it just uses the toString method on Animal.

        System.out.println("_ _ _ _");
        // this method is static because we wanna call it from the main method.
    }
}
