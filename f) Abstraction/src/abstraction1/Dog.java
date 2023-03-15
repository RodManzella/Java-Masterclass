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
        
        if(speed.equals("slow")){
            System.out.print(type + " walking");
        }else{
            System.out.println(type + " running");
        }
    }

    @Override
    public void makeNoise() {
        
        if(type == "Wolf"){ 
            System.out.print("Howling!");
             // Here we can directly acess type, a field on the abstract class.
             // because we made the field "type" protected. We didn´t create any getters or setters on the Animal class.
             // And this protected modifier let´s subclasses use the field directly, as we show in this if condition.
        }else{
            System.out.print("Woof!");
        }
    }
    
    
}
