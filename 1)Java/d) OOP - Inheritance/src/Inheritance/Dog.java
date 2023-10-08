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
        if(type == "Wolf"){
            System.out.println("Aw wooo!");
        }else{
            bark();
        }

        // In this case, where we´re referencing type, we get a compiler error. This is because type has private acess in Animal.
        // But type is one of the fields Inherited by Dog.
        // Yes, but because type is private on Animal, no other classes, not even subclasses, can acess or use this field in its own methods.
        // We´ve said there´s a modifier that allows acess for subclasses, and that´s the protected modifier.
        // What this modifier says is, let any class that is a subclass acess this field. This is conditional encapsulation.
        // We´re allowing some limited acess to our internal fields, and that´s to subclasses.
        // Protected acess also means that any classes in the same package, will also have acess.
        // Notice here that we simply just reference type here. We didn´t add any other qualifier, not this, or super, and we didn´t have
        // to call type from a different instance of Dog.
        // This is another advantage of Inheritance, for fields and methods that aren´t private.
        // They can be acessed directly, as if they really were declared on the subclass itself.
        // java first looks on the subclass for a method or field with that name, then it´ll go up the inheritance tree, looking for a match.
        // Let´s quickly test this, by creating a wolf in the main Method of the Main class.
        
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
