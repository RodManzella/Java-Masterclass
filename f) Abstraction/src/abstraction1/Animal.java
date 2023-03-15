package abstraction1;

abstract class Mammal extends Animal{

    public Mammal(String type, String size, double weight) {
        super(type, size, weight);
    }
    // we weren´t forced to create implementations for the move and makeNoise methods, like we were
    // for the Dog and Fish class. Why not?

}


public abstract class Animal {
    
    protected String type;  // subclasses can acess type directly,w ithout a getter.
    private String size;
    private double weight;


    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    public abstract void move(String speed);

    // use of abstract and private modifiers is an illegal combination. When we use abstract we´re saying subclasses
    // have to declare this method, but if it´s private, the subclass wouldn´t even see it.

    public abstract void makeNoise();

    // An abstract method can also have concrete methods.
    // Let´s say we wanted a helper method on Animal, that printed out both the instances class name, and it´s type.

    public final String getExplititType(){  // final: we don´t want subclasses to Override this method
        return getClass().getSimpleName()+" " + "("+type +")";
    }
    // And like any method on a parent class, that´s a method we can use in the subclasses.

    
}
