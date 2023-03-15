package abstraction1;

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

    
}
