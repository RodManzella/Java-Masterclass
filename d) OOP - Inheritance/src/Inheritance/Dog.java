package Inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    
    public Dog(){
        super("Mutt", "Big", 50);
    }

    public Dog(String type, double weight){
        this(type, weight, "Perky", "Curled");
    }


    public Dog(String type,  double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small": (weight < 35 ? "medium": "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog [earShape=" + earShape + ", tailShape=" + tailShape + "]" + super.toString();
    }

    

    

    
}

// Using extends specifies the superclass (or the parent class) of the class we´re declaring.
// We can say Dog is a subclass, or child class, of animal.
// We can say Animal is a parent, or super class, of Dog.
// A class can specify one, and only one class in it extends clause.

// You´ll remember we used the keyword this, followed by parentheses and parameters, as a way to call another constructor in the same class.
// Well, super parentheses is similar to that. It´s a way to call the constructor on the parent class, or super class. Here, we´re calling
// Animal´s constructor by using the keyword super, and then parentheses
