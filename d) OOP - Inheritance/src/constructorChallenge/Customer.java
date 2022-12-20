package constructorChallenge;

public class Customer{

    private String name;
    private double limit;
    private String email;

    

    public Customer(){
        this("Standard",  "Unknown@mail.com");
    }

    public Customer(String name, String email){
        this(name, 1000, email);
    }

    public Customer(String name, double limit, String email){
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public double getLimit(){
        return limit;
    }

    public String getEmail(){
        return email;
    }


}

// Create a new class called Customer, with three fields:
    // name
    // credit limit
    // email address


// create the getter methods only, for each field. You don´t need to create the setters.

// create 3 constructors for this class:
    // First, create a constructor for all three fields which assign the arguments directly to the instance fields.
    // Second, create a no args constructor that calls another constructor, passing some literal values for each argument.
    // And lastly, create a constructor with just the name and email parameters, which also calls another constructor.