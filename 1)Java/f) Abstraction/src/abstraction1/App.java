package abstraction1;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        // we cannot create an instance of an abstract class

        // Animal animal = new Animal("animal", "big", 100);

        Dog dog = new Dog("Wolf", "big", 100);
        dog.makeNoise();
        doAnimalStuff(dog);
        // See that beven

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(new Dog("German Shepard", "big", 150));
        animals.add(new Fish("GoldFish", "small", 1));
        animals.add(new Fish("Barracuda", "big", 75));
        animals.add(new Dog("Pug", "small", 20));
        // if we used Dog or Fish we´d need to array lists
        // Again this feature is not unique to an abstract class, it´s just a benefit of inheritance
        // In this code, we use the add method on the array list, and can pass any instance that inherits from animal.
        // It´s nice that we can have an array list of an abstracted type.
        // At runtime, instances that inherit from that abstract class, can use polymorphism to execute code specific to the concrete type.
        animals.add(new Horse("Clydestale", "large", 1000));

        for (Animal animal: animals){  // Iterating through array list
            doAnimalStuff(animal);

            if(animal instanceof Mammal currentMammal){
                currentMammal.shedHair();
            }
        }



    }

    private static void doAnimalStuff(Animal animal){
        
        animal.makeNoise();
        animal.move("slow");

        // I´ve said that you can´t create an instance of Animal, because it´s abstract.
        // That is true, but that doesn´t prevent us from using that type in methods, declarations, and lists.
        // In fact, this is what makes code the code so flexible and scalable.
        // The abstract class told the world that animals move and make noise, so anyone can use an Animal class, and call those
        // methods on the obejct that it gets a runtime.
        // And regardless of what that object is, as long as it´s an Animal, meaning it has the Animal class in it´s hierarchy, this code will continue
        // to work.
        // This abstraction promoting polymorphism technique.
        // Even though we called move on the Animal class, in the Main class´s doAnimalStuff method, and that class didn´t have any code in it
        // for the move method, we get Wolf Walking
        // this is really calling Dog´s move method, because we passed a dog instance do this method.


    }

    // What you want to appreciate, when you code, is that writting code using the more generic abstract type, saves you a lot
    // of effort.
    
    
        
    
}
