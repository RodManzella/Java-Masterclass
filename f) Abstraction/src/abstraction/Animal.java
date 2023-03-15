package abstraction;

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

    public abstract void makeNoise();

    
}
