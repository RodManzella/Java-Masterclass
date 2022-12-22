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

    public void makeNoise(){
        bark();
        System.out.println();
    }

    @Override
    public void move(String speed){
        super.move(speed);
        System.out.println("Dogs walk, run and wag their tail");

        if(speed == "slow"){
            walk();
            wagTail();
        }else{
            run();
            bark();
        }
        System.out.println();
    }

    // the bark method will be private, because i´m gonna call it from the move method. This is a reminder that not all methods need to
    // be exposed, especially if you only intend them to be called internally from the current class.

    private void bark(){
        System.out.println("Woof! ");
    }

    private void run(){
        System.out.println("Dog running! ");
    }

    private void walk(){
        System.out.println("Dog walking");
    }

    private void wagTail(){
        System.out.println("Tail wagging");
    }

    

    

    
}

// Using extends specifies the superclass (or the parent class) of the class we´re declaring.
// We can say Dog is a subclass, or child class, of animal.
// We can say Animal is a parent, or super class, of Dog.
// A class can specify one, and only one class in it extends clause.

// You´ll remember we used the keyword this, followed by parentheses and parameters, as a way to call another constructor in the same class.
// Well, super parentheses is similar to that. It´s a way to call the constructor on the parent class, or super class. Here, we´re calling
// Animal´s constructor by using the keyword super, and then parentheses
