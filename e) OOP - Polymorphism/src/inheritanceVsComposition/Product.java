package inheritanceVsComposition;

public class Product {
    
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model, String manufacturer) {
        this.model = model;
        this.manufacturer = manufacturer;
    }

    // remember, only one class can be publicm so we´ll omit the acess modifier for these classes.
}

class Monitor extends Product{

    public Monitor(String model, String manufacturer) {
        super(model, manufacturer);
    }
}


class Motherboard extends Product{

    public Motherboard(String model, String manufacturer) {
        super(model, manufacturer);
    }
}


class ComputerCase extends Product{

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }
}

// Monitor, Motherboard and ComputerCase are all types of product. And that´s essentially what inheritance is.
