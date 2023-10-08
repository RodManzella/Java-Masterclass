package carClass;

public class Car{
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public String getMake(){  // When writing methods that use non static fields, your method can´t be declared static.
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {  //standard prefix for boolean fields ("is")
        return convertible;
    }

    public void setMake(String make){  
        if(make == null) this.make = "Unknown";

        String lowerCaseMake = make.toLowerCase();      
        switch(lowerCaseMake){
            case "holden", "porsche","tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        } 
        // So you can see how it´s very useful to have this type of functionality, the validation.
        // So what can you do with the setter methods is, you can set up all the rules related to that class, what is valid, and what is not
        // valid. You can have all that functionality set up, within the car class itself, so that these rules are in place as we´re creating
        // the object. What that means is, the code that´s creating objects, can´t make invalid objects, so to speak. In other words, it can´t
        // assign a make, that we haven´t defined  as valid in our car class. So that´s the reason, and that´s really the whole concept of
        // encapsulation, is that we´re not allowing people to acess the field directly. We force them to go through a controlled way of setting
        // up the data on the object. Using a setter method, we can actually make sure that the data in our objects is valid data.
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors +" -Door "+
        color + " "+
        make + " "+
        model + " "+
        (convertible ? "Convertible":  ""));
    }


    // Here we created five fields.
    // These are fields, because they are defined in the class´s code block, or the body of the class, and not in a method.
    // When we create an object from this class, then the values we assign to these fields represent the state of the object.
    // Unlike local variables, class variables should have some type of acess modifier declared for it.
    // If you don´t declare one, Jaca declares the default one(package private), implicitly.

    // So, here we´ve set the acess modifier to be private in all cases, which we´ve said will help us encapsulate the class.
    // We´ll want to control acess to these fields, and this starts by making them private. Later we´ll add the methods to acess them.
    // The other thing you might have noticed, is that we´re not actually assigning any values yet.
    // This is because, at this point, we don´t know what these values might be, and they´ll likely be different for each instance anyway.
    // If we were creating creating a real application, we´d likely have a lot more fields, but we´ll keep this simple to start with.
    // Let´s add a method now that will print out this information about the car object.
    // We´ll call this method describeCar, and make the method public.
    // This method is not static, because we´re acessing instance fields on the class.
    // Methods, unlike fields, will often be public, because we want to give users a way to interact with the object.

    
 
}


// what we need to do is create some variables, that are part of this class.
    // Now to date, you´ve seen variables used inside a method or code block.
    // And these were called local variables, because they were local to, or actually belonged to, that method or code block.But
    // we couldn´t acess those local variables outside of the method, or block we declared them. Classes allow us to create variables
    // that can be seen or acessible, by any code block within that class. But we can also allow acess from outside the class itself
    // When we´re designing our class, there are some things we want the public to know, and some things that aren´t necessary for the
    // public to know. We can have a public interface. This is only the information the oustide world needs to know, to use our class.
    // But we´ll also have a non-public interface. This information we may want share, but not always, and not with everyone. We may need
    // to share some information with our own company and other departments, while other data might need to be shared with our manufactureers
    // and dealders, but not with the public. Java gives us the ability to have this kind of control, by specifyng different acess modifiers
    // for each member in a class. (more information about acess modifiers for class member in the txt file)