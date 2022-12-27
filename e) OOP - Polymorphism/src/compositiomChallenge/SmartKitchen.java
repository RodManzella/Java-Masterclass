package compositiomChallenge;

public class SmartKitchen {
    private Refrigerator refrigerator;
    private DishWasher dishWasher;
    private CoffeeMaker coffeeMaker;

    
    public SmartKitchen(){
        refrigerator = new Refrigerator();
        dishWasher = new DishWasher();
        coffeeMaker = new CoffeeMaker();
    }

    // When we create a smart kitchen, we´re just going to instantiate our own set of appliances, by creating our own no arguments
    // constructor. This means that any code creating a SmartKitchen, won´t have to create the appliances individually, like we did with
    // the personal computer example, in the previous video.

    

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }



    public DishWasher getDishWasher() {
        return dishWasher;
    }



    public CoffeeMaker getCoffeeMaker() {
        return coffeeMaker;
    }



    public void addWater(){
        coffeeMaker.setHasWorkToDo(true);
    }

    public void pourMilk(){
        refrigerator.setHasWorkToDo(true);
    }

    public void loadDishWasher(){
        dishWasher.setHasWorkToDo(true);
    }
}
