package inheritanceVsComposition;

public class PersonalComputer extends Product {
    
    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherboard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor,
            Motherboard motherboard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public ComputerCase getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    

    
}
// You can use a combination of composition and inheritance to create your model, as we´re doing here.

// This will be our personal computer, and we´ve said it inherits from Product.
// But it also has 3 fields, which are classes, these are monitor, motherboard, and computerCase.

// And you can see the obvious advantage here. Because if you´re using the extends option to inherit, Java only lets you inherit from one class
// at a time. You could see that we´d run into difficulties and limitations quite quickly, if our only tool was inheritance.

// In this case, what we´ve said is, the Personal computer consists of these three other classes, namely the computer case, the monitor, and
// the motherboard.
