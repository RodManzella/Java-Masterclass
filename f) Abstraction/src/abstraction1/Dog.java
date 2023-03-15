package abstraction1;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);
        // Even though our abstract class would never be instantiated, a constructor on it must be called by every subclass constructor.
        // This means we´re forcing subclasses to also use this constructor.
        // Are you starting to get a picture of the abstract class, as a much stricter parent?
        // The abstract class can make it´s subclasses follow its rules.
    }

    @Override
    public void move(String speed) {
        
    }

    @Override
    public void makeNoise() {
        
    }
    
    
}
